public class MinCostPath{
	int[][] res;
	public MinCostPath(){
		int[][] matrix= {{1,2,3},{4,8,2},{1,5,3}};
		res = new int[matrix.length][matrix[0].length];
		res[2][2] = 3;
		int sum = Math.min(computeMinPath(matrix,1,2),Math.min(computeMinPath(matrix,2,1),computeMinPath(matrix,1,1)));;
		System.out.println(sum);
	}
	public int computeMinPath(int[][] matrix,int x,int y){
		if(x<0 || y<0) return Integer.MAX_VALUE;
		if(res[x][y]!=0) return res[x][y];
		int a=0,b=0,c=0;
		a = computeMinPath(matrix,x-1,y);
		b = computeMinPath(matrix,x,y-1);
		c = computeMinPath(matrix,x-1,y-1);
		System.out.println(a+" "+b+" "+c);
		res[x][y] = Math.min(a,Math.min(b,c))+matrix[x][y];
		return res[x][y];
	}
	public static void main(String args[]){
		MinCostPath mcp = new MinCostPath();	
	}
}