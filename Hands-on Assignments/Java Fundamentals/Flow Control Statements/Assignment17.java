public class Assignment17 {
	public static void main(String[] args) {
		if(args.length!=1)
		{
			System.out.println("Please enter an integer number");
		}
		else
		{
			int num=Integer.parseInt(args[0]);
			int rev=0,temp=num;
			while(temp!=0)
			{
				rev=(rev*10)+temp%10;
				temp=temp/10;
			}
			System.out.println(rev);
		}
	}
}