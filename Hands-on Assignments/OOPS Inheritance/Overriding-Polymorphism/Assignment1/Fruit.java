public class Fruit {
	private String name;
	private String taste;
	private int size;
	
	public Fruit() {
		name = "name";
		taste = "taste";
		size = 0;
	}
	
	public void eat () {
		System.out.println(name + " is " + taste);
	}
}