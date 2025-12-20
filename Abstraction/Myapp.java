package Abstraction;


public class Myapp extends OlaRide {

	@Override
	public void bookRide() {
		System.out.println("your ride is booked");
		
	}
	public static void main(String[] args) {
		OlaRide ma;
		ma = new Myapp();
		ma.bookRide();
		ma = new OlaRide();
		ma.bookRide();
		
	}
	

}
