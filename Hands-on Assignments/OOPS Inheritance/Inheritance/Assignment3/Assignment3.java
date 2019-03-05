public class Assignment3 {

	public static void main(String[] args) {
		Person person=new Person("MPS","16 OCT,1997");
		
		Teacher teacher=new Teacher("Anurag Malik","1 Jan,1975",1000000,"Computer Science");
		
		Student student=new Student("MPS","16 OCT,1997",1508210069);
		
		CollegeStudent coll=new CollegeStudent("Manpreet Singh","16 Oct,1997",1508210069,4,"Moradabad Institute of Technology");
		
		System.out.println("Person info :\nName : "+person.getName()+"\nD.O.B. : "+person.getDateOfBirth()+"\n");
		
		System.out.println("Teacher info :\nName : "+teacher.getName()+"\nD.O.B. : "+teacher.getDateOfBirth()+"\nSalary : "+teacher.getSalary()+"\nSubject : "
						  +teacher.getSubject()+"\n");
		
		System.out.println("Student info :\nName : "+student.getName()+"\nD.O.B. : "+student.getDateOfBirth()+"\nStudent Id : "+student.getStudentId()+"\n");
		
		System.out.println("College Student info :\nName : "+coll.getName()+"\nD.O.B. : "+coll.getDateOfBirth()+"\nCollege Student Id : "+coll.getStudentId()+"\nYear : "
						  +coll.getYear()+"\nCollege : "+coll.getCollegeName());
		
	}

}
