package assignment2;

import java.util.List;
import java.util.Scanner;

import assignment2.employeepack.Employee;
import assignment2.employeepack.EmployeeDB;

public class Assignment2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EmployeeDB empdb=new EmployeeDB();
		int ch;
		while(true)
		{
			System.out.println("Main Menu"
					+ "\n1.Add Employee"
					+ "\n2.Delete Employee"
					+ "\n3.Show payslip of Employee"
					+ "\n4.List Details of all Employee"
					+ "\n5.Exit");
			
			if(!sc.hasNextInt()){
				sc.next();
				ch=0;
				}
			else ch=sc.nextInt();
			
			switch (ch) {
			case 1:
				Employee e=new Employee();
				System.out.print("Enter Employee Id : ");
				e.setEmpId(sc.nextInt());
				System.out.print("Enter Name : ");
				e.setEmpName(sc.next());
				System.out.print("Enter Email : ");
				e.setEmail(sc.next());
				System.out.print("Enter Gender : ");
				e.setGender(sc.next());
				System.out.print("Enter Salary : ");
				e.setSalary(sc.nextFloat());
				empdb.addEmployee(e);
				break;
			case 2:
				System.out.print("Enter Employee Id : ");
				empdb.deleteEmployee(sc.nextInt());
				break;
			case 3:
				System.out.print("Enter Employee Id : ");
				System.out.println(empdb.showPaySlip(sc.nextInt()));
				break;
			case 4:
				List<Employee> list=empdb.getList();
				System.out.printf("%-10s%-10s%-15s%-15s%-10s\n","Employee Id", "Name", "Email", "Gender", "Salary");
				for(Employee em:list)
					em.GetEmployeeDetails();
				break;
			case 5:
				sc.close();
				System.out.println("\n\nExiting...!!! Thanks for using the application.\n\n");
				return;
			default:
				System.out.println("\n\nPlease Enter correct choice.\n\n");
				break;
			}
		}
	}

}
