public class Assignment13 {

	public static void main(String[] args) {
		for(int i=10;i<=99;i++) {
			if(isPrime(i))
			{
				System.out.println(i);
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