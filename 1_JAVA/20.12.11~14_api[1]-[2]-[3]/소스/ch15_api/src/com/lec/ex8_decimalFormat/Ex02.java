//2020-12-15 ⒦금경용
package com.lec.ex8_decimalFormat;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
// 숫자자리에 #(있으면 출력, 없으면 출력안함 ) 0(반드시 출력)
// ,%(0.98이면 = 98%로 바뀜) ,E지수형( 몇승인지 알려줌)
public class Ex02 {
	public static void main(String[] args) {
		String[] patterns= {"00000000.000000",
				            "########.####",
				            "#,###,###.00000",
				            "#.##%",
				            "#.#####E00"
		};
		double number = 1234567.8889;
		for(String pattern: patterns) {
			DecimalFormat df=new DecimalFormat(pattern);
			System.out.println(df.format(number));			
		}
		
		
		
//		DecimalFormat df1 =new DecimalFormat("00000000.000000");
//		System.out.println(df1.format(number));
//		DecimalFormat df2 =new DecimalFormat("########.####");
//		System.out.println(df2.format(number));
//		DecimalFormat df3 =new DecimalFormat("#,###,###.00000");
//		System.out.println(df3.format(number));
//		DecimalFormat df4 =new DecimalFormat("#.##%");
//		System.out.println(df4.format(number));
//		DecimalFormat df5 =new DecimalFormat("#.#####E00");
//		System.out.println(df5.format(number));
	}
	
}
