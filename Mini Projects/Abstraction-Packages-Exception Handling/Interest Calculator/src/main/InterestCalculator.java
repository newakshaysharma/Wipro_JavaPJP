package main;

import java.util.Scanner;

import exception.NegativeValueException;
import packages.account.FDAccount;
import packages.account.RDAccount;
import packages.account.SBAccount;

public class InterestCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch=0;
		
		while(true){
			System.out.println("Main Menu");
			System.out.println("-------------------");
			System.out.print("1. Interest Calculator - SB\n" + 
								"2. Interest Calculator - FD\n" + 
								"3. Interest Calculator - RD\n" + 
								"4. Exit: \n" + 
								"Enter your choice (1..4): ");
			
			if(!sc.hasNextInt()){
				sc.next();
				ch=0;
				}
			else ch=sc.nextInt();
			boolean forexchandle=true;
			switch (ch) {
			
			case 1:
				SBAccount sb=new SBAccount();
				while(forexchandle){
					try{
						System.out.print("Enter the averege amount in your account : ");
						double amt=sc.nextDouble();
						if(amt<0) {
							throw new NegativeValueException(1);
						}
						else
						{
							forexchandle=false;
							sb.setAmount(amt);
						}
					}catch (NegativeValueException neg) {
					//nothing to write here
						}
				}
				System.out.print("Is Your Account Type NRI? Enter y if yes.");
				String t=sc.next();
				if(t.equals("y"))
					sb.setAccounttype("NRI");
				else 
					sb.setAccounttype("Normal");
				System.out.println("Interest gained : Rs. "+sb.calculateInterest());
				break;
				
				
			case 2:
				FDAccount fd=new FDAccount();
				double fdamt=0;
				int days=0;
				int age=0;
				
				while(forexchandle){
					System.out.print("Enter the FD amount : ");
					fdamt=sc.nextDouble();
					System.out.print("Enter the number of days : ");
					days=sc.nextInt();
					System.out.print("Enter your age : ");
					age=sc.nextInt();
					
					try{
						if(fdamt<0) throw new NegativeValueException(1);
						if(days<0) throw new NegativeValueException(2);
						if(age<0) throw new NegativeValueException(3);
						forexchandle=false;
					}
					catch(NegativeValueException neg){
						//nothing to write here
					}
					
				}
				fd.setAmount(fdamt);
				fd.setAgeOfACHolder(age);
				fd.setNoOfDays(days);
				System.out.println("Interest gained : Rs. "+fd.calculateInterest());
				break;
				
				
			case 3:
				RDAccount rd=new RDAccount();
				double rdamt=0;
				int noofmonths=0;
				int rdage=0;
				double monthlyAmount=0;
				
				while(forexchandle){
					System.out.print("Enter the SD amount : ");
					rdamt=sc.nextDouble();
					System.out.print("Enter the number of Months : ");
					noofmonths=sc.nextInt();
					System.out.print("Enter your age : ");
					rdage=sc.nextInt();
					System.out.print("Enter your Monthly Amount : ");
					monthlyAmount=sc.nextDouble();
					
					try{
						if(rdamt<0) throw new NegativeValueException(1);
						if(noofmonths<0) throw new NegativeValueException(2);
						if(rdage<0) throw new NegativeValueException(3);
						if(monthlyAmount<0) throw new NegativeValueException(4);
						forexchandle=false;
					}
					catch(NegativeValueException neg){
						//nothing to write here
					}
					
				}
				rd.setAmount(rdamt);
				rd.setNoOfMonths(noofmonths);
				rd.setAgeOfAccHolder(rdage);
				rd.setMonthlyAmount(monthlyAmount);
				System.out.println("Interest gained : Rs. "+rd.calculateInterest());
				break;
				
				
			case 4:
				sc.close();
				System.out.println("\n\nExiting...!!! Thanks for using the application.\n\n");
				return;
				
				
			default:
				System.out.println("\n\nPlease Enter correct choice.\n\n");
			}
			System.out.println();
			
		}
		
		
	}

}
