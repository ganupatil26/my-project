package Abstraction;

import java.util.Scanner;

public class Zomato implements Order{
	int parcel=10;
	int bil;
	@Override
	public void order() {
		System.out.println("1.omlet=30 2.biryani=70 3.veg-birayni=50 ");
		System.out.println("enter a num to order your food:");
		Scanner sc = new Scanner(System.in);
		String food = sc.nextLine();
		switch (food) {
		case "1":
			bil = parcel+30;
			System.out.println("---------");
			System.out.println("omlet");
			System.out.println("your bill:"+bil);
			break;
		case "2":
			bil=parcel+70;
			System.out.println("---------");
			System.out.println("biryani");
			System.out.println("your bill:"+bil);
			break;
		case "3":
			bil=parcel+50;
			System.out.println("---------");
			System.out.println("veg-birayni");
			System.out.println("your bill:"+bil);
			break;
			default:
				System.out.println("order canseled");
		}
//		System.out.println("your order:-"+food);
		sc.close();
		System.out.println("order is placed");
	}

}
