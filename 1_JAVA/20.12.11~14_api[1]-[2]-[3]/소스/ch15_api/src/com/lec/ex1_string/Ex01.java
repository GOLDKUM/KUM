//2020/12/15 ,kyoung-young /kum
package com.lec.ex1_string;

public class Ex01 {
	public static void main(String[] args) {
		String str1 = "java";
		String str2 = "java";
		String str3 = new String("java");// ������ ��ü ����

		if (str1 == str2) {
			System.out.println("str1�� str2�� ���� �ּ�");

		} else {
			System.out.println("str1�� str2�� �ٸ� �ּ�");
		}
		str1 = "java2";
		if (str1 == str2) {
			System.out.println("str1�� str2�� ���� �ּ�");

		} else {
			System.out.println("str1�� str2�� �ٸ� �ּ�");
		}

		if (str1 == str3) {
			System.out.println("str1�� str3�� ���� �ּ�");
		} else {
			System.out.println("str1�� str3�� �ٸ� �ּ� ");
		} // �ؽ��ڵ� �Դϴ�.
		System.out.println(str1.hashCode());
		System.out.println("str2�� str3 ���� ��Ʈ���̳�?" + str1 == str3 ? "����" : "Ʋ����"); /* �̰� �ּҸ� ����°��� �ƴ϶� �ȿ��ִ� �� �ּҴ� �ٸ� */

		System.out.println("111str2�� str3 ���� ��Ʈ���̳�?" + (str1.equals(str3) ? "����" : "Ʋ����"));// �ּҸ��� �ٸ���
	}

}
