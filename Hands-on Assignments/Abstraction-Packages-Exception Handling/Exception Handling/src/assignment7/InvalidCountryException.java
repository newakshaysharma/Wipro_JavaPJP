package assignment7;

public class InvalidCountryException extends Exception {

	public InvalidCountryException() {
		System.out.println("InvalidCountryException:User Define Exception");
	}
	
	public String toString() {
		return "User Outside India  cannot be registered";
	}

}
