package com.suixingpay.sms.student.controller;

import com.suixingpay.sms.student.model.Student;
import com.suixingpay.sms.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping("/student")
public class StudentsController {

	@Autowired
	private StudentService studentService;

	@RequestMapping("/saveStudent")
	@ResponseBody
	public Map<String,Object> saveStudent(){
		//@RequestBody Student student
		Student student = new Student();
		student.setAge(15);
		student.setClassNumber("初一");
		student.setEnrollmentYear("2018 10-22");
		return studentService.saveStudent(student);
	}
}
