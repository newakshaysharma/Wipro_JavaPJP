package assignment7;

import java.util.Scanner;

public class UserRegistration {

	public static void main(String[] args) {
		String name;
		String country;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter name : ");
		name=sc.nextLine();
		System.out.print("Enter country : ");
		country=sc.nextLine();
		try{
			registerUser(name, country);
		}catch(InvalidCountryException ivc){
			System.out.println(ivc);
		}

	}
	
	public static void registerUser(String username,String userCountry)throws InvalidCountryException{
		
		if(userCountry.equalsIgnoreCase("INDIA"))
		{
			System.out.println("User registration done successfully");
		}else {
			throw new InvalidCountryException();
		}
	}

}
