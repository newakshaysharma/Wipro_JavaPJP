public class Assignment12 {

	public static void main(String[] args) {
		int num=Integer.parseInt(args[0]);
		boolean temp=true;
		for(int i=2;i<num;i++) {
			if(num%i==0)
			{
				temp=false;
				break;
			}
		}
		if(temp)
			System.out.println("Prime");
		else
			System.out.println("Non-prime");
	}

}
