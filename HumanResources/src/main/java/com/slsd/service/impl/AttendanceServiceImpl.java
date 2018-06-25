package com.slsd.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.slsd.dao.AttendanceDao;
import com.slsd.entity.Attendance;
import com.slsd.service.AttendanceService;
@Service("attendanceService")
public class AttendanceServiceImpl implements AttendanceService{
	@Resource
	private AttendanceDao adao;
	public List<Attendance> findAllAttendance() {
		return adao.findAllAttendance();
	}

	public Attendance findAttendanceByName(String aname) {
		return adao.findAttendanceByName(aname);
	}

	public boolean addAttendance(Attendance attendance) {
		return (adao.addAttendance(attendance) > 0) ? true : false;
	}

	public boolean editAttendance(Attendance attendance) {
		return (adao.editAttendance(attendance) > 0) ? true : false;
	}

	public boolean delAttendance(String aname) {
		return (adao.delAttendance(aname) > 0) ? true : false;
	}

}
