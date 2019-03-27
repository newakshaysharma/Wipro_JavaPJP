package assignment6;

import java.util.Iterator;
import java.util.Vector;

public class Assignment6 {

	public static void main(String[] args) {
		Vector<String> months=new Vector<String>();
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
