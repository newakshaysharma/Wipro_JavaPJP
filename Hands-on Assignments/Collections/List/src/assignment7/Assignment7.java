package assignment7;

import java.util.Iterator;
import java.util.Vector;

public class Assignment7 {

	public static void main(String[] args) {
		Vector<Employee> list = new Vector<Employee>();
		
		list.add(new Employee(101, "Manpreet", "xyz@gmail.com", "M", 20000));
		list.add(new Employee(102, "Jaspreet", "ABC@gmail.com", "M", 30000));
		
		Iterator<Employee> it = list.iterator();
		while (it.hasNext()) 
			it.next().GetEmployeeDetails();


	}

}
