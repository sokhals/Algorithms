public class SwapBits{

	public static void main(String arp[]){
		SwapBits sb = new SwapBits();
		sb.swapBits(1824761, 10,2);	
	}
	public void swapBits(int n, int i, int j){
		int num1 = 1<<i;
		int num2 = 1<<j;
		System.out.println(Integer.toBinaryString(n)+"  "+Integer.toBinaryString(num1) +" "+Integer.toBinaryString(num2));
		boolean isIOne = (n&num1)>=1, isJOne = (n&num2)>=1;
		if((isJOne && isIOne) || (!isIOne && !isJOne))
			System.out.println(n);
		else
			System.out.println(n ^ (num1 | num2));
	}
}
          

