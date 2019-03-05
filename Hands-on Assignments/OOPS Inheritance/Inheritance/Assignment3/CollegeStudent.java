public class CollegeStudent extends Student {
	private int year;
	private String collegeName;
	CollegeStudent(String name,String dateOfBirth,int studentId,int year,String collegeName)
	{
		super(name,dateOfBirth,studentId);
		this.year=year;
		this.collegeName=collegeName;
	}
	
	public int getYear() { return year; }
	
	public String getCollegeName() {return collegeName; }
}
