public class Assignment19 {
	public static void main(String[] args) {
		int temp=0;
		int num=1;
		while(temp<5) {
			if((num%2==0)&&(num%3==0)&&(num%5==0)) {
				temp++;
				System.out.println(num);
			}
			num++;
		}
	}

}