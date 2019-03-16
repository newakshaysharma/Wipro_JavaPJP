package assignment6;

import java.util.Scanner;

public class Assignment6 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<2;i++){
			String name="";
			int markssub1=0;
			int markssub2=0;
			int markssub3=0;
			boolean flag=true;
			
			System.out.print("Enter the Name of student no. "+(i+1)+" :");
			name=sc.nextLine();
			while(flag){
				System.out.print("Enter the Masrks of subject 1 of student no "+(i+1)+":");
				try{
						markssub1=Integer.parseInt(sc.nextLine());
						if (markssub1 < 0) throw new NegativeValueException();
						if (markssub1 > 100) throw new ValueOutOfRangeException();
						flag=false;
					}catch(NumberFormatException e){
						System.out.println(e);
					}catch(NegativeValueException neg){
						System.out.println(neg);
					}catch (ValueOutOfRangeException voor) {
						System.out.println(voor);
					}
					
				}
			flag=true;
			
			while(flag){
				System.out.print("Enter the Masrks of subject 2 of student no "+(i+1)+":");
				try{
						markssub2=Integer.parseInt(sc.nextLine());
						if (markssub2 < 0) throw new NegativeValueException();
						if (markssub2 > 100) throw new ValueOutOfRangeException();
						flag=false;
					}catch(NumberFormatException e){
						System.out.println(e);
					}catch(NegativeValueException neg){
						System.out.println(neg);
					}catch (ValueOutOfRangeException voor) {
						System.out.println(voor);
					}
					
				}
			flag=true;
			
			while(flag){
				System.out.print("Enter the Masrks of subject 3 of student no "+(i+1)+":");
				try{
						markssub3=Integer.parseInt(sc.nextLine());
						if (markssub3 < 0) throw new NegativeValueException();
						if (markssub3 > 100) throw new ValueOutOfRangeException();
						flag=false;
					}catch(NumberFormatException e){
						System.out.println(e);
					}catch(NegativeValueException neg){
						System.out.println(neg);
					}catch (ValueOutOfRangeException voor) {
						System.out.println(voor);
					}
					
			}
			System.out.println("\nStudent no. "+(i+1)+" info : \n");
			System.out.println("Name: " + name);
			System.out.println("Marks of subject 1: " + markssub1);
			System.out.println("Marks of subject 2: " + markssub2);
			System.out.println("Marks of subject 3: " + markssub3+"\n");
		}
		sc.close();

	}

}
