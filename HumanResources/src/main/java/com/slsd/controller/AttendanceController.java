package com.slsd.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.slsd.entity.Attendance;
import com.slsd.service.AttendanceService;

@Controller
@RequestMapping("/attendance")
public class AttendanceController {
	@Autowired
	@Qualifier("attendanceService")
	private AttendanceService attendanceService;
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test(HttpServletRequest request, Model model) {
		String aname = request.getParameter("aname");
		System.out.println("aname:" + aname);
		Attendance attendance = null;

		model.addAttribute("attendance", attendance);
		return "index";
	}
	
	
	
	@RequestMapping(value = "/showAll", method = RequestMethod.GET)
	public String showAll(Map<String, Object> model) {
		List<Attendance> alist = this.attendanceService.findAllAttendance();
		model.put("alist", alist);
		return "index";
	}
}
