public class OptimalMatrixMultiplication{
	int preComputeSum[];
	public OptimalMatrixMultiplication(){
		int[] plys = {40,20,30,10,30};
		preComputeSum = new int[plys.length-2];
		performMultiplication(plys);
	}
	public void performMultiplication(int[] plys){
		preCompute(plys);
		computeMuls(plys,0,plys.length-1);
	}
	public computeMuls(int[] array, int start, int end){
		if(end-start==2){
			return;
		}
		if
		double finalProd = Double.MAX_VALUE;
		for(int i=start;i<end;i++){
			double prod1 = computeMuls(array, start,i);
			double prod2 = computeMuls(array,i+1,end);
			finalProd = Math.min(prd1+prod2, finalProd2);
		}
		return finalProd;

	}
	public void preCompute(int[] plys){
		for(int i=0;i<plys.length-2;i++)
			preComputeSum[i] = plys[i]*plys[i+1]*plys[i+2];
	}


	public static void main(String ar[]){
		OptimalMatrixMultiplication omm = new OptimalMatrixMultiplication();
	}
}