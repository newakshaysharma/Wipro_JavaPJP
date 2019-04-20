public class Box implements Comparable<Box> {
	
	private double length;
	private double width;
	private double height;
	
	public Box(double length, double width, double height) {
		super();
		this.length = length;
		this.width = width;
		this.height = height;
	}
	
	public Box() {
	}
	
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}


	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public int compareTo(Box arg0) {
		double thisvol=this.length*this.width*this.height;
		double arg0val=arg0.length*arg0.width*arg0.height;
		
		if(thisvol>arg0val) return 1;
		else if(thisvol<arg0val) return -1;
		else return 0;
	}

	@Override
	public String toString() {
		double volume = (length * width * height);
		String str = String.format("Length = " + length + ", Width = " + width + 
				", Height = " + height + ", Volume = %.2f", volume);
	
		return str;
	}
	
	


}
