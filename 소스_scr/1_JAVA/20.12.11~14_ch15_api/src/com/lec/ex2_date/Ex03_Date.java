//2020/12/15 ,kyoung-young /kum
package com.lec.ex2_date;

import java.util.Date;

public class Ex03_Date {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		System.out.println("===============");
		int year = date.getYear() + 1900; // 1900�����ķ� �ϱ⶧���� 1900�� ���������
		int month = date.getMonth() + 1;// 1���� 0������ ī�����ϱ⶧���� �� +1 ���������
		int day = date.getDay();
		int hour = date.getHours();
		int minute = date.getMinutes();
		int second = date.getSeconds();
		System.out.printf("%d�� %d�� %d�� %d�� %d�� %d��\n", year, month, day, hour, minute, second);
		System.out.printf("%tY�� %tm�� %td�� %tH�� %tM�� %tS��\n", date, date, date, date, date, date);
		System.out.printf("%1$tY�� %1$tm�� %1$td�� %1$tH�� %1$tM�� %1$tS��\n", date);
	}
}
