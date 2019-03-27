package assignment1;

import java.util.ArrayList;
import java.util.Iterator;

public class Assignment1 {

	public static void main(String[] args) {
		ArrayList<String> months=new ArrayList<String>();
		months.add("January");
		months.add("February");
		months.add("March");
		months.add("April");
		months.add("May");
		months.add("June");
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
