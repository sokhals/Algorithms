public class LongestBitonicSubsequence{
	public LongestBitonicSubsequence(){
		int[] array = {12, 11, 40, 5, 3, 1};
		int[] inc = computeSequence(array);
		int[] dec = computeSequenceReverse(array);
		int max = 0;
		for(int i =0;i<inc.length;i++){
			max = Math.max(inc[i]+dec[i]-1,max);
		}
		System.out.println(max);
	}
	public int[] computeSequenceReverse(int[] array){
		int[] res = new int[array.length];
		int i = array.length-1;
		res[i] = 1;
		int max =0;
		for(;i>=0;i--){
			int j = array.length-1;
			while(j>i){
				if(array[j]<array[i])
					res[i] = Math.max(res[j]+1,res[i]);
				j--;
			}
			max = Math.max(res[i],max);
		}

		return res;
	}

	public int[] computeSequence(int[] array){
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

		return res;
	}

	public static void main(String ars[]){
		LongestBitonicSubsequence lis = new LongestBitonicSubsequence();
	}
}