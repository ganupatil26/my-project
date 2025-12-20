package Abstraction;

import java.util.Scanner;

public class Sender implements Notification {

	@Override
	public void notii() {
		System.out.println("enetr your msg");
		Scanner sc  = new Scanner(System.in);
		String msg= sc.nextLine();
		
		System.out.println(msg);
		sc.close();
		System.out.println("msg sent");
		
	}

}
