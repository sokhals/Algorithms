import java.util.*;
public class CutRodToMaximizeProfit{
	
	public CutRodToMaximizeProfit(){
		int[] prices = {1,5,8,9,10,17,17,20};
		int l = 8;
		computeMaxProfitEarned(prices, l);
	}
	public void computeMaxProfitEarned(int[] prices, int l){
		int[][] res = new int[prices.length][l+1];
		for(int i=1;i<l+1;i++) res[0][i] = prices[0]*i;
		for(int i=1;i<res.length;i++){
			for(int j=1;j<res[i].length;j++){
				res[i][j] = i+1>j?res[i-1][j]:Math.max(res[i-1][j] , res[i][j-i-1] + prices[i]);
			}
		}
		System.out.println(res[prices.length-1][l]);
	}

	public static void main(String ars[]){
		CutRodToMaximizeProfit crtmp = new CutRodToMaximizeProfit();
	}
}