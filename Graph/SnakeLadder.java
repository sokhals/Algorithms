import java.util.*;
public class SnakeLadder{
	int N = 30 , start = 1;
	int[] ladders = new int[N+1];
	int[] snakes = new int[N+1];
	public static void main(String ars[]){
		SnakeLadder sl = new SnakeLadder();
		sl.buildSnakeLadder();
		int path = sl.findShortestPath();
		System.out.println("Shortest Path Legth: "+path);
	}
	public int findShortestPath(){
		ArrayList<Integer> queue = new ArrayList<Integer>();
		queue.add(1);
		int[] visited = new int[N+1];
		visited[1]= 1;
		int head = 0;
		int[] count = new int[N+1];
		int[] parent = new int[N+1];
		while(head<queue.size()){
			int pos = queue.get(head);
			if(pos==N){
				printPath(parent);
				return count[pos];
			}

			
			head++;
			if(ladders[pos]!=0 && visited[ladders[pos]]==0){
				
				queue.add(ladders[pos]);
				parent[ladders[pos]] = pos;
				count[ladders[pos]] = count[pos];
				visited[ladders[pos]] = 1;
			}else if(snakes[pos]!=0 && visited[snakes[pos]]==0){
				queue.add(snakes[pos]);
				parent[snakes[pos]] = pos;
				count[snakes[pos]] = count[pos];
				visited[ladders[pos]] = 1;
			}else{
				for(int i=pos+1;i<=Math.min(pos+5,N);i++){
					if(visited[i]!=0) continue;
					queue.add(i);
					visited[i] = 1;
					count[i] = count[pos]+1;
					parent[i] = pos;
				}
			}
		}
		return -1;
	}
	public void printPath(int[] parent){
		int node = 30;
		String s="";
		while(node>1){
			s ="->"+node+s;
			node = parent[node];
		}
		System.out.println("1"+s);

		

	}
	public void buildSnakeLadder(){
		ladders[3] =22;ladders[5] =8;
		ladders[11] =26;ladders[20] =29;
		snakes[17] = 4;snakes[19] = 7;
		snakes[21] = 9;snakes[27] = 1;


	}
}