//2020-12-15 ⒦금경용
package com.lec.ex6_wrapper;

public class Ex01 {
	public static void main(String[] args) {
		int i = 10;
		int j = 10;
		if (i == j) {
			System.out.println("i와 j는 같다");
		}
		Integer obj1 = new Integer(10);
		Integer obj2 = new Integer(10);
		if ("Hello".equals(i)) {// i=new Integer(10)
			System.out.println("같다");
		} else {
			System.out.println("같지않다 ");
		}
		if (obj1.equals(obj2)) {
			System.out.println("obj1과 obj2의 데이터는 같다");
		}
	}

}
