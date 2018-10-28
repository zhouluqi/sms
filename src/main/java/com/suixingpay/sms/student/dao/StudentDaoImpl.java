package com.suixingpay.sms.student.dao;

import com.suixingpay.sms.student.model.Student;
import com.suixingpay.sms.student.util.JDBC;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 描述：学生Dao层方法实现类
 * @author 周路棋
 * @version 1.0
 */
@Repository
public class StudentDaoImpl implements StudentDao{
	private JDBC jdbc = JDBC.getInstance();
	@Override
	public String saveStudent(Student student) {
       // jdbc
		return null;
	}

	@Override
	public List<Student> listStudentBy(String id, String name) {
		if (id != null && !id.equals("")) {
			return jdbc.selectList(id);
		}
		return jdbc.selectListByName(name);
	}

	@Override
	public List<Student> listStudent() {
		return jdbc.selectList();
	}


	@Override
	public boolean removeStudent(String[] arrayId) {
		return false;
	}

	@Override
	public boolean updateStudent(Student student) {
		jdbc.update(student);
		return true;
	}
}
