public class MaximumSizeSubsquareMatrix{
	public MaximumSizeSubsquareMatrix(){
		int[][] matrix = {	{0, 1, 1, 0, 1}, 
                   			{1, 1, 0, 1, 0}, 
                   			{0, 1, 1, 1, 0},
                   			{1, 1, 1, 1, 0},
                   			{1, 1, 1, 1, 1},
                   			{0, 0, 0, 0, 0}};
		int[][] array = new int[matrix.length+1][matrix[0].length+1];
		int max =0;
		for(int i=1;i<array.length;i++){
			for(int j=1;j<array[i].length;j++){
				if(matrix[i-1][j-1]==0) array[i][j] = 0;
				else 
					array[i][j] = Math.min(array[i-1][j],Math.min(array[i][j-1],array[i-1][j-1]))+1;
				max = Math.max(array[i][j],max);
			}
		}
		System.out.println(max);                  			
	}
	public static void main(String args[]){
		MaximumSizeSubsquareMatrix mssm = new MaximumSizeSubsquareMatrix();
	}
}