package com.slsd.entity;

import java.sql.Date;

public class Leave {
	private int lid;
	private int lname;
	private Date ldate;
	private String ltime;
	private String lreason;
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public int getLname() {
		return lname;
	}
	public void setLname(int lname) {
		this.lname = lname;
	}
	public Date getLdate() {
		return ldate;
	}
	public void setLdate(Date ldate) {
		this.ldate = ldate;
	}
	public String getLtime() {
		return ltime;
	}
	public void setLtime(String ltime) {
		this.ltime = ltime;
	}
	public String getLreason() {
		return lreason;
	}
	public void setLreason(String lreason) {
		this.lreason = lreason;
	}
	public Leave(int lname, Date ldate, String ltime, String lreason) {
		super();
		this.lname = lname;
		this.ldate = ldate;
		this.ltime = ltime;
		this.lreason = lreason;
	}
	public Leave(int lid, int lname, Date ldate, String ltime, String lreason) {
		super();
		this.lid = lid;
		this.lname = lname;
		this.ldate = ldate;
		this.ltime = ltime;
		this.lreason = lreason;
	}
	public Leave() {
		super();
	}
}
