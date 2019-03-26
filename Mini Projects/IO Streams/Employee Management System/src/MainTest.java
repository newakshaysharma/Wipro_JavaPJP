import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;


public class MainTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Scanner sc=new Scanner(System.in);
		int ch;
		
		String filename = "Database.db";
		
		FileOutputStream fos = new FileOutputStream(filename);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		while(true)
		{
			System.out.println("Main Menu\n"
					+ "1.Add an Employee\n"
					+ "2.Display All\n"
					+ "3.Exit");
			if(!sc.hasNextInt()){
				sc.next();
				ch=0;
				}
			else ch=sc.nextInt();
			switch (ch) {
			
			case 1:
				Employee e=new Employee();
				System.out.print("Enter Employee ID : ");
				e.setEmpid(sc.nextInt());
				System.out.print("Enter Employee Name : ");
				e.setEmpName(sc.next());
				System.out.print("Enter Employee Age : ");
				e.setAge(sc.nextInt());
				System.out.print("Enter Employee Salary : ");
				e.setSalary(sc.nextDouble());
				oos.writeObject(e);
				oos.flush();
				break;
			case 2:
				FileInputStream fis = new FileInputStream(filename);
				ObjectInputStream ois = new ObjectInputStream(fis);
				Employee t;
				System.out.println("-----Report-----");
				while(fis.available()>0)
				{
					t=(Employee) ois.readObject();
					System.out.println(t.getEmpid()+" "+t.getEmpName()+" "+t.getAge()+" "+t.getSalary());
				}
				ois.close();
				
				System.out.println("-----End of Report-----");
				break;
			case 3:
				sc.close();
				oos.close();
				System.out.print("Exiting the system");
				return;
			default:
				System.out.println("\n\nPlease Enter correct choice.\n\n");
			}
		}

	}

}
