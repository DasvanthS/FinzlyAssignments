package shapes;

public class Triangle implements Shape{
	
	private double height;
	private double base;
	private double a;
	private double b;
	private double c;
	
	public Triangle(double height, double base, double a, double b, double c) {
		this.height = height;
		this.base = base;
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public double calculateArea() {
		return (height*base)/2;
		
	}

	@Override
	public double calculatePerimeter() {
		return a+b+c;
		
	}
	
	
}
