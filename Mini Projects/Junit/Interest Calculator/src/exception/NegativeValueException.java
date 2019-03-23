package exception;

public class NegativeValueException extends Exception {
	
	public static final int invalid_amount=1;
	public static final int invalid_days=2;
	public static final int invalid_age=3;
	public static final int invalid_monthlyamount=4;
	public static final int invalid_interestrate=5;
	public static final int invalid_month=6;

	public NegativeValueException(int ca) {
		System.out.println();
		switch(ca)
		{
		case invalid_amount:
			System.out.print("Invalid amount. ");
			break;
		case invalid_days:
			System.out.print("Invalid Number of days. ");
			break;
		case invalid_age:
			System.out.print("Invalid age. ");
			break;
		case invalid_monthlyamount:
			System.out.print("Invalid monthly amount. ");
			break;
		case invalid_interestrate:
			System.out.print("Invalid Interset rate. ");
			break;
		case invalid_month:
			System.out.print("Invalid month. ");
			break;
		default:
			//do nothing
		}
		System.out.println("Plese Enter non-negative values.\n");
	}

}
