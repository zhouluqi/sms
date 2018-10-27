package com.suixingpay.sms.student.dao;

import com.suixingpay.sms.student.model.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 描述：学生Dao层方法实现类
 * @author 周路棋
 * @version 1.0
 */
@Repository
public class StudentDaoImpl implements StudentDao{
	@Override
	public String saveStudent(Student student) {
		return null;
	}

	@Override
	public List<Student> listStudent(Student student) {
		return null;
	}

	@Override
	public boolean removeStudent(String[] arrayId) {
		return false;
	}

	@Override
	public boolean updateStudent(Student student) {
		return false;
	}
}
