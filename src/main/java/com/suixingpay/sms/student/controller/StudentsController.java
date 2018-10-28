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

	@GetMapping("/saveStudent")
	@ResponseBody
	public Map<String,Object> saveStudent(){
       //@RequestParam(value="callback",required=false) String callback
		//JSONObject obj = new JSONObject();
	//	obj.put("name", "li");
	//	MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(obj);
	//	if(callback!=null){
	//		mappingJacksonValue.setJsonpFunction("callbackname");
	//	}
	//	return mappingJacksonValue;

		//@RequestBody ResultData data
		Student student = new Student();
		student.setAge(20);
		Student student2 = new Student();
		student2.setStatus("keyong");

		List<Student> students = new ArrayList<>();
		students.add(student);
		students.add(student2);
		//System.out.println(data.getKey());
		//System.out.println(data.getStudentList());
		//@RequestBody Student student
		System.out.println("ssd");
		System.out.println("进来了");
		Map<String,Object> map = new HashMap<>();
		map.put("result",students);
		//studentService.saveStudent(student)
		//map.put("msg","测试成功");
		//mainMap.put("json头",map);
       return map;

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
	@GetMapping("/test")
	public String text(){
		return "index";
	}
}
