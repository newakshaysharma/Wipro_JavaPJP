public class Assignment3 {

	public static void main(String[] args) {
		Teacher teacher=new Teacher("Anurag Malik",1000000,"Computer Science");
		CollegeStudent coll=new CollegeStudent("Manpreet Singh",1508210069,2015,"CSE");
		
		System.out.println("Teacher info :\nName : "+teacher.getName()+"\nSalary : "+teacher.getSalary()+"\nSubject : "
						  +teacher.getSubject());
		
		System.out.println("Student info :\nName : "+coll.getName()+"\nRoll no. : "+coll.getRollno()+"\nYear : "
						  +coll.getYear()+"\nMajor : "+coll.getMajor());
		
	}

}