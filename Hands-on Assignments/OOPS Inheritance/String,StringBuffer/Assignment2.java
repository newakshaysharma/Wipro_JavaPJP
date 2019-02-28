public class Assignment2 {
	
	public static void main(String[] args)
	{
		if(args.length!=2)
		{
			System.out.println("Pass 2 string by command line");
			return;
		}
		
		String s1=args[0].toLowerCase();
		String s2=args[1].toLowerCase();
		
		StringBuffer pr=new StringBuffer();
		pr.append(s1);
		
		if(s1.charAt(s1.length()-1)==s2.charAt(0))
			pr.append(s2.substring(1,s2.length()));
		else
			pr.append(" "+s2);
		
		System.out.println(pr);
	}
}