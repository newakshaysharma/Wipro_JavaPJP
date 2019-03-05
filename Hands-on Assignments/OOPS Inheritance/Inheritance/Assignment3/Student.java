class Student extends Person
{
	private int studentId;
	
	Student(String name,String dateOfBirth,int studentId) {
		super(name,dateOfBirth);
		this.studentId = studentId;
	}

	public int getStudentId() {
		return studentId;
	}
}	
