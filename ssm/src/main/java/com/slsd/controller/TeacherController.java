package com.slsd.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;


import com.slsd.entity.Teacher;
import com.slsd.service.ITeacherService;

@Controller
@RequestMapping("/teacher")
public class TeacherController {
	@Resource
	private ITeacherService teacherService;

	// /teacher/test?id=1
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test(HttpServletRequest request, Model model) {
		int tid = Integer.parseInt(request.getParameter("id"));
		System.out.println("tid:" + tid);
		Teacher teacher = null;
		if (tid == 1) {
			teacher = new Teacher();
			teacher.setTid(1);
			teacher.setTname("zs");
		}

		model.addAttribute("teacher", teacher);
		return "index";
	}

	// /teacher/showTeacher?id=1
	@RequestMapping(value = "/showTeacher", method = RequestMethod.GET)
	public String toIndex(HttpServletRequest request, Model model) {
		int tid = Integer.parseInt(request.getParameter("id"));
		System.out.println("tid:" + tid);
		Teacher teacher = this.teacherService.findTeacherById(tid);
		model.addAttribute("teacher", teacher);
		return "showTeacher";
	}

	// /teacher/showTeacher2?id=1
	@RequestMapping(value = "/showTeacher2", method = RequestMethod.GET)
	public String toIndex2(@RequestParam("id") String id, Model model) {
		int tid = Integer.parseInt(id);
		System.out.println("tid:" + tid);
		Teacher teacher = this.teacherService.findTeacherById(tid);
		model.addAttribute("teacher", teacher);
		return "showTeacher";
	}

	// /teacher/showTeacher3/{id}
	@RequestMapping(value = "/showTeacher3/{id}", method = RequestMethod.GET)
	public String toIndex3(@PathVariable("id") String id, Map<String, Object> model) {
		int tid = Integer.parseInt(id);
		System.out.println("tid:" + tid);
		Teacher teacher = this.teacherService.findTeacherById(tid);
		model.put("teacher", teacher);
		return "showTeacher";
	}
	@RequestMapping(value="/showTeacher4",method = RequestMethod.GET)
	public String toIndex4(Model model) {
		List<Teacher> teacher =this.teacherService.findAllTeacher();
		model.addAttribute("teacher", teacher);
		return "showTeacher1";
	}
	@RequestMapping(value="/addTeacher",method = RequestMethod.GET)
			public String toIndex5(Model model) {
			
			return "addteacher";
	}
	@RequestMapping(value="/doaddTeacher",method = RequestMethod.POST)
	public String toIndex6(Teacher t,Model model) {
		System.out.println(t.getTname());
		boolean flag =this.teacherService.addTeacher(t);
		System.out.println(flag);
		model.addAttribute("flag",flag);
	return "flag";
	}
	@RequestMapping(value="/delTeacher/{id}",method = RequestMethod.GET)
	public String toIndex7(@PathVariable("id")int id,Model model) {
		boolean flag =this.teacherService.delTeacher(id);
		model.addAttribute("flag",flag);
		return "flag";
	}
	// json格式
	

	// 文件上传、
}
