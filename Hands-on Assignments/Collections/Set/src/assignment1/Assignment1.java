package assignment1;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ch;
		CountyName cn=new CountyName();
		while(true)
		{
			System.out.println("Main Menu"
					+ "\n1.Save Country"
					+ "\n2.Get Country"
					+ "\n3.Exit");
			if(!sc.hasNextInt()){
				sc.next();
				ch=0;
				}
			else ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Enter country Name");
				cn.saveCountryNames(sc.next());
				break;
			case 2:
				System.out.println("Enter country Name");
				String ret=cn.getCountry(sc.next());
				if(ret!=null)
					System.out.println("Country Found : "+ret);
				else
					System.out.println("Not Found");
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
