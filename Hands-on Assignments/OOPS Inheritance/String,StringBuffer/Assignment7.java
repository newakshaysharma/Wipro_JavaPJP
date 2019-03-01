public class Assignment7 {
	
	public static void main(String[] args)
	{
		if(args.length!=1)
		{
			System.out.println("Pass 1 variable by command line");
			return;
		}
		
		String st=args[0];
		if(st.charAt(0)=='x')
			st=st.substring(1,st.length());
		if(st.charAt(st.length()-1)=='x')
			st=st.substring(0,st.length()-1);
		System.out.println(st);
	}
}