//2020/12/15 ,kyoung-young /kum
package com.lec.ex2_date;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Ex02_gregorianCalendar {
	public static void main(String[] args) {
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println(gc);
		int year = gc.get(Calendar.YEAR);// �⵵�� �̾ƿ�
		int month = gc.get(Calendar.MONTH);// �ý����� 0������ ���� 12�������� �ý����� 0������ �̱⋚���� +1�� �������
		int day = gc.get(Calendar.DAY_OF_MONTH);
		int week = gc.get(Calendar.DAY_OF_WEEK);// 1(��)2(��)3(ȭ)4(��) ���� ��¥�� �������̴ϱ� ���� 2�� ǥ��
		int hour24 = gc.get(Calendar.HOUR_OF_DAY);// 24�ð�
		int hour12 = gc.get(Calendar.HOUR);// 12�ð�
		int ampm = gc.get(Calendar.AM_PM);// 0(am),1(pm)
		int minute = gc.get(Calendar.MINUTE);
		int second = gc.get(Calendar.SECOND);
		int millisec = gc.get(Calendar.MILLISECOND);
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
//		System.out.println(day);//���� �� 
//		System.out.println(month);// ���� ��
//		System.out.println(week);
//		System.out.println(ampm);
		System.out.println("=========================");
		System.out.printf("%tY��  %tm��  %td��  %ta����  %tH�ð�  %tM��  %TS��", gc, gc, gc, gc, gc, gc, gc);

		System.out.printf("%1$tY�� %1$tm�� %1$td�� %1$ta���� %1$tH�� %1$tM�� %1$tS��\n", gc);
//		int ampm = cal.get(Calendar.AM_PM);//0(am),1(pm)
		System.out.print(ampm == 0 ? "����" : "����");
		System.out.printf("%d�� %d�� %d��\n", hour12, minute, second);
		System.out.printf("%tl�� %tM�� %tS��\n", gc, gc, gc);
		System.out.printf("%1$tl�� %1$tM�� %1$tS��\n", gc);

		// tY(��) tm(��) td(��) ta(����) tH(24��) tl(12��) tM(��) tS(��)
		// d(����) f(�Ǽ�) s(���ڿ�) c(����) b(true/false)

	}

}
