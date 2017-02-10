public class MinimumNumberOfJumps{
	public MinimumNumberOfJumps(){
		int[] array = {1, 3, 6, 3, 2, 3, 6, 8, 9, 5};
		int steps = 0;
		int maxDis = 0,dis = 0,i=0;
		while(i<array.length){
			dis =Math.max(i+array[i],dis);
			if(i>maxDis){
				maxDis = dis;
				steps++;
			}
			i++;
		}
		steps++;
		System.out.println(steps);
	}
	public static void main(String arg[]){
		MinimumNumberOfJumps mnoj = new MinimumNumberOfJumps();
	}
}