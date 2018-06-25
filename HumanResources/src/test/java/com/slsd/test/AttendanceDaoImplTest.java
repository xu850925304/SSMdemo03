package com.slsd.test;

import static org.junit.Assert.fail;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.slsd.dao.AttendanceDao;
import com.slsd.dao.impl.AttendanceDaoImpl;
import com.slsd.entity.Attendance;
import com.slsd.service.AttendanceService;

public class AttendanceDaoImplTest {

	@Resource
	private AttendanceDao adao = null;

	@Before
	public void test01() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring/root-context.xml");
		adao = (AttendanceDao) ctx.getBean("attendanceDao");
		System.out.println(adao.getClass());

	}

	@Test
	public void testSetSqlSessionFactorySqlSessionFactory() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindAllAttendance() {
		List<Attendance> alist = adao.findAllAttendance();
		for (Attendance a : alist) {
			System.out.println(a);
		}
	}

	@Test
	public void testFindAttendanceByName() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddAttendance() {
		fail("Not yet implemented");
	}

	@Test
	public void testEditAttendance() {
		fail("Not yet implemented");
	}

	@Test
	public void testDelAttendance() {
		fail("Not yet implemented");
	}

}
