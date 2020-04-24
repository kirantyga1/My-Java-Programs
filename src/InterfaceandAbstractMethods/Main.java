package InterfaceandAbstractMethods;

public class Main {

	public static void main(String[] args) {

		BankAbstract hdfc = new HDFC();

		hdfc.credit();
		hdfc.debit();

		System.out.println(hdfc.j = 56);
		System.out.println(hdfc.i = 56);
		System.out.println(hdfc.str = "Kiran");

		
		
		VehicleInterface veh = new Car();
		veh.model();
		veh.performance();
		
		Test test=new Test();
		
		System.out.println(test.setS1("Kiran Kumar mothukuri"));
		
		
		
	}
}
