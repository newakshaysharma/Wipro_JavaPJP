class TestEmployee
{
	public static void main(String[] args)
	{
		Employee e=new Employee("Manpreet Singh",350004,2019,"mpschahal16");
		System.out.println("Employee info :\nEmployee name : "+e.getName()+
		"\nAnnual Salary : "+e.getAnnualSalary()+
		"\nYear Employee Started working : "+e.getYearOfJoin()+
		"\nNational insurance NO. : "+e.getNationalInsuranceNo());
	} 
	
}	