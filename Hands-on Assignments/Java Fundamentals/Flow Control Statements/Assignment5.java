public class Assignment5 {

	public static void main(String[] args) {
		char var='&';
		if(Character.isAlphabetic(var))
			System.out.println("Alphabet");
		else if(Character.isDigit(var))
			System.out.println("Digit");
		else
			System.out.println("Special Character");
	}

}