package com.lec.ex1_list;

import java.util.LinkedList;

public class Ex02_linkedList {
	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("str0"); //0�ε��� 
		linkedList.add("str1"); //1�ε���  2�ε���
		linkedList.add("str2"); //2�ε��� 3�ε���
		linkedList.add(1,"1111");     //1���ε��� �ٲ�
		System.out.println(linkedList);
		for(int i = 0; i<linkedList.size(); i++)
			System.out.println(linkedList.get(i));
		linkedList.remove("1111");//1111������
		linkedList.clear();
		System.out.println(linkedList.isEmpty()?"�������":"�� �������");
		
	}

}
