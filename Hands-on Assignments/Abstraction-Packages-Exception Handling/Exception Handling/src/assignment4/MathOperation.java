package assignment4;

public class MathOperation {

	public static void main(String[] args) {
		int sum=0;
		double avg=0;
		int[] arr=new int[5];
		try{
			for(int i=0;i<5;i++) arr[i]=Integer.parseInt(args[i]);
			
			for(int i=0;i<5;i++) sum=sum+arr[i];
			
			avg=sum/5;
			System.out.println("Sum: " + sum);
			System.out.println("Avg: " + avg);
		}catch(NumberFormatException nforexp){
			System.out.println(nforexp);
		}catch (ArithmeticException arthexp) {
			System.out.println(arthexp);
		}catch (ArrayIndexOutOfBoundsException indexexp) {
			System.out.println(indexexp);
		}
	}

}
