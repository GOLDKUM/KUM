package com.lec.ex3_Set;

import java.util.HashSet;
import java.util.Iterator;

//key값은 없고 value값만 있음  그리하여 중복이 되면 안되요~~! 
public class Ex01_HashSet {
	public static void main(String[] args) {
		HashSet<String> hashset = new HashSet<String>();
		// "str0","str1","str2",str3","str2" 마지막 str2는 중복되어서 안함
		hashset.add("str0");
		hashset.add("str1");
		hashset.add("str2");
		hashset.add("str3");
		System.out.println(hashset);
		System.out.println("hashset 사이즈"+hashset.size());
		hashset.add("str2");
		System.out.println(hashset);
		System.out.println("hashset 사이즈"+hashset.size());
		
		Iterator<String> iterator= hashset.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
		
		
	}

}
