package assignment3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<String> list=new ArrayList<String>();
		int ch;
		while(true)
		{
			System.out.println("1.Insert String"
					+ "\n2.PrintAll"
					+ "\n3.Exit");
			if(!sc.hasNextInt()){
				sc.next();
				ch=0;
				}
			else ch=sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter String : ");
				list.add(sc.next());
				break;
			case 2:
				printAll(list);
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
	
	public static void printAll(List<String> list) {
		Iterator<String> it = list.iterator();
		
		while (it.hasNext())
			System.out.println(it.next());
	}

}
