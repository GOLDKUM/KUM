//2020/12/15 ,kyoung-young /kum
package com.lec.ex2_date;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

//date Ư����¥ ��� �������� �ݳ�!
public class Ex10_dayCal {
	public static void main(String[] args) {
		Date checkOutDate = new Date(new GregorianCalendar(2020, 10, 15).getTimeInMillis());
		Date now = new Date();
		long diff = now.getTime() - checkOutDate.getTime();
		long day = diff / (1000 * 60 * 60 * 24);
		if (day > 14) {
			//
			day = day - 14;
			System.out.print("��ü��" + (day * 100) + "���� �����̳���?(Y/N)");
			Scanner scanner = new Scanner(System.in);
			String ok = scanner.next();
			if (!ok.equalsIgnoreCase("y")) {
				System.out.println("��ü�Ḧ ���ž� �ݳ�ó�� �����մϴ�");
				return;
			}
		}
		System.out.println("�ݳ��մϴ�");
	}

}
