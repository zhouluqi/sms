package com.suixingpay.sms.student.service;

import com.suixingpay.sms.student.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 描述：学生业务逻辑层方法实现
 * @author 周路棋
 * @version 1.0
 */
@Service
public class StudentServiceImpl implements StudentService {
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
