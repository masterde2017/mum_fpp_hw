package prog1_4_5;

public class Triangle {
	final private double base;
	final private double height;
	final private double area;
	public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
		this.area = computeArea(base,height);
	}
	public double getBase() {
		return base;
	}
	public double getHeight() {
		return height;
	}
	
	
	public double getArea() {
		return area;
	}
	private double computeArea(double base,double height) {
		return base*height/2;
	}
	
	
	
}
