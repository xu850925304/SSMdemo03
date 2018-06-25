package com.slsd.service;

import java.util.List;

import com.slsd.entity.Attendance;

public interface AttendanceService {
	public List<Attendance> findAllAttendance();
	
	public  Attendance findAttendanceByName(String aname);
	
	public boolean addAttendance(Attendance attendance);
	
	public boolean editAttendance(Attendance attendance);
	
	public boolean delAttendance(String aname);
}
