package com.suixingpay.sms.student.service;

import com.suixingpay.sms.student.model.Student;

import java.util.List;
import java.util.Map;

/**
 * 描述：学生业务逻辑层接口方法定义
 * @author 周路棋
 * @version 1.0
 */
public interface StudentService {
	Map<String,Object> saveStudent(Student student);

	List<Student> listStudent(Student student);

	boolean removeStudent(String[] arrayId);

	boolean updateStudent(Student student);
}
