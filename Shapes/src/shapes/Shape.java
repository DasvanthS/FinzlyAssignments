package shapes;

public interface Shape {
	
	double calculateArea();
	
	double calculatePerimeter();

}

class Circle implements Shape{
	
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		return 3.14*radius*radius;
		
	}

	@Override
	public double calculatePerimeter() {
		return 2*3.14*radius;
		
	}
	
	
}

class Rectangle implements Shape{
	
	private double length;
	private double width;
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	@Override
	public double calculateArea() {
		return length*width;
		
	}

	@Override
	public double calculatePerimeter() {
		return 2*(length+width);
		
	}
	
	
}

class Triangle implements Shape{
	
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

