public class Assignment7 {

	public static void main(String[] args) {
		int[] arr= {12,34,12,45,67,89,90,55,67};
		int[] temp = new int[arr.length];
		int ct=0;
		for(int i:arr)
		{
			if(!isPresent(i,temp))
			{
				temp[ct++]=i;
			}
		}
		for(int k=0;k<ct;k++)
		{
			System.out.print(temp[k]);
			if(k!=ct-1)
			{
				System.out.print(",");
			}
		}
	}
	
	public static boolean isPresent(int e,int[] arr)
	{
		int len=arr.length;
		for(int i:arr)
		{
			if(e==i)
			{
				return true;
			}
			
		}
		return false;
	}

}