package com.lec.ex2_map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Ex01_HashMap {
	public static void main(String[] args) {
		/* String[]strArr= new String[6] */
		ArrayList<String> strlist = new ArrayList<String>();//idx가 있음 
		strlist.add("str11"); //인덱스가 존재 
		
		//index가 없음
		HashMap<Integer,String> hashmap = new HashMap<Integer, String>();  //int =Integer
		hashmap.put(11, "str11");
		hashmap.put(19, "str22");
		hashmap.put(23, "str40");
		/* haspmap.put(39, "str39"); */ //key 값은 공통되면 안된다  왜냐 get으로 key값으로 value값을 불러오기 떄문에 
		System.out.println(hashmap.get(23));//key값이 스트링일수도있고 인테져일수도 있고 특정한 뭔가가 있음 
		System.out.println("remove전: "+hashmap);
		hashmap.remove(19);
		System.out.println("remove후: "+hashmap);
		
		hashmap.clear();//hashmap의 데이터 모두 제거
		hashmap.put(0,"Hong gildong");
		hashmap.put(1,"Kim dongil");
		hashmap.put(2,"Lee soonsin");
		hashmap.put(3,"Yu ain");
		//idx가 없기 떄문에 이렇게 밖에 쓸 수 밖에 없음! 
		System.out.println("=============");
		Iterator<Integer>iterator = hashmap.keySet().iterator();
		while(iterator.hasNext()) {
			Integer key = iterator.next();
			System.out.println(key+"의 데이터는"+hashmap.get(key));
		}//while
		
		
		
		
		
		
		
		
		
	}

}
