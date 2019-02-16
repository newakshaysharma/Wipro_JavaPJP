public class Assignment8 {

	public static void main(String[] args) {
		switch(args[0]) {
			case "R":
				System.out.println(args[0]+"->Red");
				break;
			case "B":
				System.out.println(args[0]+"->Blue");
				break;
			case "G":
				System.out.println(args[0]+"->Green");
				break;
			case "Y":
				System.out.println(args[0]+"->Yellow");
				break;
			case "W":
				System.out.println(args[0]+"->White");
				break;
			default:
				System.out.println("Invalid code");
				break;
		}
	}

}