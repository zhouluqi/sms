package com.suixingpay.sms.student.controller;

import com.suixingpay.sms.student.model.Student;
import com.suixingpay.sms.student.service.StudentService;
import com.suixingpay.sms.student.util.JDBC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/student")
public class StudentsController {

	@Autowired
	private StudentService studentService;

	/**
	 * @author 刘维邦
	 * @param student
	 */
	@GetMapping("/deleteStudent")
    @ResponseBody
    public void deleteStudent(Student student){
        JDBC G = JDBC.getInstance();
        G.delete(student);
    }
    @GetMapping("/insertStudent")
    @ResponseBody
    public void insertStudent(Student student){
        JDBC G = JDBC.getInstance();
        G.insert(student);
    }
    @GetMapping("/selectStudent")
    @ResponseBody
    public void selectStudent(String... names){
        JDBC G = JDBC.getInstance();
        G.selectList(names);
    }
    @GetMapping("/updateStudent")
    @ResponseBody
    public void updateStudent(Student student){
        JDBC G = JDBC.getInstance();
        G.update(student);
    }

	@GetMapping("/test")
	public String text(){
		return "index";
	}
}
