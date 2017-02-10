import java.util.*;
public class LongestPalindromicSubsequence{

	public LongestPalindromicSubsequence(){
		String s = "agbdba";
		int[][] matrix = new int[s.length()][s.length()];
		computeLongestPalidromicSubsequence(matrix,s);
	}
	public void computeLongestPalidromicSubsequence(int[][] matrix, String s){
		int l  = 1;
		while(l<=s.length()){
			int i = 0,j = i+l-1;
			while(j<matrix.length){
				if(l==1) matrix[i][j] =1;
				else if(s.charAt(i)==s.charAt(i+l-1)){
					matrix[i][j] = 2 + matrix[i+1][j-1];
				}else{
					matrix[i][j] = Math.max(matrix[i][j-1],matrix[i+1][j]);
				}
				i++;j++;
			}
			l++;
		}
		System.out.println(matrix[0][s.length()-1]);
	}


	public static void main(String args[]){
		LongestPalindromicSubsequence lps = new LongestPalindromicSubsequence();
	}
}