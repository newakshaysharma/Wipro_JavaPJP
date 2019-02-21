public class Assignment5 {

	public static void main(String[] args) {
		int[] arr= {1,8,2,9,5,4,6,10,0};
		int maxOne = 0;
        int maxTwo = 0;
		int minOne=Integer.MAX_VALUE;
		int minTwo=Integer.MAX_VALUE;
        for(int n:arr){
            if(maxOne < n){
                maxTwo = maxOne;
                maxOne =n;
            } else if(maxTwo < n){
                maxTwo = n;
            }
			
			if (n< minOne) 
            { 
                minTwo = minOne; 
                 minOne = n; 
            } 
            else if (n < minTwo && n != minOne) 
                minTwo = n; 
        }
		System.out.println("Largest 2 numbers are "+maxOne+" & "+maxTwo);
		System.out.println("Smallest 2 numbers are "+minOne+" & "+minTwo);
	}

}