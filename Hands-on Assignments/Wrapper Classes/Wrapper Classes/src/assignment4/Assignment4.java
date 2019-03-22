package assignment4;

public class Assignment4 {

	public static void main(String[] args) {
		Employee e=new Employee();
		e.ename="Manpreet";
		e.eid=123;
		e.email="mpschahal16@gmail.com";
		
		Employee eclone=e.clone();
		
		//Value before changing
		System.out.println("Before chaging :\nValue of orignal :\nEmployee name : "+e.ename+"\nEmployee id : "+e.eid+"\nEmail : "+e.email+"\n");
		System.out.println("Value of Clone :\nEmployee name : "+eclone.ename+"\nEmployee id : "+eclone.eid+"\nEmail : "+eclone.email+"\n\n\n");
		
		//Changing Value of clone
		
		eclone.ename="Singh";
		eclone.eid=321;
		eclone.email="abc@gmail.com";
		
		//Value after changing
		System.out.println("After chaging :\nValue of orignal :\nEmployee name : "+e.ename+"\nEmployee id : "+e.eid+"\nEmail : "+e.email+"\n");
		System.out.println("Value of Clone :\nEmployee name : "+eclone.ename+"\nEmployee id : "+eclone.eid+"\nEmail : "+eclone.email);
		
		

		
	}

}
