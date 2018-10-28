package com.suixingpay.sms.student.service;

import com.suixingpay.sms.student.dao.StudentDao;
import com.suixingpay.sms.student.model.Student;
import com.suixingpay.sms.student.util.StringUUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 描述：学生业务逻辑层方法实现
 * @author 周路棋
 * @version 1.0
 */
@Service
public class StudentServiceImpl implements StudentService {
    Map<String,Object> map = new HashMap<>();

    @Autowired
	private StudentDao studentDao;

    @Override
	public Map<String,Object> saveStudent(Student student) {
		    student.setId(StringUUID.getRandomID());
		    student.setCreatDate(StringUUID.getCurrentDate());
		    student.setStatus("可用");
			//studentDao.saveStudent(student);
			map.put("data",student);
			map.put("msg","添加成功");
		    return map ;
	}

	@Override
	public List<Student> listAllStudent() {
		return studentDao.listStudent();
	}

	@Override
	public List<Student> listStudent(String sid, String sname) {
    	return studentDao.listStudentBy(sid, sname);
	}

	@Override
	public boolean removeStudent(String[] arrayId) {
		return false;
	}

	@Override
	public boolean updateStudent(Student student) {
		student.setId(StringUUID.getRandomID());
		student.setCreatDate(StringUUID.getCurrentDate());
		studentDao.updateStudent(student);
		return true;
	}
}
