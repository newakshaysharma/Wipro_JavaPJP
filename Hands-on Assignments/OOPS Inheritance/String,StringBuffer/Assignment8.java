public class Assignment8 {
	
	public static void main(String[] args)
	{
		if(args.length!=1)
		{
			System.out.println("Pass 1 command line variable");
			return;
		}
		String st=args[0];
		StringBuffer sb=new StringBuffer();
		sb.append(st.substring(0,st.indexOf('*')-1));
		sb.append(st.substring(st.indexOf('*')+2,st.length()));
		System.out.println(sb);
	}
}