package assignment3;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Assignment3 {

	public static void main(String[] args) {
		TreeSet<String> tset = new TreeSet<String>();
		Scanner sc=new Scanner(System.in);
		int ch;
		while(true)
		{
			System.out.println("Main Menu"
					+ "\n1.Add String"
					+ "\n2.Show Collection"
					+ "\n3.Reverse Collection"
					+ "\n4.Check Existence"
					+ "\n5.Exit");
			if(!sc.hasNextInt()){
				sc.next();
				ch=0;
				}
			else ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Enter Name");
				tset.add(sc.next());
				break;
			case 2:
				Iterator<String> it=tset.iterator();
				while(it.hasNext()){
					System.out.println(it.next());
				}
				break;
			case 3:
				TreeSet<String> temp=(TreeSet<String>) tset.descendingSet();
				Iterator<String> ittemp=temp.iterator();
				while(ittemp.hasNext()){
					System.out.println(ittemp.next());
				}
				break;
			case 4:
				System.out.println("Enter Name");
				String sname=sc.next();
				if(tset.contains(sname))
					System.out.println(sname+" exists.");
				else
					System.out.println("Not Found");
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
