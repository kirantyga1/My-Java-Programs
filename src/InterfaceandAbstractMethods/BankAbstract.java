package InterfaceandAbstractMethods;

public abstract class BankAbstract {

	int i=10;
	
	static int j=20;
	public  String str="hi";
	
	 public abstract void loan();
	 
	 public void debit() {
		 System.out.println("debit method called");
	 }
	 public void credit() {
		 System.out.println("credit method called"); 
	 }
	
}
