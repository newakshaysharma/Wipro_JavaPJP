import java.util.Random;
public class TestCompartment{

	public static void main(String[] args)
	{
		Compartment[] compart=new Compartment[10];
		
		Random rand = new Random();
		for(int i=0;i<10;i++)
		{
			int ran=rand.nextInt(4)+1;
			
			switch(ran)
			{
				case 1:
					{
						compart[i] = new FirstClass();
						break;
					}
				case 2:
					{
						compart[i] = new Ladies();
						break;
					}
				case 3:
					{
						compart[i] = new General();
						break;
					}
				case 4:
					{
						compart[i] = new Luggage();;
						break;
					}
				
			}
			System.out.println(compart[i].notice());
		}
	}
}
