package assignment6;

public class ValueOutOfRangeException extends Exception {

	public ValueOutOfRangeException() {
		System.out.println("User Define Exception");
	}
	
	public String toString()
	{
		return "ValueOutOfRangeException:Value Entered is greater then 100";
	}

}
