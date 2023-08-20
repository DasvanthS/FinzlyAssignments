package shapes;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Circle c = new Circle(3);
		Rectangle r = new Rectangle(2,4);
		Triangle t = new Triangle(5,2,1,2,3);
		
		List<Shape> list = new ArrayList<>();
		list.add(c);
		list.add(r);
		list.add(t);

		
		list.forEach(l -> System.out.println("Area : " + l.calculateArea() + " Perimeter : " + l.calculatePerimeter()));
		
		

	}

}
