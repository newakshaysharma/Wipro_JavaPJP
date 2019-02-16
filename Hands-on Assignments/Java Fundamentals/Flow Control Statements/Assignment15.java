public class Assignment15 {
	
	public static void main(String[] args) {
		int len=args[0].length();
		int sum=0;
		for(int i=0;i<len;i++)
		{
			sum=sum+Integer.parseInt(args[0].charAt(i)+"");
		}
		System.out.println(sum);
	}	

}