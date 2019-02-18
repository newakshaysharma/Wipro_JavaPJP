public class Assignment10 {

	public static void main(String[] args) {
		
		if(args.length!=4)
		{
			System.out.println("Please enter 4 integer numbers");
			return;
		}
		int arr[][]=new int[2][2];
		int rev[][]=new int[2][2];
		int i,j;
		int ct=0;
		System.out.println("The given array is :");
		for(i=0;i<2;i++)
		{	
			for(j=0;j<2;j++)
			{
				arr[i][j]=Integer.parseInt(args[ct++]);
				System.out.print(arr[i][j]);
				if(j!=1)
				{
					System.out.print("\t");
				}
			}
			System.out.println();
		}
		System.out.println("The reverse of the array is :");
		ct=3;
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				rev[i][j]=Integer.parseInt(args[ct--]);
				System.out.print(rev[i][j]);
				if(j!=1)
				{
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}
	
	

}