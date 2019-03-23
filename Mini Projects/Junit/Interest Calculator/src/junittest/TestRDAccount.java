package junittest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import exception.NegativeValueException;
import packages.account.RDAccount;

public class TestRDAccount {

	RDAccount rd;
	
	@Before
	public void before() {
		rd=new RDAccount();
	}
	
	@Test(expected=NegativeValueException.class)
	public void testSetInterest1() throws NegativeValueException {
		rd.setInterestRate(-10);
	}
	
	@Test
	public void testSetInterest2() throws NegativeValueException {
		rd.setInterestRate(10);
		assertEquals(10.0, rd.getInterestRate(), 0);
	}
	
	@Test(expected=NegativeValueException.class)
	public void testSetAmount1() throws NegativeValueException {
		rd.setAmount(-500000.0);
	}
	
	@Test
	public void testSetAmount2() throws NegativeValueException {
		rd.setAmount(500000.0);
		assertEquals(500000.0, rd.getAmount(), 0);;
	}
	
	@Test
	public void testSetNoOfMonths2() throws NegativeValueException {
		rd.setNoOfMonths(5);
		assertEquals(5, rd.getNoOfMonths(), 0);
	}
	
	@Test(expected=NegativeValueException.class)
	public void testSetNoOfMonths1() throws NegativeValueException {
		rd.setNoOfMonths(-5);
	}
	
	@Test(expected=NegativeValueException.class)
	public void testSetNoOfMonthlyAmt1() throws NegativeValueException {
		rd.setMonthlyAmount(-5000);
	}
	
	@Test
	public void testSetNoOfMonthlyAmt2() throws NegativeValueException {
		rd.setMonthlyAmount(5000);
		assertEquals(5000, rd.getMonthlyAmount(), 0);
	}
	
	@Test(expected=NegativeValueException.class)
	public void testAccHolderage1() throws NegativeValueException {
		rd.setAgeOfAccHolder(-55);
	}
	
	@Test
	public void testAccHolderage2() throws NegativeValueException {
		rd.setAgeOfAccHolder(55);
		assertEquals(55, rd.getAgeOfAccHolder());
	}
	
	@Test
	public void testCalculateInterest() throws NegativeValueException {
		rd.setAmount(10000);
		//age <65
		rd.setAgeOfAccHolder(55);
		
		//noOfMonths<6
		rd.setNoOfMonths(5);
		assertEquals(0.0, rd.calculateInterest(),0);
		//noOfMonths<9
		rd.setNoOfMonths(6);
		assertEquals(750.0, rd.calculateInterest(),0);
		//noOfMonths<12
		rd.setNoOfMonths(9);
		assertEquals(775.0, rd.calculateInterest(),0);
		//noOfMonths<15
		rd.setNoOfMonths(12);
		assertEquals(800.0, rd.calculateInterest(),0);
		//noOfMonths<18
		rd.setNoOfMonths(15);
		assertEquals(825.0, rd.calculateInterest(),0);
		//noOfMonths<21
		rd.setNoOfMonths(18);
		assertEquals(850.0, rd.calculateInterest(),0);
		//noOfMonths>21
		rd.setNoOfMonths(21);
		assertEquals(875.0, rd.calculateInterest(),0);
		
		
		//age >65
		rd.setAgeOfAccHolder(68);
		
		//noOfMonths<6
		rd.setNoOfMonths(5);
		assertEquals(0.0, rd.calculateInterest(),0);
		//noOfMonths<9
		rd.setNoOfMonths(6);
		assertEquals(800.0, rd.calculateInterest(),0);
		//noOfMonths<12
		rd.setNoOfMonths(9);
		assertEquals(825.0, rd.calculateInterest(),0);
		//noOfMonths<15
		rd.setNoOfMonths(12);
		assertEquals(850.0, rd.calculateInterest(),0);
		//noOfMonths<18
		rd.setNoOfMonths(15);
		assertEquals(875.0, rd.calculateInterest(),0);
		//noOfMonths<21
		rd.setNoOfMonths(18);
		assertEquals(900.0, rd.calculateInterest(),0);
		//noOfMonths>21
		rd.setNoOfMonths(21);
		assertEquals(925.0, rd.calculateInterest(),0);
		
	}
	
}
