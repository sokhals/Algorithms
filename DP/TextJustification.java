import java.util.*;
public class TextJustification{
	public TextJustification(){
		String word[] = {"Tushar","Roy","likes", "to", "code"};
		int l = 10;
		int[][] matrix = new int[word.length][word.length];
		for(int i=0;i<matrix.length;i++){
			int length = word[i].length(),j=1;
			while(j<matrix[0].length){
				if(length<l)
					matrix[i][j] = (l-length)*(l-length);
				else
					matrix[i][j] = -1;
				length+=word[j].length()+1;
				j++;
			}
		}
		computeOptimalArrangement(matrix);
	}
	public void computeOptimalArrangement(int[][] matrix){
		int[] optimalSol = new int[matrix.length];
		int[] optimalPos = new int[matrix.length];
		optimalSol[matrix.length-1] = matrix[matrix.length-1][matrix.length-1];
		optimalPos[matrix.length-1] = matrix.length;
		int i = matrix.length-2;
		while(i>=0){
			int j = j=matrix.length-1;
			while(j>i){
				if(j==matrix.length-1 && matrix[i][j]!=-1){ 
					optimalSol[i] = matrix[i][j];
					optimalPos[i] = j+1;
				}
				else if(matrix[i][j-1]+optimalSol[j]<optimalSol[i] && matrix[i][j]){
					optimalSol[i] = matrix[i][j-1]+optimalSol[j];
					optimalPos[i] = j+1;
				}
				j--;
			}
			i--;
		}
		System.out.println(Arrays.toString(optimalSol));
		System.out.println(Arrays.toString(optimalPos));
	}
	public static void main(String[] args){
		TextJustification tj = new TextJustification();
	}
}