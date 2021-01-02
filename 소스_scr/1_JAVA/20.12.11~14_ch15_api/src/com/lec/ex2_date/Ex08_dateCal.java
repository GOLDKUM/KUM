//2020/12/15 ,kyoung-young /kum
package com.lec.ex2_date;

import java.util.Date;
import java.util.GregorianCalendar;

public class Ex08_dateCal {
	public static void main(String[] args) {
		GregorianCalendar now = new GregorianCalendar(); // 매개변수 아무것도 안넣어서 지금 now현재시간임

		GregorianCalendar thatTime = new GregorianCalendar(2020, 10, 30, 9, 30, 0);
		long nowMillis = now.getTimeInMillis();// 1970~12/14
		long thatMillis = thatTime.getTimeInMillis();// 1970~11/30
		long day = (nowMillis - thatMillis) / (1000 * 60 * 60 * 24);
		System.out.println("개강한이후" + day + "일 지남");
//		Date thatDay = new Date();//현재시점 
		Date thatDay = new Date(new GregorianCalendar(2020, 10, 30, 9, 30, 0).getTimeInMillis());
		System.out.println("====================");
		System.out.println(now);

	}

}
