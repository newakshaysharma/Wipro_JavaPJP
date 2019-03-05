import java.util.Arrays;
public class Project1 {
	
	public static String[] empTableHeader = {"EmpNo", "EmpName", "JoinDate", "DesignationCode", "Department", "Basic", "HRA", "IT"};
	
	public static String[][] empTable = new String[][] {
		{"1001", "Ashish", "01/04/2009", "e", "R&D", "20000", "8000", "3000"},
		{"1002", "Sushma", "23/08/2012", "c", "PM", "30000", "12000", "9000"},
		{"1003", "Rahul", "12/11/2008", "k", "Acct", "10000", "8000", "1000"},
		{"1004", "Chahat", "29/01/2013", "r", "FrontDesk", "12000", "6000", "2000"},
		{"1005", "Ranjan", "16/07/2005", "m", "Engg", "50000", "20000", "20000"},
		{"1006", "Suman", "1/1/2000", "e", "Manufacturing", "23000", "9000", "4400"},
		{"1007", "Tanmay", "12/06/2006", "c", "PM", "29000", "12000", "10000"}
	};
	
	public static String[] daTableHrader = {"DesignationCode", "Designation", "DA"};
	
	public static String[][] daTable = new String[][] {
		{"e", "Engineer", "20000"},
		{"c", "Consultant", "32000"},
		{"k", "Clerk", "12000"},
		{"r", "Receptionist", "15000"},
		{"m", "Manager", "40000"}
	};

	public static void main(String[] args) {
		
		if(args.length!=1)
		{
			return;
		}
		
		String enteredEmpId = args[0];
		int infoOnIndex=isInfoPresent(enteredEmpId);
		if(infoOnIndex!=-1)
		{
			String designationCode = empTable[infoOnIndex][Arrays.asList(empTableHeader).indexOf("DesignationCode")];
			String designation="";
			int dA=0;
			switch(designationCode)
			{
				case "e":
					{
						designation=daTable[0][Arrays.asList(daTableHrader).indexOf("Designation")];
						dA=Integer.parseInt(daTable[0][Arrays.asList(daTableHrader).indexOf("DA")]);
						break;
					}
				case "c":
					{
						designation=daTable[1][Arrays.asList(daTableHrader).indexOf("Designation")];
						dA=Integer.parseInt(daTable[1][Arrays.asList(daTableHrader).indexOf("DA")]);
						break;
					}
				case "k":
					{
						designation=daTable[2][Arrays.asList(daTableHrader).indexOf("Designation")];
						dA=Integer.parseInt(daTable[2][Arrays.asList(daTableHrader).indexOf("DA")]);
						break;
					}
				case "r":
					{
						designation=daTable[3][Arrays.asList(daTableHrader).indexOf("Designation")];
						dA=Integer.parseInt(daTable[3][Arrays.asList(daTableHrader).indexOf("DA")]);
						break;
					}
				case "m":
					{
						designation=daTable[4][Arrays.asList(daTableHrader).indexOf("Designation")];
						dA=Integer.parseInt(daTable[4][Arrays.asList(daTableHrader).indexOf("DA")]);
						break;
					}
			}
			int basic=Integer.parseInt(empTable[infoOnIndex][Arrays.asList(empTableHeader).indexOf("Basic")]);
			int hra=Integer.parseInt(empTable[infoOnIndex][Arrays.asList(empTableHeader).indexOf("HRA")]);
			int it=Integer.parseInt(empTable[infoOnIndex][Arrays.asList(empTableHeader).indexOf("IT")]);
			int salary=basic+hra+dA-it;
			String empName=empTable[infoOnIndex][Arrays.asList(empTableHeader).indexOf("EmpName")];
			String department=empTable[infoOnIndex][Arrays.asList(empTableHeader).indexOf("Department")];
			System.out.printf("%-10s%-10s%-15s%-15s%-10s\n", "Emp No", "Emp Name", "Department", "Designation", "Salary");
			System.out.printf("%-10s%-10s%-15s%-15s%-10s", enteredEmpId, empName, department, designation, salary);
		}
		else
		{
			System.out.println("There is no employee with empid : "+enteredEmpId);
		}
		
		
		
		
	}
	
	public static int isInfoPresent(String emId)
	{
		int rowlength=empTable.length;
		int index=-1;
		for(int i=0;i<rowlength;i++)
		{
			if(emId.equals(empTable[i][0]))
			   {
				   index=i;
			   }
		}
		return index;
	}
	
	

}