//2020/12/15 ,kyoung-young /kum
package com.lec.ex2_date;

import java.util.Calendar;

public class Ex01_Calendar {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		System.out.println("=========================");
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH);
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int week = cal.get(Calendar.DAY_OF_WEEK);
		int hour24 = cal.get(Calendar.HOUR_OF_DAY);
		int hour12 = cal.get(Calendar.HOUR);
		int ampm = cal.get(Calendar.AM_PM);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		int millisec = cal.get(Calendar.MILLISECOND);
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

		System.out.printf("%tY년 %tm월 %td일 %ta요일 %tH시 %tM분 %tS초\n", cal, cal, cal, cal, cal, cal, cal);
		System.out.printf("%1$tY년 %1$tm월 %1$td일 %1$ta요일 %1$tH시 %1$tM분 %1$tS초\n", cal);

		System.out.print(ampm == 0 ? "오전" : "오후");
		System.out.printf("%d시 %d분 %d초\n", hour12, minute, second);
		System.out.printf("%tl시 %tM분 %tS초\n", cal, cal, cal);
		System.out.printf("%1$tl시 %1$tM분 %1$tS초\n", cal);

	}

}
