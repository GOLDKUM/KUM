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
		System.out.printf("%d��%d�� %d��\n", year, month, day);
		switch (week) {
		case 1:
			System.out.print("�Ͽ���\n");
			break;
		case 2:
			System.out.print("������\n");
			break;
		case 3:
			System.out.print("ȭ����\n");
			break;
		case 4:
			System.out.print("������\n");
			break;
		case 5:
			System.out.print("�����\n");
			break;
		case 6:
			System.out.print("�ݿ���\n");
			break;
		case 7:
			System.out.print("�����\n");
			break;
		}
		System.out.printf("%d��%d��%d��%d\n", hour24, minute, second, millisec);

		System.out.printf("%tY�� %tm�� %td�� %ta���� %tH�� %tM�� %tS��\n", cal, cal, cal, cal, cal, cal, cal);
		System.out.printf("%1$tY�� %1$tm�� %1$td�� %1$ta���� %1$tH�� %1$tM�� %1$tS��\n", cal);

		System.out.print(ampm == 0 ? "����" : "����");
		System.out.printf("%d�� %d�� %d��\n", hour12, minute, second);
		System.out.printf("%tl�� %tM�� %tS��\n", cal, cal, cal);
		System.out.printf("%1$tl�� %1$tM�� %1$tS��\n", cal);

	}

}
