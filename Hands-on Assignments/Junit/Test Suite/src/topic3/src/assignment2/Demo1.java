package topic3.src.assignment2;

public class Demo1 {
	
	public boolean palindromeCheck(String s1)
	{
		s1=s1.toLowerCase();
		String s2="";
		int len=s1.length();
		
		for(int i=len-1;i>=0;i--) s2+=s1.charAt(i);
		
		for(int j=0;j<len;j++)
		{
			if(s1.charAt(j)!=s2.charAt(j)) return false;
		}
		
		return true;
	}

}
