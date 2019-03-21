package topic3.src.assignment1;

import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class EmployeeTest {
	
	Employee e1;
	ArrayList<String> namelist;
	
	@Before
	public void before()
	{
		e1=new Employee();
		namelist=new ArrayList<String>();
		namelist.add("Manpreet");
		namelist.add("Singh");
		namelist.add("Jaspreet");
		
	}
	
	@Test
	public void testEmployee(){
		assertEquals("Result","FOUND",e1.findName(namelist,"Singh"));
	}

}
