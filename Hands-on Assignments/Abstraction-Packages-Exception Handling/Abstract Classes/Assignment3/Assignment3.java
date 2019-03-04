import java.util.Random;
public class Assignment3{

	public static void main(String[] args)
	{
		Instrument[] ins=new Instrument[10];
		
		Random rand = new Random();
		for(int i=0;i<10;i++)
		{
			int ran=rand.nextInt(3)+1;
			
			switch(ran)
			{
				case 1:
					{
						ins[i] = new Piano();
						break;
					}
				case 2:
					{
						ins[i] = new Flute();
						break;
					}
				case 3:
					{
						ins[i] = new Guitar();
						break;
					}
				
			}
			ins[i].play();
		}
		
		System.out.println();
		for(int j=0;j<10;j++)
		{
			if(ins[j] instanceof Piano) System.out.println("Piano is stored at index " + j);
			else if(ins[j] instanceof Flute) System.out.println("Flute is stored at index " + j);
			else System.out.println("Guitar is stored at index " + j);
		}
	}
}