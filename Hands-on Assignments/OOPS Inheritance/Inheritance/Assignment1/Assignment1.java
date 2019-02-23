class Animal {
	
	public void eat () {
		System.out.println("Eat of animal");
	}
	
	public void sleep () {
		System.out.println("Sleep of animal");
	}
}

class Bird extends Animal {

	@Override
	public void eat () {
		System.out.println("Eat of Bird");
	}
	
	@Override
	public void sleep () {
		System.out.println("Sleep of Bird");
	}
	
	public void fly () {
		System.out.println("Fly of Bird");
	}
}

public class Assignment1 {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.eat();
		animal.sleep();

		Bird bird = new Bird();
		bird.eat();
		bird.sleep();
		bird.fly();
	}

}