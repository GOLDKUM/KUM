//2020/12/15 ,kyoung-young /kum
package com.lec.ex2_date;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.lec.ex1_string.Friend;

public class Ex07_birthDay {
	public static void main(String[] args) {
		Friend[] friends= {new Friend("홍길동","010-9999-9999","12-14"),
				           new Friend("홍당구","010-8888-8888","12-01"),
				            new Friend("신길동","010-7777-7777","12-14")};

		int idx;
		Date date= new Date();
		SimpleDateFormat s = new SimpleDateFormat("MM-dd");
		String today = s.format(date);
		System.out.println("오늘은"+today);
		boolean f= false;
		
		for(idx=0;idx<friends.length;idx++) {
			String birth=friends[idx].getBirth();
			if(birth.equals(today)) {
				System.out.println(friends[idx]);
				f=true;
			}//if
			
		}//for
		if(!f) {
			System.out.println("오늘이 생일인 사람이 없습니다.");
		}
			
	}
}
