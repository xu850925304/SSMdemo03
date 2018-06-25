package com.slsd.entity;

import java.sql.Date;

public class Employee {
	private int eid;
	private String ename;
	private String esex;
	private String eemail;
	private String edepartment;
	private String eaddress;
	private int eage;
	private String eeducational;
	private Date ehiredate;
	private String epicture;
	private String eposition;
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEsex() {
		return esex;
	}
	public void setEsex(String esex) {
		this.esex = esex;
	}
	public String getEemail() {
		return eemail;
	}
	public void setEemail(String eemail) {
		this.eemail = eemail;
	}
	public String getEdepartment() {
		return edepartment;
	}
	public void setEdepartment(String edepartment) {
		this.edepartment = edepartment;
	}
	public String getEaddress() {
		return eaddress;
	}
	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}
	public int getEage() {
		return eage;
	}
	public void setEage(int eage) {
		this.eage = eage;
	}
	public String getEeducational() {
		return eeducational;
	}
	public void setEeducational(String eeducational) {
		this.eeducational = eeducational;
	}
	public Date getEhiredate() {
		return ehiredate;
	}
	public void setEhiredate(Date ehiredate) {
		this.ehiredate = ehiredate;
	}
	public String getEpicture() {
		return epicture;
	}
	public void setEpicture(String epicture) {
		this.epicture = epicture;
	}
	public String getEposition() {
		return eposition;
	}
	public void setEposition(String eposition) {
		this.eposition = eposition;
	}
	public Employee(int eid, String ename, String esex, String eemail, String edepartment) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esex = esex;
		this.eemail = eemail;
		this.edepartment = edepartment;
	}
	public Employee(String ename, String esex, String eemail, String edepartment) {
		super();
		this.ename = ename;
		this.esex = esex;
		this.eemail = eemail;
		this.edepartment = edepartment;
	}
	public Employee() {
		super();
	}
	public Employee(int eid, String ename, String esex, String eemail, String edepartment, String eaddress, int eage,
			String eeducational, Date ehiredate, String epicture, String eposition) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esex = esex;
		this.eemail = eemail;
		this.edepartment = edepartment;
		this.eaddress = eaddress;
		this.eage = eage;
		this.eeducational = eeducational;
		this.ehiredate = ehiredate;
		this.epicture = epicture;
		this.eposition = eposition;
	}
	public Employee(String ename, String esex, String eemail, String edepartment, String eaddress, int eage,
			String eeducational, Date ehiredate, String epicture, String eposition) {
		super();
		this.ename = ename;
		this.esex = esex;
		this.eemail = eemail;
		this.edepartment = edepartment;
		this.eaddress = eaddress;
		this.eage = eage;
		this.eeducational = eeducational;
		this.ehiredate = ehiredate;
		this.epicture = epicture;
		this.eposition = eposition;
	}
	
}
