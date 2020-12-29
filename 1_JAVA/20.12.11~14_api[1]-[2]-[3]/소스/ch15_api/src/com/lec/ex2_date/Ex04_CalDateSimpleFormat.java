//2020/12/15 ,kyoung-young /kum
package com.lec.ex2_date;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ex04_CalDateSimpleFormat {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		// 2020년 12월 14일 3시03분 05초 !
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 a hh시 mm분 ss초");

		String today = sdf.format(cal.getTime());
		System.out.println(today);
	}

}
