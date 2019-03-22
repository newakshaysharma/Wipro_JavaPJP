package assignment2;

public class Test {

	public static void main(String[] args) {
		int i=Integer.parseInt(args[0]);
		
		System.out.println("Given Number : " + i);		
		System.out.println("Binary equivalent : "+Integer.toBinaryString(i));
		System.out.println("Octal equivalent : "+Integer.toOctalString(i));
		System.out.println("Hexadecimal equivalent : " + Integer.toHexString(i));

	}

}
