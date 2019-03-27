package assignment2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;


public class Assignment2 {

	public static void main(String[] args){
		HashSet<String> set = new HashSet<String>();
		Scanner sc=new Scanner(System.in);
		int ch;
		while(true)
		{
			System.out.println("Main Menu"
					+ "\n1.Add Name"
					+ "\n2.List All Name"
					+ "\n3.Exit");
			if(!sc.hasNextInt()){
				sc.next();
				ch=0;
				}
			else ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Enter Name");
				set.add(sc.next());
				break;
			case 2:
				Iterator<String> it=set.iterator();
				while(it.hasNext()){
					System.out.println(it.next());
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
