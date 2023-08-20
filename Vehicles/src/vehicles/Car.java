package vehicles;

public class Car implements Vehicle{

	@Override
	public void start() {
		System.out.println("Car started");
	}

	@Override
	public void accelerate() {
		System.out.println("Car accelerated");
	}

	@Override
	public void brake() {
		System.out.println("Car has applied brake");
	}

}
