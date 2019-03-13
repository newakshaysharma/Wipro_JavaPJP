package assignment1;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args)
	{
		String s;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter an integer: ");
		s=sc.nextLine();
		try{
			int i=Integer.parseInt(s);
			System.out.println("The square value is "+(i*i));
			System.out.println("The work has been done successfully.");
		}catch(NumberFormatException e){
			System.out.println("Entered input is not a valid format for an integer.");
		}
		sc.close();
	}
}