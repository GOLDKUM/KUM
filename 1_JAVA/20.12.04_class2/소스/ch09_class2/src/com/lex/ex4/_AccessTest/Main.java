package com.lex.ex4._AccessTest;

import com.lex.ex3_accessTest.AccessTest;

public class Main {
	public static void main(String[] args) {
		AccessTest obj = new AccessTest();
		//System.out.println(obj.defaultMember); �ٸ� ��Ű���� �ƴϴϱ�
		//System.out.println(obj.protectedMember);
		System.out.println(obj.publicMember);
		//obj.defaultMethod();
		//obj.protectedMethod();
		obj.publicMethod();
	}

}
