package com.slsd.entity;

import java.sql.Date;

public class Attendance {
	private int aid;
	private String aname;
	private String areason;
	private Date adate;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getAreason() {
		return areason;
	}
	public void setAreason(String areason) {
		this.areason = areason;
	}
	public Date getAdate() {
		return adate;
	}
	public void setAdate(Date adate) {
		this.adate = adate;
	}
	public Attendance(int aid, String aname, String areason, Date adate) {
		super();
		this.aid = aid;
		this.aname = aname;
		this.areason = areason;
		this.adate = adate;
	}
	public Attendance() {
		super();
	}
	@Override
	public String toString() {
		return "Attendance [aid=" + aid + ", aname=" + aname + ", areason=" + areason + ", adate=" + adate + "]";
	}
		
}
