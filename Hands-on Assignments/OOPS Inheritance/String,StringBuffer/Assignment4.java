public class Assignment4 {
	
	public static void main(String[] args)
	{
		if(args.length!=1)
		{
			System.out.println("Pass 1 string by command line");
			return;
		}
		
		String st=args[0],op;
		int l=st.length();
		if(l%2==0) op=st.substring(0,l/2);
		else op=null;
		
		System.out.println(op);
	}
}