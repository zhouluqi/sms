package com.suixingpay.sms.student.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * 描述:
 *
 * @Author 周路棋
 * @Create 2018-10-28 11:56
 * @Version 1.0
 */
public final class StringUUID {

	public static String getRandomID(){
		StringBuilder result = new StringBuilder();
		Random rand = new Random();
		int n = 10; //默认长度
		//if(null != length && length > 0){
		///	n = length;
		//}
		boolean[]  bool = new boolean[n];
		int randInt;
		for(int i = 0; i < n ; i++) {
			do {
				randInt  = rand.nextInt(n);
			}while(bool[randInt]);
			bool[randInt] = true;
			result.append(randInt);
		}
		return result.toString();
	}
	public static String getCurrentDate(){
		Date date = new Date();
		//System.out.println(d);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(date);
	}
}
