//2020/12/15 ,kyoung-young /kum
package com.lec.ex1_string;

import java.util.Scanner;

//��ȭ��ȣ ���ڸ��� ģ��ã��
public class Ex07searchFriend {
	public static void main(String[] args) {
		Friend[] friends = { new Friend("ȫ�浿", "010-9999-9999", "12-14"), new Friend("�ű浿", "010-8888-8888", "12-15"),
				new Friend("���̼�", "010-7777-7777", "12-16"), };
		System.out.print("�˻��ϴ� ȸ�� ��ȭ��ȣ ���ڸ� :");
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
			System.out.println("�ش��ȣ�� ģ���� �����ϴ�.");
		}
	}

}
