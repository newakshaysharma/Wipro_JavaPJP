public class Assignment9 {
	
	public static void main(String[] args)
	{
		if(args.length!=2)
		{
			System.out.println("Pass 2 command line variable");
			return;
		}
		String a=args[0];
		String b=args[1];
		String bigger = a.length() > b.length() ? a : b;
		String smaller = a.length() < b.length() ? a : b;

		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < smaller.length(); i++) {
			sb.append(a.charAt(i)).append(b.charAt(i));
		}
		
		sb.append(bigger.substring(smaller.length(), bigger.length()));
		
		System.out.println(sb);
	}
}