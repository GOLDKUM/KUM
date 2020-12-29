package com.lex.ex3_accessTest;

public class AccessTestMain {
	public static void main(String[] args) {
		AccessTest obj= new AccessTest();
//		System.out.println(obj.privateMember); 
		System.out.println(obj.defaultMember);//같은 패키지라가능
		System.out.println(obj.protectedMember);//같은패키지거나 상속받거나
		System.out.println(obj.publicMember);//당현히 되지
		
//		obj.privateMember();
		obj.defaultMethod();
		obj.protectedMember();
		obj.publicMethod();
		
	}

}
