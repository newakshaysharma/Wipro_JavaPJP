public class ICICIBank extends GeneralBank{
	
	@Override
	public double getSavingsInterestRate()
	{
		return 4.0;
	}
	
	@Override
	public double getFixedDepositInterestRate()
	{
		return 8.5;
	}
}
