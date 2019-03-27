package assignment2.employeepack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeDB {
	
	private List<Employee> list=new ArrayList<Employee>();

	public List<Employee> getList() {
		return list;
	}

	public EmployeeDB() {
	}
	
	public boolean addEmployee(Employee e){
		return list.add(e);
	}
	
	public boolean deleteEmployee(int empId){
		Iterator<Employee> it=list.iterator();
		while(it.hasNext())
		{
			Employee temp=it.next();
			if(temp.getEmpId()==empId)
			{
				it.remove();
				return true;
				
			}
		}
		
		return false;
	}
	
	public String showPaySlip(int empId){
		String payslip="Invalid Employee ID";
		Iterator<Employee> it=list.iterator();
				while(it.hasNext())
				{
					Employee temp=it.next();
					if(temp.getEmpId()==empId)
					{
						payslip="Pay slip for employee id " + empId + " is " +temp.getSalary();
					}
				}
		return payslip;
	}

}
