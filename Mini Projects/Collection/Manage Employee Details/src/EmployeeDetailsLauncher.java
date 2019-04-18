import java.util.Scanner;



public class EmployeeDetailsLauncher {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeDb store = new EmployeeDb();
		int noofemp;
		System.out.println("Enter the No. of Employees");
		noofemp=sc.nextInt();
		
		for(int i=0;i<noofemp;i++)
		{
			Employee e=new Employee();
			System.out.println("Enter Emplyee "+(i+1)+" Details");
			System.out.println("Enter the Firstname");
			e.setFirstName(sc.next());
			System.out.println("Enter the Lastname");
			e.setLastName(sc.next());
			System.out.println("Enter the Mobile no.");
			e.setMobile_no(sc.nextInt());
			System.out.println("Enter the email.");
			e.setEmail(sc.next());
			System.out.println("Enter the Address.");
			e.setAddress(sc.next());
			store.addEmployee(e);
			
		}
		System.out.println("\n");
		store.listEployeeDetails();
		sc.close();

	}

}
