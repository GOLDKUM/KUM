package com.lex.ex3_accessTest;

public class AccessTestMain {
	public static void main(String[] args) {
		AccessTest obj= new AccessTest();
//		System.out.println(obj.privateMember); 
		System.out.println(obj.defaultMember);//���� ��Ű���󰡴�
		System.out.println(obj.protectedMember);//������Ű���ų� ��ӹްų�
		System.out.println(obj.publicMember);//������ ����
		
//		obj.privateMember();
		obj.defaultMethod();
		obj.protectedMember();
		obj.publicMethod();
		
	}

}
