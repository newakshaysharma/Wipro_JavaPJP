public class Assignment3 {

	public static void main(String[] args) {
		int[] arr= {1,4,34,56,7};
		int num=Integer.parseInt(args[0]);
		boolean temp=false;
		int index=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==num) {
				temp=true;
				index=i;
			}
		}
		if(temp)
			System.out.println(index);
		else
			System.out.println("-1");
	}

}