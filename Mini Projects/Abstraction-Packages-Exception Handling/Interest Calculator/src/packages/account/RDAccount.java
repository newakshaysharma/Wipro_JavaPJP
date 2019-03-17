package packages.account;

public class RDAccount extends Account {

	private int ageOfAccHolder;
	public int getAgeOfAccHolder() {
		return ageOfAccHolder;
	}
	public void setAgeOfAccHolder(int ageOfAccHolder) {
		this.ageOfAccHolder = ageOfAccHolder;
	}
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
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getNoOfMonths() {
		return noOfMonths;
	}
	public void setNoOfMonths(int noOfMonths) {
		this.noOfMonths = noOfMonths;
	}
	public double getMonthlyAmount() {
		return monthlyAmount;
	}
	public void setMonthlyAmount(double monthlyAmount) {
		this.monthlyAmount = monthlyAmount;
	}

}
