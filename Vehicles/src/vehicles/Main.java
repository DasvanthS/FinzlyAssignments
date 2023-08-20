package vehicles;

public class Main {

	public static void main(String[] args) {
		
		Car car = new Car();
		car.start();
		car.accelerate();
		car.brake();
		
		Motorcycle mc = new Motorcycle();
		mc.start();
		mc.accelerate();
		mc.brake();

	}

}
