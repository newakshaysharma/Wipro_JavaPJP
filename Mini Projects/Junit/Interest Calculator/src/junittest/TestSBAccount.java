package junittest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import packages.account.SBAccount;
import exception.NegativeValueException;

public class TestSBAccount {
	SBAccount sb;
	
	@Before
	public void before(){
		sb=new SBAccount();
	}

	@Test(expected=NegativeValueException.class)
	public void testSetAmount1() throws NegativeValueException {
		sb.setAmount(-500000.0);
	}
	
	@Test
	public void testSetAmount2() throws NegativeValueException {
		sb.setAmount(500000.0);
		assertEquals(500000.0, sb.getAmount(), 0);;
	}
	
	@Test(expected=NegativeValueException.class)
	public void testSetInterest1() throws NegativeValueException {
		sb.setInterestRate(-10);
	}
	
	@Test
	public void testSetInterest2() throws NegativeValueException {
		sb.setInterestRate(10);
		assertEquals(10.0, sb.getInterestRate(), 0);
	}
	
	@Test
	public void testAccountType(){
		sb.setAccounttype("NRI");
		assertEquals("NRI",sb.getAccounttype());
	}
	
	@Test
	public void testCalculateInterest() throws NegativeValueException{
		sb.setAmount(10000.0);
		assertEquals(400.0, sb.calculateInterest(), 0);
		sb.setAccounttype("NRI");
		assertEquals(600.0, sb.calculateInterest(), 0);
		
	}

}
