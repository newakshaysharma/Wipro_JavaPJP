package packages.account;

import exception.NegativeValueException;

public class SBAccount extends Account {
	private String accounttype;
	
	@Override
	public double calculateInterest() {
		if(accounttype.equals("NRI")) interestRate=6.0;
		else interestRate=4.0;
		
		return amount*interestRate/100;
	}
	
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate)throws NegativeValueException {
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
	public String getAccounttype() {
		return accounttype;
	}
	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}

}
