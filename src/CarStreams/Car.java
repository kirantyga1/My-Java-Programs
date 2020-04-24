package CarStreams;

public class Car<k,v> {

	
	 String name;
	 String model;
	 double price;

	public Car(String name, String model, double price) {
		super();
		this.name = name;
		this.model = model;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", model=" + model + ", price=" + price + "]";
	}
}
