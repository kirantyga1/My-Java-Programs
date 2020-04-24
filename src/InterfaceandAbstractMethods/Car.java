package InterfaceandAbstractMethods;

public class Car implements VehicleInterface {

	
	@Override
	public void model() {

		System.out.println("Model method called");
	}

	@Override
	public void performance() {
		System.out.println("Performance method called");
	}

}
