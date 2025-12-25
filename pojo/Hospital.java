package com.pojo;

public class Hospital {
	
	String patientName;
	int age;
	String problem;
	String doctorName;
	long mobNo;
	final String typeDr = "Genrl sergon";
	public Hospital() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Hospital(String patientName, int age, String problem, String doctorName, long mobNo) {
		super();
		this.patientName = patientName;
		this.age = age;
		this.problem = problem;
		this.doctorName = doctorName;
		this.mobNo = mobNo;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getProblem() {
		return problem;
	}
	public void setProblem(String problem) {
		this.problem = problem;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public long getMobNo() {
		return mobNo;
	}
	public void setMobNo(long mobNo) {
		this.mobNo = mobNo;
	}
//	public String getTypeDr() {
//		return typeDr;
//	}
//	public void setTypeDr(String typeDr) {
//		this.typeDr = typeDr;
	@Override
	public String toString() {
		return "Hospital [patientName=" + patientName + ", age=" + age + ", problem=" + problem + ", doctorName="
				+ doctorName + ", mobNo=" + mobNo + "]";
	}
	
	
	

}
