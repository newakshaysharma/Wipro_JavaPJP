class Patient {
	String patientName;
	double height;
	double weight;
	Patient(String patientName,double height,double weight)
	{
		this.patientName=patientName;
		this.height=height;
		this.weight=weight;
	}
	public double computeBMI()
	{
		return weight/(height*height);
	}
}

public class Assignment3 {

	public static void main(String[] args) {
		Patient p1=new Patient("Manpreet Singh",1.79832,82);
		System.out.println(p1.computeBMI());
	}

}