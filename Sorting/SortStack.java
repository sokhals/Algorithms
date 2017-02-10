import java.util.*;
public class SortStack{
	public SortStack(){
		Stack<Integer> st = new Stack<Integer>();
		st.push(30);st.push(-5);st.push(18);st.push(15);st.push(3);
		sortValues(st);
		System.out.println(st);
	}
	public void sortValues(Stack<Integer> stack){
		if(stack.isEmpty()) return;
		System.out.println(50+30+"Sachin"+40+40);
		int temp = stack.pop();
		sortValues(stack);
		sortStack(stack,temp);
	}
	public void sortStack(Stack<Integer> st, int val){
		if(st.isEmpty() || st.peek()<val){
			st.push(val);
			return;
		}
		int temp = st.pop();
		sortStack(st,val);
		st.push(temp);
	}

	public static void main(String args[]){
		SortStack st = new SortStack(); 
		TreeSet<Data> set = new TreeSet<Data>();
		Data val=null;
		set.add(val);
	}
		
}
class Data{
	String a;
}