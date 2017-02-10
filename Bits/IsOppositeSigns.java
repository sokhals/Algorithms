public class IsOppositeSigns{
	public void detectOppositeSigns(int a, int b){
		System.out.println(((a^b)<0));
	}
	public static void main(String args[]){
		IsOppositeSigns ios = new IsOppositeSigns();
		ios.detectOppositeSigns(10,100);
	}
}