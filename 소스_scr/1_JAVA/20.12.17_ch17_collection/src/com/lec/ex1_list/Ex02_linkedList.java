package com.lec.ex1_list;

import java.util.LinkedList;

public class Ex02_linkedList {
	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("str0"); //0¿Œµ¶Ω∫ 
		linkedList.add("str1"); //1¿Œµ¶Ω∫  2¿Œµ¶Ω∫
		linkedList.add("str2"); //2¿Œµ¶Ω∫ 3¿Œµ¶Ω∫
		linkedList.add(1,"1111");     //1π¯¿Œµ¶Ω∫ πŸ≤Ò
		System.out.println(linkedList);
		for(int i = 0; i<linkedList.size(); i++)
			System.out.println(linkedList.get(i));
		linkedList.remove("1111");//1111π¯ªË¡¶
		linkedList.clear();
		System.out.println(linkedList.isEmpty()?"∫Òøˆ¡≥¥Ÿ":"æ» ∫Òøˆ¡≥¥Ÿ");
		
	}

}
