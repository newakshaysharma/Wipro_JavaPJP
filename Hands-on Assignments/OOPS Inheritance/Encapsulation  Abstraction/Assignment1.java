class Author {
	private String name;
	private String email;
	private char gender;
	
	public Author(String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public char getGender() {
		return gender;
	}	
}

class Book {
	private String name;
	private Author author;
	private double price;
	private int qtyInStock;
	
	public Book(String name, Author author, double price, int qtyInStock) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.qtyInStock = qtyInStock;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQtyInStock() {
		return qtyInStock;
	}

	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}

	public String getName() {
		return name;
	}

	public Author getAuthor() {
		return author;
	}	
}

public class Assignment1 {

	public static void main(String[] args) {
		Author author = new Author("Manpreet Singh","mpschahal16@gmail.com",'M');
		Book book = new Book("Ethical Hacking",author,255.56,55);
		
		System.out.printf("Book Details are:\nName : "+book.getName()+
		"\nPrice :"+book.getPrice()+"\nQuantity in Stock : "+book.getQtyInStock()+
		"\nAuthor is : "+book.getAuthor().getName()+"\nEmail : "+book.getAuthor().getEmail()+
		"\nGender : "+book.getAuthor().getGender());
	}

}