import java.util.*;
public class NumberOfWaysForCoinChange{
	public NumberOfWaysForCoinChange(){
		int[] coins = {3,2,1,5};
		int denomination = 5;
		computeMaxCoinsChange(coins, denomination);
		
	}

	public void computeMaxCoinsChange(int[] coins, int total){
		int[][] res = new int[coins.length][total+1];
		res[0][0] = 0;
		for(int i=1;i<coins.length;i++)res[i][0] = 1;
		for(int i=1;i<=total;i++) res[0][i] = i%coins[0]!=0?0:1;

		for(int i=1;i<res.length;i++){
			for(int j=1;j<res[i].length;j++)
				res[i][j] = j<coins[i]?res[i-1][j]:res[i-1][j]+res[i][j-coins[i]];
		}
		System.out.println(res[res.length-1][res[0].length-1]);

	}
	public static void main(String args[]){
		NumberOfWaysForCoinChange mcp = new NumberOfWaysForCoinChange();	
	}
}