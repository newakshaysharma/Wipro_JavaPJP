package assignment1;

public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		
		KidUsers kidUsers1=new KidUsers();
		kidUsers1.setAge(8);
		kidUsers1.setBooktype("kids");
		kidUsers1.registerAccount();
		kidUsers1.requestBook();
		
		System.out.println();
		
		KidUsers kidUsers2=new KidUsers();
		kidUsers2.setAge(13);
		kidUsers2.setBooktype("fiction");
		kidUsers2.registerAccount();
		kidUsers2.requestBook();
		
		System.out.println();
		
		AdultUser adultUser1=new AdultUser();
		adultUser1.setAge(15);
		adultUser1.setBooktype("Fiction");
		adultUser1.registerAccount();
		adultUser1.requestBook();
		
		System.out.println();
		
		AdultUser adultUser2=new AdultUser();
		adultUser2.setAge(9);
		adultUser2.setBooktype("kids");
		adultUser2.registerAccount();
		adultUser2.requestBook();

	}

}
