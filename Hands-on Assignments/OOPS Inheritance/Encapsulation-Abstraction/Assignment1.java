class Author {
	private String name;
	private String email;
	private char gender;
	
	public void setName(String name)
	{
		this.name=name;
	}

	public String getName() {
		return name;
	}
	
	public void setEmail(String email)
	{
		this.email=email;
	}

	public String getEmail() {
		return email;
	}
	
	public void setGender(char gender)
	{
		this.gender=gender;
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

	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAuthor(Author author)
	{
		this.author=author;
	}

	public Author getAuthor() {
		return author;
	}	
}

public class Assignment1 {

	public static void main(String[] args) {
		Author author = new Author();
		author.setName("Manpreet Singh");
		author.setEmail("mpschahal16@gmail.com");
		author.setGender('M');
		
		Book book = new Book();
		
		book.setName("Ethical Hacking");
		book.setAuthor(author);
		book.setPrice(255.56);
		book.setQtyInStock(55);
		
		System.out.printf("Book Details are:\nName : "+book.getName()+
		"\nPrice :"+book.getPrice()+"\nQuantity in Stock : "+book.getQtyInStock()+
		"\nAuthor is : "+book.getAuthor().getName()+"\nEmail : "+book.getAuthor().getEmail()+
		"\nGender : "+book.getAuthor().getGender());
	}

}
