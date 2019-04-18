import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeDb {
	
	private ArrayList<Employee> list;

	public EmployeeDb() {
		list=new ArrayList<Employee>();
	}

	public ArrayList<Employee> getList() {
		return list;
	}
	
	public void addEmployee(Employee e){
		list.add(e);
	}
	
	public void listEployeeDetails(){
		if(list.isEmpty())
		{
			System.out.println("No information is added till now.");
			return;
		}
		System.out.println("Employee list");
		System.out.format("%-15s %-15s %-15s %-30s %-15s\n","Firstname","Lastname","Moblie","Email","Address");
		Collections.sort(list,new Comparator<Employee>() {
		    public int compare(Employee e1,Employee e2) {
		       return e1.getFirstName().compareToIgnoreCase(e2.getFirstName());
		    }
		});
		for (Employee e:list){
			System.out.format("%-15s %-15s %-15s %-30s %-15s\n",e.getFirstName(),e.getLastName(),e.getMobile_no(),
					e.getEmail(),e.getAddress());
		}
		
	}
	

}
