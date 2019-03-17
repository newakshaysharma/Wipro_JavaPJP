package assignment5;

import java.util.Scanner;

public class Assignment5 {
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of a and b.");
		int a=sc.nextInt();
		int b=sc.nextInt();
		sc.close();
		try{
			System.out.println("a/b = "+division(a,b));
		}catch(ArithmeticException ae){
			System.out.println(ae.getMessage());
		}
	}
	
	static double division(int a,int b)throws ArithmeticException{
		return a/b;
	}
}
