public class Assignment2 {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40,5};
		int max=arr[0];
		int min=arr[0];
		for(int i:arr)
		{
			if(i>max)
				max=i;
			if(i<min)
				min=i;
			
		}
		System.out.println("Maximun="+max+"\nMinimum="+min);
	}

}