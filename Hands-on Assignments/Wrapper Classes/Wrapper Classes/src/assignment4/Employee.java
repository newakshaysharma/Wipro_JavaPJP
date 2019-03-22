package assignment4;

public class Employee implements Cloneable {

	public String ename;
	public int eid;
	public String email;
	
	@Override
	public Employee clone() {
		try {
			return (Employee) super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("Cloning Not Allowed");
			return this;
		}		
	}

}
