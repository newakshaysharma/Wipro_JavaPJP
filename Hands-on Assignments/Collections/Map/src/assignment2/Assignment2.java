package assignment2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Assignment2 {

	public static void main(String[] args) {
		HashMap<String, String> h1=new HashMap<String, String>();
		Scanner sc=new Scanner(System.in);
		int ch;
		while(true)
		{
			System.out.println("Main Menu"
					+ "\n1.Add Key and Value"
					+ "\n2.Check Key exists"
					+ "\n3.Check Value exists"
					+ "\n4.Display All Key And respective values"
					+ "\n5.Exit");
			if(!sc.hasNextInt()){
				sc.next();
				ch=0;
				}
			else ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Enter Key:");
				String key=sc.next();
				System.out.println("Enter Value:");
				String value=sc.next();
				h1.put(key, value);
				break;
			case 2:
				System.out.println("Enter Key:");
				String keye=sc.next();
				if(h1.containsKey(keye))
				{
					System.out.println(keye+" is present.");
				}
				else
					System.out.println("Not Found");
				break;
			case 3:
				System.out.println("Enter Value:");
				String valuee=sc.next();
				if(h1.containsValue(valuee))
				{
					System.out.println(valuee+" is present.");
				}
				else
					System.out.println("Not Found");
				break;
			case 4:
				Set<Entry<String, String>> set = h1.entrySet();
				Iterator<Entry<String, String>> it = set.iterator();
				while(it.hasNext())
				{
					Map.Entry<String, String> te=it.next();
					System.out.println(te);
				}
				break;
			case 5:
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
