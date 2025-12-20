package Abstraction;

public class Reciver extends Sender {

	public void notii() {
		System.out.println("checked");
	}
	public static void main(String[] args) {
		Sender s;
		s = new Sender();
		s.notii();
		s = new Reciver();
		s.notii();
				
	}
}
