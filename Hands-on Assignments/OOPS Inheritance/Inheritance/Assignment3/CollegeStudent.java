public class CollegeStudent extends Student {
	private int year;
	private String major;
	CollegeStudent(String name,int rollno,int year,String major)
	{
		super(name,rollno);
		this.year=year;
		this.major=major;
	}
	
	public int getYear() { return year; }
	
	public String getMajor() {return major; }
}
