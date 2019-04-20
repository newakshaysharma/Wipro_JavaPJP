import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Project4 {

	public static void main(String[] args) {
		Map<Character,Set<Card>> map=new TreeMap<Character, Set<Card>>();
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter Number of Cards :");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++){
			System.out.println("Enter Card "+i+":");
			char cs=sc.next().charAt(0);
			int cn=sc.nextInt();
			
			Card card=new Card(cs,cn);
			if(!map.containsKey(cs)){
				Set<Card> newset=new HashSet<Card>();
				newset.add(card);
				map.put(cs, newset);
			}else{
				Set<Card> oldset=map.get(cs);
				oldset.add(card);
			}
			
		}
		
		Set<Entry<Character, Set<Card>>> set = map.entrySet();
		Iterator<Entry<Character, Set<Card>>> it = set.iterator();
		System.out.println("Distinct Symbols are :");
		while(it.hasNext()){
			System.out.print(it.next().getKey()+" ");
		}
		System.out.println();
		it=set.iterator();
		
		while(it.hasNext()){
			int sum=0;
			Entry<Character,Set<Card>> e=it.next();
			
			System.out.println("Cards in "+e.getKey()+" are :");
			
			Iterator<Card> itset=e.getValue().iterator();
			while(itset.hasNext()){
				Card card=itset.next();
				System.out.println(card.getCardsym()+" "+card.getCardno());
				sum=sum+card.getCardno();
			}
			System.out.println("Numbers of card : "+e.getValue().size());
			System.out.println("Sum of Numbers : "+sum);
		}
		
		
		
		sc.close();
	}

}
