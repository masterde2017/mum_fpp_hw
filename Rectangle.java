package prog1_4_5;

public class Rectangle {
	final private double length;
	final private double width;
	final private double area;
	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
		this.area = computeArea(length,width);
	}
	
	private double computeArea(double length, double width) {
		return length*width;
	}
	public double getLength() {
		return length;
	}
	public double getWidth() {
		return width;
	}
	public double getArea() {
		return area;
	}
	
}
