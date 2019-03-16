package assignment6;

public class NegativeValueException extends Exception {

	public NegativeValueException()
	{
		System.out.println("User Define Exception");
	}
	
	public String toString()
	{
		return "NegativeValueException:Value Entered is less then zero";
	}
}
