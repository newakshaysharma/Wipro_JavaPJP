public class Assignment1
{
	public static void main(String args[])
	{
		ICICIBank i=new ICICIBank();
		KotMBank k=new KotMBank();
		GeneralBank g1=new ICICIBank();
		GeneralBank g2=new KotMBank();
		
		//using Bank specific instance
		System.out.println(i.getSavingsInterestRate());
		System.out.println(i.getFixedDepositInterestRate());
		System.out.println(k.getSavingsInterestRate());
		System.out.println(k.getFixedDepositInterestRate());
		
		//using General Bank Instance
		
		System.out.println(g1.getSavingsInterestRate());
		System.out.println(g1.getFixedDepositInterestRate());
		System.out.println(g2.getSavingsInterestRate());
		System.out.println(g2.getFixedDepositInterestRate());
	}
}