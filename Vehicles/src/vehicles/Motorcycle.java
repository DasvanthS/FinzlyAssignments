package vehicles;

public class Motorcycle implements Vehicle{
	
	@Override
	public void start() {
		System.out.println("Mototcycle started");
	}

	@Override
	public void accelerate() {
		System.out.println("Mototcycle accelerated");
	}

	@Override
	public void brake() {
		System.out.println("Mototcycle has applied brake");
	}

}
