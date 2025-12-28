package com.pojoquestion;

public class Doctor  {

	int id;
	String name;
	String specilizaition;
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Doctor(int id, String name, String specilizaition) {
		super();
		this.id = id;
		this.name = name;
		this.specilizaition = specilizaition;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpecilizaition() {
		return specilizaition;
	}
	public void setSpecilizaition(String specilizaition) {
		this.specilizaition = specilizaition;
	}
	@Override
	public String toString() {
		return "Doctor [doctor id=" + id + ", doctor name=" + name + ", specilizaition=" + specilizaition + "]";
	}
	
	
}
