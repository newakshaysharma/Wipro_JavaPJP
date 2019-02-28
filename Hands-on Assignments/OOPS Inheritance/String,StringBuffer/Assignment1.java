public class Assignment1 {
	
	public static void main(String[] args)
	{
		System.out.println(isPalindrome("MAAM"));
		System.out.println(isPalindrome("MANPREET"));
		System.out.println(isPalindrome("MOM"));
	}
	
	
	public static boolean isPalindrome(String st)
	{
		int len=st.length();
		String temp="";
		for(int i=len-1;i>=0;i--)
			temp=temp+st.charAt(i);
		
		if(st.equals(temp)) return true;
		else return false;
	}
}