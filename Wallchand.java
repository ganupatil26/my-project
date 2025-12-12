package com.superr;

public class Wallchand extends College {

	public Wallchand() {
		super("Walchand collge of engg sangli", 416411);

	}

	public void Department() {
		System.out.println("computer science ");
		System.out.println("special cource electronics ");
	}
	public static void main(String[] args) {
		System.out.println("college details");
		
		Smdbs s = new Smdbs();
		s.Department();
		s.viewDetials();
		
		System.out.println("-------------");
		
		Wallchand w =new Wallchand();
		w.Department();
		w.viewDetials();

	}
	
	

}
