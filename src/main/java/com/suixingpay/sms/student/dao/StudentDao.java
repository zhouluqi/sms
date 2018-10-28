package com.suixingpay.sms.student.dao;

import com.suixingpay.sms.student.model.Student;

import java.util.List;

/**
 * 描述：
 *     学生Dao层接口 方法定义
 * @author 周路棋
 * @version 1.0
 */
public interface StudentDao {

 String saveStudent(Student student);

 List<Student> listStudentBy(String aid, String name);

 List<Student> listStudent();

 boolean removeStudent(String[] arrayId);

 boolean updateStudent(Student student);
}
