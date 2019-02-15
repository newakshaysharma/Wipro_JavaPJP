public class Assignment6 {

	public static void main(String[] args) {
		int age=Integer.parseInt(args[1]);
		if(args[0].equals("Female")) {
			if((age>=1) && (age<=58))
				System.out.println("8.2%");
			else if((age>=59) && (age<=100))
				System.out.println("9.2%");
			else
				System.out.println("Invalid age");
		}
		else if(args[0].equals("Male")) {
			if((age>=1) && (age<=58))
				System.out.println("8.4%");
			else if((age>=59) && (age<=100))
				System.out.println("10.5%");
			else
				System.out.println("Invalid age");
		}
		else
		{
			System.out.println("Invalid Gender");
		}
	}

}