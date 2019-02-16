public class Assignment7 {

	public static void main(String[] args) {
		char var='A';
		if(Character.isLowerCase(var))
			System.out.println(var+"->"+Character.toUpperCase(var));
		else
			System.out.println(var+"->"+Character.toLowerCase(var));
	}

}