import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Project5 {

	public static void main(String[] args) {
		Set<Box> set=new TreeSet<Box>();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of Box");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++){
			Box box=new Box();
			System.out.println("Enter the Box "+i+" details");
			System.out.println("Enter Length");
			box.setLength(sc.nextDouble());
			System.out.println("Enter Width");
			box.setWidth(sc.nextDouble());
			System.out.println("Enter Height");
			box.setHeight(sc.nextDouble());
			
			set.add(box);
		}
		
		Iterator<Box> it=set.iterator();
		System.out.println("Unique Boxes in the Set are");
		while(it.hasNext()){
			System.out.println(it.next());
		}
		sc.close();

	}

}
