class Employee extends Person
{
	private double annualsalary;
	private int yearofjoin;
	private String nationalinsuranceno;
	
	public Employee(String name,double annualsalary,int yearofjoin,String nationalinsuranceno) {
		super(name);
		this.annualsalary=annualsalary;
		this.yearofjoin=yearofjoin;
		this.nationalinsuranceno=nationalinsuranceno;
	}

	public double getAnnualSalary()
	{
		return annualsalary;
	}
	
	public int getYearOfJoin()
	{
		return yearofjoin;
	}
	
	public String getNationalInsuranceNo()
	{
		return nationalinsuranceno;
	}
	
	public String getName()
	{
		return name;
	}
}	