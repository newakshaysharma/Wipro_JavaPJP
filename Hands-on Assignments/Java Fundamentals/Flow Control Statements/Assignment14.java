public class Assignment14 {
	
	public static void main(String[] args) {
		if(args.length!=1||!(args[0].chars().allMatch(Character::isDigit)))
		{
			System.out.println("Please enter an integer number");
		}
		else
		{
			int n=Integer.parseInt(args[0]);
			if(n==0||n==1)
			{
				System.out.println(n+" is neither prime nor composite");
			}
			else if(isPrime(n))
			{
				System.out.println(n+" is a prime number");
			}
			else
			{
				System.out.println(n+" is not a prime number");
			}
		}
	}
	
	
	public static boolean isPrime(int n)
	{
		boolean temp=true;
		for(int i=2;i<n;i++) {
			if(n%i==0)
			{
				temp=false;
				break;
			}
		}
		return temp;
		
	}

}
