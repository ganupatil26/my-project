package Abstraction;

public class Customer implements Loan{

	@Override
	public int loanNumber() {
		System.out.println("your loan num");
		return 1234;
	}
	
	 

}
