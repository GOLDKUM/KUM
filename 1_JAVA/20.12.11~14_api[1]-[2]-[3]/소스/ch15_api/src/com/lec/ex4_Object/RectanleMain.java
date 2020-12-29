//2020-12-15 ⒦금경용
package com.lec.ex4_Object;

public class RectanleMain {
	public static void main(String[] args) {
		Rectangle a = new Rectangle("검정");
		Rectangle b = new Rectangle(5, 5, "빨강");
		Rectangle c = new Rectangle(5, 5, "검정");
		Rectangle d = new Rectangle(5, 5, "검정");

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		if (d.equals(c)) {
			System.out.println("일치합니다");
		} else {
			System.out.println("일치하지 않습니다 ");
		}

	}

}
