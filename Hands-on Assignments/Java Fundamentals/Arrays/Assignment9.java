public class Assignment9 {

	public static void main(String[] args) {
		int[] array = {1,6,4,7,9};
		int sum=0,i;
		int len=array.length;
		int sixpos=-1;
		int sevenpos=-1;
		for(i=0;i<len;i++)
		{
			if(array[i]==6) sixpos=i;
			if(array[i]==7) sevenpos=i;
			
		}
		if(sixpos!=-1&&(sixpos<sevenpos))
		{
			for(i=0;i<sixpos;i++)
				sum+=array[i];
			for(i=sevenpos+1;i<len;i++)
				sum+=array[i];
			System.out.println(sum);
		}
		else
		{
			for(i=0;i<len;i++)
				sum+=array[i];
			System.out.println(sum);
		}
	
	}
	
	

}