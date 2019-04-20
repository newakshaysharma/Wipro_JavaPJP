import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Project6 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String 1");
		String s1=sc.next();
		System.out.println("Enter String 2");
		String s2=sc.next();
		
		List<String> list=operations(s1,s2);
		System.out.println(list);
		sc.close();

	}

	private static List<String> operations(String s1, String s2) {
		List<String> list=new ArrayList<String>();
		
		list.add("\""+operation1(s1, s2)+"\"");
		list.add("\""+operation2(s1, s2)+"\"");
		list.add("\""+operation3(s1, s2)+"\"");
		list.add("\""+operation4(s1, s2)+"\"");
		list.add("\""+operation5(s1, s2)+"\"");
		
		return list;
	}
	
	public static String operation1(String s1,String s2){
		StringBuffer sb=new StringBuffer();
		for(int i=1;i<s1.length();i+=2){
			sb.append(s2);
			sb.append(s1.charAt(i));
		}
		return sb.toString();
	}
	
	public static String operation2(String s1,String s2){
		if(s1.indexOf(s2)!=s1.lastIndexOf(s2)){
			String a=s1.substring(0,s1.lastIndexOf(s2));
			String b=s1.substring(s1.lastIndexOf(s2)+s2.length(),s1.length());
			return a+new StringBuffer(s2).reverse()+b;
		}
		else return s1+s2;
	}
	
	public static String operation3(String s1,String s2){
		if(s1.indexOf(s2)!=s1.lastIndexOf(s2)){
			String a=s1.substring(0,s1.indexOf(s2));
			String b=s1.substring(s1.indexOf(s2)+s2.length(),s1.length());
			return a+b;
		}
		else return s1;
	}

	private static String operation4(String s1, String s2) {
		int partLength = s2.length() % 2 == 0 ? s2.length() / 2 : s2.length() / 2 + 1;
		return s2.substring(0, partLength) + s1 + s2.substring(partLength, s2.length());
	}
	
	private static String operation5(String s1, String s2) {
		for(int i=0;i<s2.length();i++){
			s1=s1.replaceAll(s2.charAt(i)+"", "*");
		}
		return s1;
	}

}
