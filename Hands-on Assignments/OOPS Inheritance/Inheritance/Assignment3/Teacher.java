public class Teacher extends Person {
	private int salary;
	private String subject;
	
	Teacher(String name,int salary,String subject)
	{
		super(name);
		this.salary=salary;
		this.subject=subject;
	}
	
	public int getSalary() { return salary; }
	
	public String getSubject() {return subject; }
}