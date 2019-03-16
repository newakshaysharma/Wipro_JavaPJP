package assignment8;

public class AgeInvalidException extends Exception {

	public AgeInvalidException() {
		System.out.println("AgeInvalidException:Age enterd is less then 18 or greater then 59");
	}

}
