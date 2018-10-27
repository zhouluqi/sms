package com.suixingpay.sms.student.model;

/**
 * 描述：学生实体类
 * @author 周路棋
 * @version 1.0
 */
public class Student {

	private String id;
	private String name;
	private String sex;
	private Integer age;
	private String  classNumber;
	private String teacher;
	private String creatDate;
	private String EnrollmentYear;
	private String status;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getClassNumber() {
		return classNumber;
	}

	public void setClassNumber(String classNumber) {
		this.classNumber = classNumber;
	}

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	public String getCreatDate() {
		return creatDate;
	}

	public void setCreatDate(String creatDate) {
		this.creatDate = creatDate;
	}

	public String getEnrollmentYear() {
		return EnrollmentYear;
	}

	public void setEnrollmentYear(String enrollmentYear) {
		EnrollmentYear = enrollmentYear;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Student{" +
				"id='" + id + '\'' +
				", name='" + name + '\'' +
				", sex='" + sex + '\'' +
				", age=" + age +
				", classNumber='" + classNumber + '\'' +
				", teacher='" + teacher + '\'' +
				", creatDate='" + creatDate + '\'' +
				", EnrollmentYear='" + EnrollmentYear + '\'' +
				", status='" + status + '\'' +
				'}';
	}
}
