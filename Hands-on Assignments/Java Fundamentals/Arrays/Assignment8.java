public class Assignment8 {

	public static void main(String[] args) {
		int[] array = {10,20,10,10,30,40,99};
		
		int maxOccEleindex = getHighestOccEle(array);
		
		System.out.println(array[maxOccEleindex]);
	}
	
	public static int getHighestOccEle(int[] array) {
		int[] countarr=new int[array.length];
		
		for (int i = 0; i < array.length; i++)
		{
			int ele=array[i];
			for(int j=0;j<array.length;j++)
			{
				if(ele==array[j])
				{
					countarr[i]++;
				}
			}
		}
		int maxOccindex=0;
		for (int i = 0; i < array.length; i++) {
			if(countarr[i]>maxOccindex)
			{
				maxOccindex=i;
			}
		}
		
		
		return maxOccindex;
	}

}