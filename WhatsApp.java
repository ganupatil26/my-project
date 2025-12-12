package com.superr;

public class WhatsApp extends Meta {
	
	WhatsApp(){
		super("WhatsApp", 2.0);
		
		
	}
	public void Func() {
		System.out.println("chatting with freinds");
	}
	public static void main(String[] args) {
		System.out.println("view apps");
		
		InstaGram i = new InstaGram();
		i.function();
		i.ViewDetials();
		System.out.println("------------");
		WhatsApp w =new WhatsApp();
		w.ViewDetials();
		w.Func();
		
	}

}
