package com.suixingpay.sms.student.controller;

import com.suixingpay.sms.student.model.Student;
import com.suixingpay.sms.student.service.StudentService;
import com.suixingpay.sms.student.util.JDBC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/student")
public class StudentsController {

	@Autowired
	private StudentService studentService;

	@GetMapping("/selectStudentBy")
	public ModelAndView selectStudentBy(String id, String name){
		List<Student> students = studentService.listStudent(id, name);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("students", students);
		modelAndView.setViewName("test");
		return modelAndView;
	}

	/**
	 * @author zhangzhen
	 * @param
	 */
	@GetMapping("/test")
	public ModelAndView text() {
		List<Student> students = studentService.listAllStudent();
		System.out.println(students.size());
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("students", students);
		modelAndView.setViewName("test");
		return modelAndView;
	}

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

}
