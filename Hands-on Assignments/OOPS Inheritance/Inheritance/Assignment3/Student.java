class Student extends Person
{
	private int rollno;
	
	Student(String name,int rollno) {
		super(name);
		this.rollno = rollno;
	}

	public int getRollno() {
		return rollno;
	}
}	
