package packages.account;

import exception.NegativeValueException;

public class RDAccount extends Account {

	private int ageOfAccHolder;
	private int noOfMonths;
	private double monthlyAmount;
	
	@Override
	public double calculateInterest() {
		if(noOfMonths>=6&&noOfMonths<9)
			interestRate=7.50;
		else if(noOfMonths<12)
			interestRate=7.75;
		else if (noOfMonths<15)
			interestRate=8.00;
		else if (noOfMonths<18)
			interestRate=8.25;
		else if (noOfMonths<21)
			interestRate=8.50;
		else 
			interestRate=8.75;
		
		//case of senior citizen
		if(ageOfAccHolder>=65&&interestRate!=0) 
			interestRate=interestRate+0.50;
		
		return amount*interestRate/100;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) throws NegativeValueException {
		if(interestRate<0) throw new NegativeValueException(NegativeValueException.invalid_interestrate);
		this.interestRate = interestRate;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount)throws NegativeValueException {
		if(amount<0) throw new NegativeValueException(NegativeValueException.invalid_amount);
		this.amount = amount;
	}
	public int getNoOfMonths() {
		return noOfMonths;
	}
	public void setNoOfMonths(int noOfMonths)throws NegativeValueException {
		if(noOfMonths<0) throw new NegativeValueException(NegativeValueException.invalid_month);
		this.noOfMonths = noOfMonths;
	}
	public double getMonthlyAmount() {
		return monthlyAmount;
	}
	public void setMonthlyAmount(double monthlyAmount)throws NegativeValueException {
		if(monthlyAmount<0) throw new NegativeValueException(NegativeValueException.invalid_monthlyamount);
		this.monthlyAmount = monthlyAmount;
	}
	
	public int getAgeOfAccHolder() {
		return ageOfAccHolder;
	}
	public void setAgeOfAccHolder(int ageOfAccHolder)throws NegativeValueException {
		if(ageOfAccHolder<0) throw new NegativeValueException(NegativeValueException.invalid_age);
		this.ageOfAccHolder = ageOfAccHolder;
	}

}
