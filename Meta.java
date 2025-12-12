package com.superr;

public class Meta {
	String appName;
	double version;
	
	public Meta(String appName, double version) {
		this.appName = appName;
		this.version = version;
		
	}
	public void ViewDetials() {
		System.err.println("application name_"+appName);
		System.err.println("app version_"+version);
		
		
	}
	

}
