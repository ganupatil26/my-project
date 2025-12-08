package com.gettersetter;

public class Owner {

	public static void main(String[] args) {
		
		Cust c = new Cust() ;
		c.setCustomerName("Raj thakre");
		c.setCustomerEmail("raj1122@gamil.com");
		c.setCustomerMobno(5522667788l);
		c.setCustomerAddress("samtha nagar miraj");
		c.setCustomerAdharNo(555522331166l);
		c.setCustomerBalence(5512.23f);
		
		System.out.println("Customer name:"+c.getCustomerName());
		System.out.println("Customer email:"+c.getCustomerEmail());
		System.out.println("Customer mobile no:"+c.getCustomerMobno());
		System.out.println("Customer address:"+c.getCustomerAddress());
		System.out.println("Customer  adhar no:"+c.getCustomerAdharNo());
		System.out.println("Customer balence:"+c.getCustomerBalence());
		
		//2nd qestion
		System.err.println("second Question");
		Cust c2= new Cust();
		c2.setBankName("SBI");
		c2.setCardHolderName("laxmi tubaki");
		c2.setPinCode(416410);
		c2.setDebitCardNo(4455886655l);
		c2.setCvv(546);
		c2.setExpiryDate("06/26");

		System.out.println("Bank name:"+c2.getbankName());
		System.out.println("Card Holder Name:"+c2.getCardHolderName());
		System.out.println("Pin code:"+c2.PinCode());
		System.out.println("Debit card no:"+c2.getDebitCardNo());
		System.out.println("CVV:"+c2.getCvv());
		System.out.println("Expiry Date:"+c2.getExpiryDate());
		
		
		

	}

}
