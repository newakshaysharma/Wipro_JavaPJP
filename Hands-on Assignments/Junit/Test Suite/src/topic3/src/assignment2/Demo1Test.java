package topic3.src.assignment2;

import static org.junit.Assert.*;

import org.junit.Test;

public class Demo1Test {

	@Test
	public void testIsStringPalindrom() {
		Demo1 d1=new Demo1();

		assertTrue("Result: ", d1.palindromeCheck("madam"));
		assertTrue("Result: ", d1.palindromeCheck("mom"));
		assertTrue("Result: ", d1.palindromeCheck("dad"));
		assertTrue("Result: ", d1.palindromeCheck("malayalam"));
		assertFalse("Result: ", d1.palindromeCheck("manpreet"));
		assertFalse("Result: ", d1.palindromeCheck("singh"));
	}

}
