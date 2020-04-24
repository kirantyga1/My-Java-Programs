package InterfaceandAbstractMethods;

public class HDFC extends BankAbstract {

	@Override
	public void loan() {
		System.out.println("HDFC loan called...!");
	}
	
	 public void debit() {
		 System.out.println("debit method called ......!");
	 }
	 public void credit() {
		 System.out.println("credit method called.....!"); 
	 }

}
