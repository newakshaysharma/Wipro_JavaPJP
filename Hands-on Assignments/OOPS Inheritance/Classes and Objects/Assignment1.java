class Box {
	private double w;
	private double h;
	private double d;
	
	public Box(double w, double h, double d) {
		this.w = w;
		this.h = h;
		this.d = d;
	}
	
	public double getVol() {
		return w * h * d;
	}
}

public class Assignment1 {

	public static void main(String[] args) {
		Box bx = new Box(3, 2, 1);
		System.out.println(bx.getVol());
	}

}