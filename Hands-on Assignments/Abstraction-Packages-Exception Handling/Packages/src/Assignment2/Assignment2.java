package Assignment2;
import com.wipro.automobile.ship.Compartment;
public class Assignment2 {
	
	public static void main(String[] args){
		Compartment compartment=new Compartment(56.1, 50, 50.0);
		System.out.println("Compartment info : \nHeight : "+compartment.getHeight()+"\nWidth : "
				+compartment.getWidth()+"\nBreadth : "+compartment.getBreadth());
	}
}
