package assignment4;

import java.util.Scanner;

public class Assignment4 {

	public static void main(String[] args) {
		ContactList cl=new ContactList();
		
		Scanner sc=new Scanner(System.in);
		int ch;
		while(true)
		{
			System.out.println("Main Menu"
					+ "\n1.Add Contact"
					+ "\n2.Remove Contact"
					+ "\n3.Check Contact Name exists"
					+ "\n4.Check Contact No. exists"
					+ "\n5.List all"
					+ "\n6.Exit");
			if(!sc.hasNextInt()){
				sc.next();
				ch=0;
				}
			else ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Enter Name:");
				String name=sc.next();
				System.out.println("Enter No.:");
				Integer no=new Integer(sc.nextInt());
				cl.addContact(name, no);
				break;
			case 2:
				System.out.println("Enter Name:");
				name=sc.next();
				cl.removeContact(name);
				break;
			case 3:
				System.out.println("Enter Name:");
				name=sc.next();
				if(cl.contactNameExists(name))
					System.out.println(name+" is present");
				else
					System.out.println("Not Found");
				break;
			case 4:
				System.out.println("Enter No:");
				no=new Integer(sc.next());
				if(cl.contactNoExists(no))
					System.out.println(no+" is present");
				else
					System.out.println("Not Found");
				break;
			case 5:
				cl.listAll();
				break;
			case 6:
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
