import java.util.*;
class Node{
	int rank = 0, val;
	Node parent;
	public Node(int v){
		val = v;
	}
}

class UnionFind{
	Node[] array;
	boolean cycle = false;
	public UnionFind(int val){
		array= new Node[val+1];
	}

	public Node find(int vertex){
		Node node = array[vertex];
		while(node.parent!=null && node.parent!=node)
			node = node.parent;
		
		Node parent = node;
		array[vertex].parent = parent;
		return parent;
	}
	public void union(int a, int b){
		Node p1 = find(a);
		Node p2 = find(b);
		
		if(p1==p2){
			System.out.println("Cycle detected between "+a+" "+b);
			cycle = true;
			return;
		}
		else if(p1.rank>p2.rank){
			p2.parent = p1;
		}else if(p2.rank>p1.rank){
			p1.parent = p2;
		}else{
			p1.parent = p2;
			p2.rank++;
		}

	}
	public void makeSet(int a){
		Node node = new Node(a);
		node.parent = node;
		array[a] = node;
	}
	public void printSubSets(int n){
		HashMap<Node,ArrayList<Integer>> map = new HashMap<Node,ArrayList<Integer>>();
		for(int i=1;i<=n;i++){
			Node parent = find(i);
			ArrayList<Integer> list = new ArrayList<Integer>();
			if(map.containsKey(parent))
				list = map.get(parent);
			list.add(i);
			map.put(parent,list);
		}
		for(Node key:map.keySet())
			System.out.println(key.val+" "+map.get(key));
	}
	public static void main(String ags[]){
		UnionFind uf = new UnionFind(7);
		for(int i=1;i<=7;i++)
			uf.makeSet(i);
		uf.union(1,2);uf.union(1,3);uf.union(2,3);uf.union(5,6);uf.union(5,7);
		uf.printSubSets(7);
	}

}