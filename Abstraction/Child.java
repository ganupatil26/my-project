package Abstraction;

public class Child implements Father , Mother {

	@Override
	public void cooking() {
		System.out.println("kichadi");
	}

	@Override
	public void surname() {
		System.out.println("patil");
		
	}
	
	public static void main(String[] args) {
		Child c;
		c = new Child();
		c.cooking();
		c.surname();
		}
	


}
