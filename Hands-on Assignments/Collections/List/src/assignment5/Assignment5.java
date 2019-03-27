package assignment5;

import java.util.Iterator;
import java.util.LinkedList;

public class Assignment5 {
	
	public static void main(String[] args)
	{
		LinkedList<String> months=new LinkedList<String>();

		months.add("March");
		months.addLast("April");
		months.add("May");
		months.add("June");
		months.addFirst("February");
		months.addFirst("January");
		months.add("July");
		months.add("August");
		months.add("September");
		months.add("October");
		months.add("November");
		months.add("December");
		
		Iterator<String> it=months.iterator();
		
		while(it.hasNext())
			System.out.println(it.next());
	}

}
