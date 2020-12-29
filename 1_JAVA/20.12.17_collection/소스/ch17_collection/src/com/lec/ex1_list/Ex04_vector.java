package com.lec.ex1_list;

import java.util.Vector;

public class Ex04_vector {
	public static void main(String[] args) {
		Vector<Object> vec= new Vector<Object>();
		AClass objA= new AClass();
		BClass objB= new BClass();
		vec.add(objA);//0번 인덱스에 
		vec.add(objB);//1번 인덱스에
		vec.add("C");//String으로 들어감
		vec.add(10);///new Integer로 10으로 바뀜 
		System.out.println(vec);
		for(int i=0; i<vec.size();i++) {
			System.out.println(vec.get(i).toString());
		}
		if(vec.isEmpty()) {
			System.out.println("vec에 데이터가 없습니다.");
		}else {
			System.out.println("vec에 데이터가 있습니다.");
		}
	}

}
//customer 클래스  이름 전화 번호 toStirng 
//customer arraylist.