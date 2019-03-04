public class KotMBank extends GeneralBank{
	
	@Override
	public double getSavingsInterestRate()
	{
		return 6.0;
	}
	
	@Override
	public double getFixedDepositInterestRate()
	{
		return 9.0;
	}
}
