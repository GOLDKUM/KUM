//2020/12/15 ,kyoung-young /kum
package com.lec.ex2_date;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Ex02_gregorianCalendar {
	public static void main(String[] args) {
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println(gc);
		int year = gc.get(Calendar.YEAR);// 년도만 뽑아옴
		int month = gc.get(Calendar.MONTH);// 시스템은 0월부터 실제 12월이지만 시스템은 0월부터 이기떄문에 +1을 해줘야함
		int day = gc.get(Calendar.DAY_OF_MONTH);
		int week = gc.get(Calendar.DAY_OF_WEEK);// 1(일)2(월)3(화)4(수) 오늘 날짜가 월요일이니깐 숫자 2로 표시
		int hour24 = gc.get(Calendar.HOUR_OF_DAY);// 24시간
		int hour12 = gc.get(Calendar.HOUR);// 12시간
		int ampm = gc.get(Calendar.AM_PM);// 0(am),1(pm)
		int minute = gc.get(Calendar.MINUTE);
		int second = gc.get(Calendar.SECOND);
		int millisec = gc.get(Calendar.MILLISECOND);
		System.out.printf("%d년%d월 %d일\n", year, month, day);
		switch (week) {
		case 1:
			System.out.print("일요일\n");
			break;
		case 2:
			System.out.print("월요일\n");
			break;
		case 3:
			System.out.print("화요일\n");
			break;
		case 4:
			System.out.print("수요일\n");
			break;
		case 5:
			System.out.print("목요일\n");
			break;
		case 6:
			System.out.print("금요일\n");
			break;
		case 7:
			System.out.print("토요일\n");
			break;
		}
		System.out.printf("%d시%d분%d초%d\n", hour24, minute, second, millisec);
//		System.out.println(day);//오늘 날 
//		System.out.println(month);// 오늘 달
//		System.out.println(week);
//		System.out.println(ampm);
		System.out.println("=========================");
		System.out.printf("%tY년  %tm월  %td일  %ta요일  %tH시간  %tM분  %TS최", gc, gc, gc, gc, gc, gc, gc);

		System.out.printf("%1$tY년 %1$tm월 %1$td일 %1$ta요일 %1$tH시 %1$tM분 %1$tS초\n", gc);
//		int ampm = cal.get(Calendar.AM_PM);//0(am),1(pm)
		System.out.print(ampm == 0 ? "오전" : "오후");
		System.out.printf("%d시 %d분 %d초\n", hour12, minute, second);
		System.out.printf("%tl시 %tM분 %tS초\n", gc, gc, gc);
		System.out.printf("%1$tl시 %1$tM분 %1$tS초\n", gc);

		// tY(년) tm(월) td(일) ta(요일) tH(24시) tl(12시) tM(분) tS(초)
		// d(정수) f(실수) s(문자열) c(문자) b(true/false)

	}

}
