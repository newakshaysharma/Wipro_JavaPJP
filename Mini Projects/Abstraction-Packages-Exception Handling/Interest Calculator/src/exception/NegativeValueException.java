package exception;

public class NegativeValueException extends Exception {

	public NegativeValueException(int ca) {
		System.out.println();
		switch(ca)
		{
		case 1:
			System.out.print("Invalid amount. ");
			break;
		case 2:
			System.out.print("Invalid Number of days. ");
			break;
		case 3:
			System.out.print("Invalid age. ");
			break;
		case 4:
			System.out.print("Invalid monthly amount. ");
			break;
		default:
			//do nothing
		}
		System.out.println("Plese Enter non-negative values.\n");
	}

}
