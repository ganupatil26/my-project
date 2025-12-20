package Abstraction;

public class RecivedPerson extends Zomato {
	
	public void order () {
		
		System.out.println("enjoy your meal,thank you..!");
	}

	public static void main(String[] args) {
		Zomato z;
		z = new Zomato();
		z.order();
		z = new RecivedPerson();
		z.order();
	}
}
