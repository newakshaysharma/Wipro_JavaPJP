package assignment1;

public class AdultUser implements LibraryUser {

	int age;
	String booktype;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBooktype() {
		return booktype;
	}

	public void setBooktype(String booktype) {
		this.booktype = booktype;
	}

	public void registerAccount() {
		if(age>12) System.out.println("You have successfully registered under an Adult Account.");
		else System.out.println("Sorry, Age must be greater than 12 to register as an adult.");
		
	}

	public void requestBook() {
		if (booktype.equalsIgnoreCase("Fiction")) System.out.println("Book Issued successfully, please return the book within 7 days.");
		else System.out.println("Oops, you are allowed to take only adult Fiction books.");
		
	}
}
