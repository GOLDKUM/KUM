//2020/12/15 ,kyoung-young /kum
package com.lec.ex1_string;

public class Friend {
	private String name;
	private String tel;
	private String birth;

	public Friend() {
	}

	public Friend(String name, String tel, String birth) {
		this.name = name;
		this.tel = tel;
		this.birth = birth;
	}

	public void print() {
		System.out.printf("[�̸�]%s [��ȭ]%s [����]%s\n", name, tel, birth);
	}

	@Override
	public String toString() {
		return "[�̸�]" + name + "[��ȭ]" + tel + "[����]" + birth;
	}

	public String getName() {
		return name;
	}

	public String getTel() {
		return tel;
	}

	public String getBirth() {
		return birth;
	}

}
