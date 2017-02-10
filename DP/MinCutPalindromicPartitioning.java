import java.util.*;
public class MinCutPalindromicPartitioning{
	public MinCutPalindromicPartitioning(){
		String s = "abcbm";
		calulateMinimumCut(s);
	}
	public void calulateMinimumCut(String s){
		int[][] matrix = new int[s.length()][s.length()];
		int l = 1;
		while(l<=s.length()){
			int i = 0, j = i+l-1;
			while(j<s.length()){
				if(l==1) matrix[i][j] =0;
				else if(isPalindrome(s,i,j)) matrix[i][j] = 0;
				else{
					matrix[i][j] = minCuts(matrix,i,j);
				}
				i++;
				j++;
			}
			l++;
		}
		System.out.println(matrix[0][matrix[0].length-1]);
	}
	public int minCuts(int[][] matrix, int i, int j){
		int cuts = matrix.length+1;
		for(int k=i;k<j;k++){
			cuts = Math.min(cuts, matrix[i][k]+ matrix[k+1][j]);
		}
		return cuts+1;
	}
	public boolean isPalindrome(String s, int i, int j){
		while(i<j){
			if(s.charAt(i)!=s.charAt(j)) return false;
			i++;
			j--;
		}
		return true;
	}
	public static void main(String[] arg){
		MinCutPalindromicPartitioning mcpp = new MinCutPalindromicPartitioning();
	}
	

}