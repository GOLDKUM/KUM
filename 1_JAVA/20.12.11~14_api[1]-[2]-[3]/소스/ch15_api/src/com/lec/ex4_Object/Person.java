//2020-12-15 ©×±Ý°æ¿ë
package com.lec.ex4_Object;

public class Person {
	private long juminNo; // 9301113252012

	public Person(long juminNo) {
		this.juminNo = juminNo;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj != null && obj instanceof Person) {
			
			return juminNo == ((Person) obj).juminNo;
		} // if
		return false;
	}// equals

}
