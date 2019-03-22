package assignment3;

import java.util.Scanner;

public class assignment3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any integer between 1 to 255 :");
		int input = sc.nextInt();
		
		if(input<1||input>255) System.out.println("Value out of range");
		
		String s=String.format("%8s",Integer.toBinaryString(input)).replace(' ','0');
		System.out.println(s);
		
		sc.close();


	}

}
