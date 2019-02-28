public class Assignment5 {
	
	public static void main(String[] args)
	{
		if(args.length!=1)
		{
			System.out.println("Pass 1 string by command line");
			return;
		}		
		System.out.println(args[0].substring(1,args[0].length()-1));
	}
}