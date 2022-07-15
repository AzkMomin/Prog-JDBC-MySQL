package com.student.manager;

public class student {
	//Declaring variables
	private int S_id;
	private int S_idUpdate;
	private String sname;
	private String sphone;
	private String scity;
	
	
	//Creating getters and setters method
	public int getS_id() {
		return S_id;
	}

	public void setS_id(int S_id) {
		this.S_id = S_id;
	}
	public int getS_idUpdate() {
		return S_idUpdate;
	}
	public void setS_idUpdate(int S_idUpdate) {
		this.S_idUpdate = S_idUpdate;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSphone() {
		return sphone;
	}

	public void setSphone(String sphone) {
		this.sphone = sphone;
	}

	public String getScity() {
		return scity;
	}

	public void setScity(String scity) {
		this.scity = scity;
	}
	
	
	//Creating constructor
	public student(int S_id, String sname, String sphone, String scity) {
		super();
		this.S_id = S_id;
		this.sname = sname;
		this.sphone = sphone;
		this.scity = scity;
	}
	
		
	public student(String sname, String sphone, String scity) {
		super();
		this.sname = sname;
		this.sphone = sphone;
		this.scity = scity;
	}
	public student(String sname, String sphone, String scity,int S_id) {
		super();
		this.S_id = S_id;
		this.sname = sname;
		this.sphone = sphone;
		this.scity = scity;
	}
	
	public student(int S_idUpdate , String sname , String sphone , String scity, int S_id) {
		super();
		this.S_idUpdate = S_idUpdate;
		this.S_id = S_id;
		this.sname = sname;
		this.sphone = sphone;
		this.scity = scity;
	}

	//Non parameterized constructor
	public student() {
		super();
	}

	public void printDetail() {
		System.out.println("S_id = "+ S_id + " name = " + sname + " sphone = " + sphone + " scity = " + scity);
	}

//	@Override
//	public String toString() {
//		return "student [S_id=" + S_id + ", sname=" + sname + ", sphone=" + sphone + ", scity=" + scity + "]";
//	}

}

