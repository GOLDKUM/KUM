package com.lec.ex2_map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Ex01_HashMap {
	public static void main(String[] args) {
		/* String[]strArr= new String[6] */
		ArrayList<String> strlist = new ArrayList<String>();//idx�� ���� 
		strlist.add("str11"); //�ε����� ���� 
		
		//index�� ����
		HashMap<Integer,String> hashmap = new HashMap<Integer, String>();  //int =Integer
		hashmap.put(11, "str11");
		hashmap.put(19, "str22");
		hashmap.put(23, "str40");
		/* haspmap.put(39, "str39"); */ //key ���� ����Ǹ� �ȵȴ�  �ֳ� get���� key������ value���� �ҷ����� ������ 
		System.out.println(hashmap.get(23));//key���� ��Ʈ���ϼ����ְ� �������ϼ��� �ְ� Ư���� ������ ���� 
		System.out.println("remove��: "+hashmap);
		hashmap.remove(19);
		System.out.println("remove��: "+hashmap);
		
		hashmap.clear();//hashmap�� ������ ��� ����
		hashmap.put(0,"Hong gildong");
		hashmap.put(1,"Kim dongil");
		hashmap.put(2,"Lee soonsin");
		hashmap.put(3,"Yu ain");
		//idx�� ���� ������ �̷��� �ۿ� �� �� �ۿ� ����! 
		System.out.println("=============");
		Iterator<Integer>iterator = hashmap.keySet().iterator();
		while(iterator.hasNext()) {
			Integer key = iterator.next();
			System.out.println(key+"�� �����ʹ�"+hashmap.get(key));
		}//while
		
		
		
		
		
		
		
		
		
	}

}
