package assignment3;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;

public class Assignment3 {

	public static void main(String[] args){
		Properties po=new Properties();
		
		Scanner sc=new Scanner(System.in);
		int ch;
		while(true)
		{
			System.out.println("Main Menu"
					+ "\n1.Add State and Capital"
					+ "\n2.List all"
					+ "\n3.Exit");
			if(!sc.hasNextInt()){
				sc.next();
				ch=0;
				}
			else ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Enter State:");
				String state=sc.next();
				System.out.println("Enter Capital:");
				String capital=sc.next();
				po.setProperty(state, capital);
				break;
			case 2:
				Set<Entry<Object, Object>> set = po.entrySet();
				Iterator<Entry<Object, Object>> it = set.iterator();
				while (it.hasNext()) {
					Entry<Object, Object> me = it.next();
					System.out.println(me);
				}
				break;
			case 3:
				sc.close();
				System.out.println("\n\nExiting...!!!\n\n");
				return;
			default:
				System.out.println("\n\nPlease Enter correct choice.\n\n");
				break;
			}
		}
	}
}
