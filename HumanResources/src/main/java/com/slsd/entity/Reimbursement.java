package com.slsd.entity;

import java.sql.Date;

public class Reimbursement {
	private int rid;
	private String rname;
	private String rDetailsOfConsumption;
	private Date rdate;
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public String getRname() {
		return rname;
	}
	public void setRname(String rname) {
		this.rname = rname;
	}
	public String getrDetailsOfConsumption() {
		return rDetailsOfConsumption;
	}
	public void setrDetailsOfConsumption(String rDetailsOfConsumption) {
		this.rDetailsOfConsumption = rDetailsOfConsumption;
	}
	public Date getRdate() {
		return rdate;
	}
	public void setRdate(Date rdate) {
		this.rdate = rdate;
	}
	public Reimbursement(int rid, String rname, String rDetailsOfConsumption, Date rdate) {
		super();
		this.rid = rid;
		this.rname = rname;
		this.rDetailsOfConsumption = rDetailsOfConsumption;
		this.rdate = rdate;
	}
	public Reimbursement() {
		super();
	}
	public Reimbursement(String rname, String rDetailsOfConsumption, Date rdate) {
		super();
		this.rname = rname;
		this.rDetailsOfConsumption = rDetailsOfConsumption;
		this.rdate = rdate;
	}
}
