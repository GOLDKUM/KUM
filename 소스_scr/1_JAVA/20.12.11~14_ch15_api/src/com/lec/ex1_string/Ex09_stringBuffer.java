//2020/12/15 ,kyoung-young /kum
package com.lec.ex1_string;

public class Ex09_stringBuffer {
	public static void main(String[] args) {
		String str = "abc";
		StringBuilder strBu = new StringBuilder("abc");
		System.out.println("1." + strBu);
		strBu.append("def");

		System.out.println("2." + strBu);
		strBu.insert(3, "AAA");
		System.out.println("3." + strBu);
		strBu.delete(3, 6);
		System.out.println("4." + strBu);
		int capacitySize = strBu.capacity();
		System.out.println("가용크기:" + capacitySize);
		System.out.println("현 strBu의 해시코드" + strBu.hashCode());
		strBu.append("12345678901234567890");
		capacitySize = strBu.capacity();
		System.out.println("가용크기 변경:" + capacitySize);
		System.out.println("변경후 strBu의 해쉬코드:" + strBu.hashCode());

		strBu.ensureCapacity(1000);
		capacitySize = strBu.capacity();
		System.out.println("가용크기 변경:" + capacitySize);
		System.out.println("변경후 strBu의 해쉬코드:" + strBu.hashCode());

	}

}
