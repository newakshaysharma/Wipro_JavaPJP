package topic2.src;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class Test1 {

	@Test
	public void teststringConcat()
	{
		Demo1 d1=new Demo1();
		assertEquals("Result","Manpreet Singh",d1.stringConcat("Manpreet ", "Singh"));
		assertEquals("Result","ManpreetSingh",d1.stringConcat("Manpreet", "Singh"));
	}

}
