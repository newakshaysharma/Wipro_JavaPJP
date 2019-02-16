public class Assignment16 {
	public static void main(String[] args) {
		if(args.length!=1)
		{
			System.out.println("Please enter an integer number");
		}
		else
		{
			int num=Integer.parseInt(args[0]);
			for(int i=0;i<num;i++)
			{
				for(int j=0;j<=i;j++)
				{
					System.out.print("*\t");
				}
				System.out.println();
			}
		}
	}
}