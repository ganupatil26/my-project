package com.overload;

public class Login {
	
	void login (String username) {
		System.out.println("username:"+username);
	}
	void login (String username, String password) {
		System.out.println("username:"+username+"  "+"password:"+password);
	}
	public static void main(String[] args) {
		Login l = new Login();
		l.login("rajthakre12");
		l.login("balu44", "balu@1223");
	}

}
