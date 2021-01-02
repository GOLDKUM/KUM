//2020-12-15 �ױݰ��
package com.lec.ex8_decimalFormat;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
// �����ڸ��� #(������ ���, ������ ��¾��� ) 0(�ݵ�� ���)
// ,%(0.98�̸� = 98%�� �ٲ�) ,E������( ������� �˷���)
public class Ex01 {
	public static void main(String[] args) {
		double number = 1234567.8889;
		DecimalFormat df1 =new DecimalFormat("00000000.000000");
		System.out.println(df1.format(number));
		DecimalFormat df2 =new DecimalFormat("########.####");
		System.out.println(df2.format(number));
		DecimalFormat df3 =new DecimalFormat("#,###,###.00000");
		System.out.println(df3.format(number));
		DecimalFormat df4 =new DecimalFormat("#.##%");
		System.out.println(df4.format(number));
		DecimalFormat df5 =new DecimalFormat("#.#####E00");
		System.out.println(df5.format(number));
	}
	
}
