package assignment8;

public class Assignment8 {

	public static void main(String[] args)throws AgeInvalidException {
		String name=args[0];
		
		int age=Integer.parseInt(args[1]);
		
		if(age<16||age>59) throw new AgeInvalidException();
		
		System.out.println("Name: " + name + " Age: " + age);

	}

}
