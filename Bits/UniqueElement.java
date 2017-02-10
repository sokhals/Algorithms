import java.util.*;

public class UniqueElement{
	
	public int findUnique(int[] array){
		int[] bits = new int[32];
		for(int i=0;i<array.length;i++){
			int n = array[i];
			int k = 1;
			int j=0;
			while(k<=n){
				if((k&n)>0) bits[j]++;
				k = 1<<k;
				j++;
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int i=31;i>=0;i--){
			if(bits[i]%3!=0) sb.append("1");
			else sb.append("0");
		}
		return Integer.parseInt(sb.toString(),2);
	}
	public static void main(String args[]){
		UniqueElement ue = new UniqueElement();
		System.out.println(ue.findUnique(new int[]{12, 1, 12, 3, 12, 1, 1, 2, 3, 3}));
	}
}