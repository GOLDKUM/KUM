//2020-12-15 �ױݰ��
package com.lec.ex4_Object;

public class RectanleMain {
	public static void main(String[] args) {
		Rectangle a = new Rectangle("����");
		Rectangle b = new Rectangle(5, 5, "����");
		Rectangle c = new Rectangle(5, 5, "����");
		Rectangle d = new Rectangle(5, 5, "����");

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		if (d.equals(c)) {
			System.out.println("��ġ�մϴ�");
		} else {
			System.out.println("��ġ���� �ʽ��ϴ� ");
		}

	}

}
