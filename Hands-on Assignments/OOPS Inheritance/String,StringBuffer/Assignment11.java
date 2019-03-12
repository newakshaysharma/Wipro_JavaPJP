public class Assignment11 {

	public static void main(String[] args) {
		
		if(args.length!=2)
		{
			System.out.println("Plesase pass 2 sring by command line");
			return;
		}
		String str1=args[0];
		String str2=args[1];
		boolean isPresent=false;
		StringBuffer sb=new StringBuffer();
		
		while(str1.indexOf(str2)!=-1)
		{
			isPresent=true;
			int index = str1.indexOf(str2);
			String left=str1.substring(index+str2.length(),str1.length());
			
		
			if(index!=0)
			{
				sb.append(str1.charAt(index-1));
			}
			if(index+str2.length()<str1.length())
			{
				sb.append(str1.charAt(index+str2.length()));
			}
			
			
			str1=left;
			
		}
		
		if(isPresent) System.out.println(sb);
		else System.out.println("String b not present in string a");
		
		
	}

}