package com.slsd.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import com.slsd.dao.AttendanceDao;
import com.slsd.entity.Attendance;



@Repository("adao")
public class AttendanceDaoImpl extends SqlSessionDaoSupport implements AttendanceDao{
	@Autowired 
	@Qualifier("sqlSessionFactory")
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	public List<Attendance> findAllAttendance() {
		SqlSession sqlSession = this.getSqlSession();
		List<Attendance> alist = sqlSession.selectList("findAllAttendance");
		return alist;
	}

	public Attendance findAttendanceByName(String aname) {
		SqlSession sqlSession = this.getSqlSession();
		Attendance attendance = sqlSession.selectOne("findAttendanceByName", aname);
		return attendance;
	}

	public int addAttendance(Attendance attendance) {
		SqlSession sqlSession = this.getSqlSession();
		int row = sqlSession.insert("addAttendance", attendance);
		return row;
	}

	public int editAttendance(Attendance attendance) {
		SqlSession sqlSession = this.getSqlSession();
		int row = sqlSession.update("editAttendance", attendance);
		return row;
	}

	public int delAttendance(String aname) {
		SqlSession sqlSession = this.getSqlSession();
		int row = sqlSession.delete("delAttendance", aname);
		return row;
	}

}
