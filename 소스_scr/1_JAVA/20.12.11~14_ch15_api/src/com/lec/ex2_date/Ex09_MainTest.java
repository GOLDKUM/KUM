//2020/12/15 ,kyoung-young /kum
package com.lec.ex2_date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex09_MainTest {
	public static void main(String[] args) {

		Date date = new Date();
		SimpleDateFormat s = new SimpleDateFormat("YY-MM-dd");
		String today = s.format(date);

		Ex09_date s1 = new Ex09_date("a01", "ȫ", PartType.COMPUTER, today);
		Ex09_date s2 = new Ex09_date("a01", "ȫ", PartType.PLANNING, today);
		System.out.println(s1);
		System.out.println(s2);

	}

}
