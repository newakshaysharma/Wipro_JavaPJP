package Assignment4;

import com.automobile.fourwheeler.*;

public class Assignment4 {
	
	public static void main(String[] args){
		
		Logan logan = new Logan("Logan 1", "1fd565sf", "Manpreet", 220, 56);
		Ford ford = new Ford("Ford 1", "sffs6464", "mps", 210, 35);
		
		
		System.out.println("Logan info : \nModel Name : "+logan.getModelName()+
				"\nRegistartion no. : "+logan.getRegistrationNumber()+
				"\nOwner name : "+logan.getOwnerName()+"\nSpeed : "+logan.speed()
				+"\nGps loc : "+logan.gps());
		
		System.out.println();
		
		System.out.println("Ford info : \nModel Name : "+ford.getModelName()+
				"\nRegistartion no. : "+ford.getRegistrationNumber()+
				"\nOwner name : "+ford.getOwnerName()+"\nSpeed : "+ford.speed()
				+"\nTemperature : "+ford.tempControl());
		
	}

}
