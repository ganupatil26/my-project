package Abstraction;

public class Paytem implements Upi{

	@Override
	public void makePaymentI() {
		System.out.println("ooo");
		
	}
	public static void main(String[] args) {
		Paytem p;
		p = new Paytem();
		p.makePaymentI();
		
	}
	
}
