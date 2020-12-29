package com.lec.ex2_map;

import java.util.Hashtable;
import java.util.Iterator;

public class Ex02_HashTable {
	public static void main(String[] args) {
		Hashtable<String, String>hashtable = new Hashtable<String, String>();
		hashtable.put("010-9999-9999", "홍길동");
		hashtable.put("010-8888-8888", "김길동");
		hashtable.put("010-7777-7777", "금길동");
		hashtable.put("010-6666-6666", "중길동");//key는 호출해기 떄문에 중복되면 안된다.
		System.out.println(hashtable);
		
		Iterator<String> iterator = hashtable.keySet().iterator();
		while(iterator.hasNext()) {//iterator.hasNext()??이게뭐지 
			String key = iterator.next();
			System.out.println(key+":"+hashtable.get(key));
		}
		
		
	}
	

}
