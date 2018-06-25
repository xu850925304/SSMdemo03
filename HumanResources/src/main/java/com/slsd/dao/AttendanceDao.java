package com.slsd.dao;

import java.util.List;

import com.slsd.entity.Attendance;

public interface AttendanceDao {
	public List<Attendance> findAllAttendance();
	
	public  Attendance findAttendanceByName(String aname);
	
	public int addAttendance(Attendance attendance);
	
	public int editAttendance(Attendance attendance);
	
	public int delAttendance(String aname);
}
