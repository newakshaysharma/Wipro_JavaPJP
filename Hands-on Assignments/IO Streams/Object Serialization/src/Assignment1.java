import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;
import java.util.Scanner;


public class Assignment1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();
		
		System.out.print("Enter name: ");
		emp.setName(sc.next());
		System.out.println("Enter D.O.B.: ");
		System.out.print("Enter date :");
		int dat=sc.nextInt();
		System.out.print("Enter month in no.: ");
		int mon=sc.nextInt();
		System.out.print("Enter year : ");
		int year=sc.nextInt();
		Date d=new Date();
		d.setDate(dat);
		d.setMonth(mon);
		d.setYear(year);
		emp.setDate(d);
		System.out.print("Enter department: ");
		emp.setDepartment(sc.next());
		System.out.print("Enter designation: ");
		emp.setDesignation(sc.next());
		System.out.print("Enter salary: ");
		emp.setSalary(sc.nextDouble());
		sc.nextLine();
		
		sc.close();

		FileOutputStream fos=new FileOutputStream("DATA");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(emp);
		oos.close();
		
		FileInputStream fis=new FileInputStream("DATA");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Employee ret=(Employee) ois.readObject();
		System.out.println("Name : "+ret.getName()+"\nD.O.B : "+ret.getDate().getDate()+"/"+ret.getDate().getMonth()+"/"+ret.getDate().getYear()+
				"\nDepartment : "+ret.getDepartment()+"\nDesignation : "+
		ret.getDesignation()+"\nSalary : "+ret.getSalary());
		
		ois.close();
	}

}
