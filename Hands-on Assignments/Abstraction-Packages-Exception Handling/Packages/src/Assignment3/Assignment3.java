package Assignment3;

import com.automobile.twowheeler.*;

public class Assignment3 {
	
	public static void main(String[] args){
		
		Hero hero=new Hero("Xtreme 200R", "123456789", "Manpreet Singh", 200);
		Honda honda=new Honda("CB SHINE","945223546","MPS",190);
		
		System.out.print("Hero info : \nModel Name : "+hero.getModelName()+
				"\nRegistartion no. : "+hero.getRegistrationNumber()+
				"\nOwner name : "+hero.getOwnerName()+"\nSpeed : "+hero.getSpeed()
				+"\nRadio : ");
		hero.radio();
		
		System.out.println();
		
		System.out.print("Honda info: \nModel Name : "+honda.getModelName()+
				"\nRegistartion no. : "+honda.getRegistrationNumber()+
				"\nOwner name : "+honda.getOwnerName()+"\nSpeed : "+honda.getSpeed()
				+"\nRadio : ");
		honda.cdplayer();
		
	}

}
