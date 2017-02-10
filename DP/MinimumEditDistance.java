import java.util.*;
public class MinimumEditDistance{
	public MinimumEditDistance(){
		String s1="cat", s2 ="cut";
		calculateMinDis(s1, s2);
	}
	public void calculateMinDis(String s1, String s2){
		int[][] matrix = new int[s2.length()+1][s1.length()+1];
		for(int i=1;i<matrix[0].length;i++)
			matrix[0][i] = matrix[0][i-1]+1;
		for(int i=1;i<matrix.length;i++)	
			matrix[i][0] = matrix[i-1][0]+1;
		for(int i=1;i<matrix.length;i++){
			for(int j=1;j<matrix[i].length;j++){
				if(s2.charAt(i-1)==s1.charAt(j-1))
					matrix[i][j] = matrix[i-1][j-1];
				else
					matrix[i][j] = Math.min(matrix[i-1][j],Math.min(matrix[i][j-1], matrix[i-1][j-1]))+1;
			}
		}
		System.out.println(matrix[s2.length()][s1.length()]);


	}
	public static void main(String[] ars){
		MinimumEditDistance med = new MinimumEditDistance();
	}
}