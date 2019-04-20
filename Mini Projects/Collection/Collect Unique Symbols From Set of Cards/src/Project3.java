import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Project3 {

	public static void main(String[] args) {
		Set<Character> set=new HashSet<Character>();
		Set<Card> cardset=new HashSet<Card>();
		Scanner sc = new Scanner(System.in);
		int ct=0;
		while(set.size()<4)
		{
			System.out.println("Enter a card :");
			char s=sc.next().charAt(0);
			int i=sc.nextInt();
			boolean x=set.add(s);
			if(x)
			{
				Card c=new Card(s, i);
				cardset.add(c);
			}
			ct++;
		}
		System.out.println("Four symbols gathered in "+ct+" cards.");
		Iterator<Card> it=cardset.iterator();
		while(it.hasNext())
		{
			Card c=it.next();
			System.out.println(c.getCardsym()+" "+c.getCardNo());
		}
		sc.close();
	}
}
