package assignment9;

import java.util.Scanner;

public class Assignment9 {

	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the 2 numbers");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		
		try{
			int quotient = n1 / n2;
			System.out.println("The quotient of "+n1+" / "+n2+" = "+quotient);
		}catch (ArithmeticException ae){
			System.out.println("DivideByZeroException caught");
		}finally{
			System.out.println("Inside finally block");
		}
		
		sc.close();
	}
}
