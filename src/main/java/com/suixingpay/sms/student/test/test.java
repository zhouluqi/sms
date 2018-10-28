package com.suixingpay.sms.student.test;

import com.suixingpay.sms.student.model.Student;
import com.suixingpay.sms.student.util.StringUUID;

/**
 * 描述:
 *
 * @Author 周路棋
 * @Create 2018-10-28 12:01
 * @Version 1.0
 */
public class test {
	public static void main(String[] args) {
		System.out.println(StringUUID.getRandomID());
		System.out.println(StringUUID.getCurrentDate());
		Student student = new Student();
		System.out.println(student);





	}
}
