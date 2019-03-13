package assignment3;

import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements in the array");
		try{
			int size=Integer.parseInt(sc.nextLine());
			int[] arr=new int[size];
			System.out.println("Enter the elements in the array");
			
			for(int i=0;i<size;i++)
				arr[i]=Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter the index of the array element you want to access");
			
			int index=Integer.parseInt(sc.nextLine());
			System.out.println("The array element at index "+index+" = "+arr[index]);
			System.out.println("The array element successfully accessed");
			
			
		}catch(ArrayIndexOutOfBoundsException arrexp){
			System.out.println(arrexp);
		}catch(NumberFormatException numfexp){
			System.out.println(numfexp);
		}
		sc.close();
	}
}
