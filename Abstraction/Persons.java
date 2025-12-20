package Abstraction;


public class Persons implements Shop{

	@Override
	public void Phones() {
		System.out.println("------");
		
	}
	public static void main(String[] args) {
		Persons p;
		p = new Persons();
		p.Phones();
		Iphone i;
		i = new Iphone();
		i.Phones();
		
		}
	

}
