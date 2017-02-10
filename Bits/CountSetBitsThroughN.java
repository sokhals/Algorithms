import java.util.*;

public class CountSetBitsThroughN{

	public static void main(String aeg[]){
		CountSetBitsThroughN csbtn = new CountSetBitsThroughN();
		csbtn.countAllBits(15);
	}
	public void countAllBits(int N){
		int old = 2;
		int[] array = new int[N+1];
		array[0]  = 0;
		array[1] = 1;
		array[2] = 1;
		for(int i=3;i<=N;i++){
			if((i & (i-1))==0){
				old = i;
				array[i] = 1;
			}
			else array[i] = array[old]+array[i-old]; 
		}
		System.out.println(Arrays.toString(array));
	}

	
}