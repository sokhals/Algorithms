public class LongestIncreasingSubsequence{
	public LongestIncreasingSubsequence(){
		int[] array = {10,22,9,33,21,50,41,60,80};
		computeSequence(array);
	}

	public void computeSequence(int[] array){
		int[] res = new int[array.length];
		res[0] = 1;
		int max =0;
		for(int i=1;i<array.length;i++){
			int j = 0;
			while(j<i){
				if(array[j]<array[i])
					res[i] = Math.max(res[j]+1,res[i]);
				j++;
			}
			max = Math.max(res[i],max);
		}

		System.out.println(max);
	}

	public static void main(String ars[]){
		LongestIncreasingSubsequence lis = new LongestIncreasingSubsequence();
	}
}