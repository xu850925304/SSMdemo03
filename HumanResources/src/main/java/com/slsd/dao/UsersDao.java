package com.slsd.dao;

import java.util.List;

import com.slsd.entity.Users;

public interface UsersDao {
	public List<UsersDao> findAllUsers();
	
	public  UsersDao findUsersByName(String uname);
	
	public int addUsers(Users Users);
	
	public int editUsers(Users Users);
	
	public int delUsers(String uname);
}
