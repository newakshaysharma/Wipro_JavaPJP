public class Assignment11 {

	public static void main(String[] args) {
		
		if(args.length!=9)
		{
			System.out.println("Please enter 9 integer numbers");
			return;
		}
		int arr[][]=new int[3][3];
		int i,j,ct=0;
		int max=0;
		System.out.println("The given array is :");
		for(i=0;i<3;i++)
		{	
			for(j=0;j<3;j++)
			{
				arr[i][j]=Integer.parseInt(args[ct++]);
				System.out.print(arr[i][j]);
				if(max<arr[i][j])
				{
					max=arr[i][j];
				}
				if(j!=2)
				{
					System.out.print("\t");
				}
			}
			System.out.println();
		}
		System.out.println("The biggest number in the given array is "+max);
		
	}
	
	

}