public class MaximumSumIncreasnigSubsequence{
	public MaximumSumIncreasnigSubsequence(){
		int[] array = {10,14,35,10};
		findMaxSum(array);
	}
	public void findMaxSum(int[] array){
		int[] res = new int[array.length];
		int max = array[0];
		for(int i = 0;i<res.length;i++) res[i] = array[i];
		for(int i=1;i<array.length;i++){
			int j = 0;
			while(j<i){
				if(array[j]<array[i]) res[i] = Math.max(res[i], res[j]+array[i]);

				j++;
			}
			max = Math.max(res[i],max);
		}
		System.out.println(max);
	}

	public static void main(String ar[]){
		MaximumSumIncreasnigSubsequence msis = new MaximumSumIncreasnigSubsequence();
	}
}