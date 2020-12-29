//2020/12/15 ,kyoung-young /kum
package com.lec.ex1_string;

import java.util.Scanner;

//전화번호 뒷자리로 친구찾기
public class Ex07searchFriend {
	public static void main(String[] args) {
		Friend[] friends = { new Friend("홍길동", "010-9999-9999", "12-14"), new Friend("신길동", "010-8888-8888", "12-15"),
				new Friend("마미숙", "010-7777-7777", "12-16"), };
		System.out.print("검색하는 회원 전화번호 뒷자리 :");
		Scanner scanner = new Scanner(System.in);
		String searchTel = scanner.next();
		int idx;
		boolean searchOk = false;
		for (idx = 0; idx < friends.length; idx++) {
			String temp = friends[idx].getTel();
			String post = temp.substring(temp.lastIndexOf("-") + 1);
			if (post.equals(searchTel)) {
				System.out.println(friends[idx]);
				searchOk = true;
				break;
			} // if
		} // for
		if (!searchOk) {
			System.out.println("해당번호의 친구가 없습니다.");
		}
	}

}
