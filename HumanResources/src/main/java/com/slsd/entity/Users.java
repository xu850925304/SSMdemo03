package com.slsd.entity;

public class Users {
	private int uid;
	private String uname;
	private String upwd;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpwd() {
		return upwd;
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	public Users(int uid, String uname, String upwd) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.upwd = upwd;
	}
	public Users(String uname, String upwd) {
		super();
		this.uname = uname;
		this.upwd = upwd;
	}
	public Users() {
		super();
	}
}
