
public class PartitionProblem{
	public PartitionProblem(){
		int[] array = {2,4,2};
		int sum = 0;
		for(int i=0;i<array.length;i++) sum+=array[i];
		System.out.println(isPartitionPossible(array,sum));
	}
	public boolean isPartitionPossible(int[] array, int sum){
		if(sum%2!=0) return false;
		else sum /=2;
		boolean[][] matrix = new boolean[array.length][sum+1];
		matrix[0][0] = true;
		if(array[0]<=sum) matrix[0][array[0]] = true;
		for(int i=1;i<matrix.length;i++){
			matrix[i][0]  =true;
			for(int j=1;j<matrix[i].length;j++){
				if(array[i]>j) matrix[i][j] = matrix[i-1][j];
				else matrix[i][j] = matrix[i-1][j-array[i]];
			}
			if(matrix[i][sum]) return true;
		}
		return false;
	}
	public static void main(String args[]){
		PartitionProblem pp = new PartitionProblem();
	}
}