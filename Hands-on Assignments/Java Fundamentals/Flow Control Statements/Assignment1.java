public class Assignment1 {

	public static void main(String[] args) {
		int num=Integer.parseInt(args[0]);
		if(num>0)
			System.out.println("Positive");
		else if(num<0)
			System.out.println("Negative");
		else
			System.out.println("Zero");
	}

}