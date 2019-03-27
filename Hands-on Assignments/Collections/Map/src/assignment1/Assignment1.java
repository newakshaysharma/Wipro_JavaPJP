package assignment1;

import java.util.ArrayList;
import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		Capital cap=new Capital();
		Scanner sc=new Scanner(System.in);
		int ch;
		while(true)
		{
			System.out.println("Main Menu"
					+ "\n1.Add Country and Capital"
					+ "\n2.Show Capital"
					+ "\n3.Show Country"
					+ "\n4.Exchange key value"
					+ "\n5.Get Arraylist of Country"
					+ "\n6.Exit");
			if(!sc.hasNextInt()){
				sc.next();
				ch=0;
				}
			else ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				System.out.println("Enter Country:");
				String country=sc.next();
				System.out.println("Enter Capital:");
				String capital=sc.next();
				cap.saveCountryCapital(country, capital);
				break;
			case 2:
				System.out.println("Enter Country:");
				System.out.println(cap.getCapital(sc.next()));
				break;
			case 3:
				System.out.println("Enter Capital:");
				System.out.println(cap.getCountry(sc.next()));
				break;
			case 4:
				System.out.println(cap.exchangeKyeValue());
				break;
			case 5:
				ArrayList<String> al=cap.getArrayList();
				for(String s:al)
					System.out.println(s);
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
