package junittest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import exception.NegativeValueException;
import packages.account.FDAccount;

public class TestFDAccount {
	FDAccount fd;
	@Before
	public void before(){
		fd=new FDAccount();
	}

	@Test(expected=NegativeValueException.class)
	public void testSetAmount1() throws NegativeValueException {
		fd.setAmount(-500000.0);
	}
	
	@Test
	public void testSetAmount2() throws NegativeValueException {
		fd.setAmount(500000.0);
		assertEquals(500000.0, fd.getAmount(), 0);;
	}
	
	@Test(expected=NegativeValueException.class)
	public void testSetInterest1() throws NegativeValueException {
		fd.setInterestRate(-10);
	}
	
	@Test
	public void testSetInterest2() throws NegativeValueException {
		fd.setInterestRate(10);
		assertEquals(10.0, fd.getInterestRate(), 0);
	}
	
	@Test(expected=NegativeValueException.class)
	public void testNoOfDays1() throws NegativeValueException {
		fd.setNoOfDays(-60);
	}
	
	@Test
	public void testNoOfDays2() throws NegativeValueException {
		fd.setNoOfDays(60);
		assertEquals(60, fd.getNoOfDays(), 0);
	}
	
	@Test(expected=NegativeValueException.class)
	public void testAccHolderage1() throws NegativeValueException {
		fd.setAgeOfACHolder(-55);
	}
	
	@Test
	public void testAccHolderage2() throws NegativeValueException {
		fd.setAgeOfACHolder(55);
		assertEquals(55, fd.getAgeOfACHolder());
	}
	
	@Test
	public void testCalculateInterest() throws NegativeValueException {
		//test below amount 10000000 and age below 65
		fd.setAmount(10000);
		fd.setAgeOfACHolder(55);
		
		//test for 0 to 7 days
		fd.setNoOfDays(5);
		assertEquals(0.0, fd.calculateInterest(),0);
		//test for 7 to 14
		fd.setNoOfDays(8);
		assertEquals(450.0, fd.calculateInterest(),0);
		//test for 15  to 29
		fd.setNoOfDays(20);
		assertEquals(475.0, fd.calculateInterest(),0);
		//test for 30 to 45
		fd.setNoOfDays(35);
		assertEquals(550.0, fd.calculateInterest(),0);
		//test for 45 to 60
		fd.setNoOfDays(50);
		assertEquals(700.0, fd.calculateInterest(),0);
		//test for 61 to 184
		fd.setNoOfDays(66);
		assertEquals(750.0, fd.calculateInterest(),0);
		//test for 185 to 365
		fd.setNoOfDays(190);
		assertEquals(800.0, fd.calculateInterest(),0);
		
		//amount < 10000000 and age > 65
		fd.setAgeOfACHolder(66);
		//test for 0 to 7 days
		fd.setNoOfDays(5);
		assertEquals(0.0, fd.calculateInterest(),0);
		//test for 7 to 14
		fd.setNoOfDays(8);
		assertEquals(500.0, fd.calculateInterest(),0);
		//test for 15  to 29
		fd.setNoOfDays(20);
		assertEquals(525.0, fd.calculateInterest(),0);
		//test for 30 to 45
		fd.setNoOfDays(35);
		assertEquals(600.0, fd.calculateInterest(),0);
		//test for 45 to 60
		fd.setNoOfDays(50);
		assertEquals(750.0, fd.calculateInterest(),0);
		//test for 61 to 184
		fd.setNoOfDays(66);
		assertEquals(800.0, fd.calculateInterest(),0);
		//test for 185 to 365
		fd.setNoOfDays(190);
		assertEquals(850.0, fd.calculateInterest(),0);
		
		//amount > 10000000
		fd.setAmount(10000000);
		//test for 0 to 7 days
		fd.setNoOfDays(5);
		assertEquals(0, fd.calculateInterest(),0);
		//test for 7 to 14
		fd.setNoOfDays(8);
		assertEquals(650000.0, fd.calculateInterest(),0);
		//test for 15  to 29
		fd.setNoOfDays(20);
		assertEquals(675000.0, fd.calculateInterest(),0);
		//test for 30 to 45
		fd.setNoOfDays(35);
		assertEquals(675000.0, fd.calculateInterest(),0);
		//test for 45 to 60
		fd.setNoOfDays(50);
		assertEquals(800000.0, fd.calculateInterest(),0);
		//test for 61 to 184
		fd.setNoOfDays(66);
		assertEquals(850000.0, fd.calculateInterest(),0);
		//test for 185 to 365
		fd.setNoOfDays(190);
		assertEquals(1000000.0, fd.calculateInterest(),0);
	}

}
