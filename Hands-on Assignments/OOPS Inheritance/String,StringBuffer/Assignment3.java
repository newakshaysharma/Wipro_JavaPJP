public class Assignment3 {
	
	public static void main(String[] args)
	{
		if(args.length!=1)
		{
			System.out.println("Pass 1 string by command line");
			return;
		}
		
		String st=args[0];
		int l=st.length();
		if(l<2)
		{
			System.out.println("String length is less then 2");
			return;
		}
		for(int i=0;i<l;i++)
		{
			System.out.print(st.charAt(0)+""+st.charAt(1));
		}
		
		
		
		
		
	}
}