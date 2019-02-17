public class Assignment1 {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40,5};
		int sum=0;
		for(int i:arr)
			sum=sum+i;
		int avg=sum/5;
		System.out.println("Sum="+sum+"\nAverage="+avg);
	}

}