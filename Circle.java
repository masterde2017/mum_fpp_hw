package prog1_4_5;

public class Circle {
	final private double radius;
	final private double area;
	public Circle(double radius) {
		super();
		this.radius = radius;
		this.area=computeArea();
	}
	
	private double computeArea() {
		return Math.PI*radius*radius;
	}
	
	public double getRadius() {
		return radius;
	}
	public double getArea() {
		return area;
	}
	
	public static void main(String[] args) {
		System.out.println(new Circle(1).getArea());
	}
	
}
