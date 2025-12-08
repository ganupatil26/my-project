package com.gettersetter;

public class Cust {
	private String customerName;
	private String customerEmail;
	private long customerMobno;
	private String customerAddress;
	private long customerAdharNo;
	private float customerBalence;

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String name) {
		this.customerName = name;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String Email) {
		this.customerEmail = Email;
	}

	public long getCustomerMobno() {
		return customerMobno;
	}

	public void setCustomerMobno(long Mobno) {
		this.customerMobno = Mobno;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String Address) {
		this.customerAddress = Address;
	}

	public long getCustomerAdharNo() {
		return customerAdharNo;
	}

	public void setCustomerAdharNo(long AdharNo) {
		this.customerAdharNo = AdharNo;
	}

	public float getCustomerBalence() {
		return customerBalence;
	}

	public void setCustomerBalence(float Balence) {
		this.customerBalence = Balence;
	}
    private String BankName;
	private String cardHoldername;
	private int pinCode;
	private long DebitCardNo;
	private int cvv;
	private String expiryDate;

	public String getbankName() {
		return BankName;
	}

	public void setBankName(String name) {
		this.BankName = name;
	}

	public String getCardHolderName() {
		return cardHoldername;
	}

	public void setCardHolderName(String name) {
		this.cardHoldername = name;
	}

	public int PinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public long getDebitCardNo() {
		return DebitCardNo;
	}

	public void setDebitCardNo(long debitCardNo) {
		this.DebitCardNo = debitCardNo;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String date) {
		this.expiryDate = date;
	}
	

}
