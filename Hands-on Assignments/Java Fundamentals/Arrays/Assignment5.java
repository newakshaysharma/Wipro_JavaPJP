public class Assignment5 {

	public static void main(String[] args) {
		int[] arr= {1,8,2,9,5,4,6,10,0};
		int maxOne = 0;
        int maxTwo = 0;
        for(int n:arr){
            if(maxOne < n){
                maxTwo = maxOne;
                maxOne =n;
            } else if(maxTwo < n){
                maxTwo = n;
            }
        }
		System.out.println("First Max Number: "+maxOne);
        System.out.println("Second Max Number: "+maxTwo);
	}

}