package com.lec.ex1_list;

import java.util.ArrayList;

public class Ex01_ArrayList {
	public static void main(String[] args) {
		String[] array = new String[3];
		array[0]="str0";
		array[1]="str1";
		array[2]="str2";
		for(int idx=0; idx<array.length;idx++) {
			System.out.println("array["+idx+"]+"+array[idx]);
		}
		
		for(String arr:array) {
			System.out.println(arr);
		}
		
		ArrayList<String> arrayList= new ArrayList<String>(); //�ȿ� int�� �� �� ����! integer�̰� ��üŸ�Ը� ������
		arrayList.add("str0");//�ڵ������� ������� 0���� 0�ε����� �� 
		arrayList.add("str1");//1�� �ε���
		arrayList.add("str2");//2�� �ε��� 
		arrayList.add(1,"11111");//Ư���� �ε����� �Ⱦ��ش� 1��!
		
		for(int idx=0; idx<arrayList.size();idx++) {
			System.out.println("arrayList"+idx+"����="+
									arrayList.get(idx));
		}
		System.out.println("==============");
		//1���ε��� ���¹�
		arrayList.remove(1);// 1�� �ε��� �� ���� (2���ε����� 1���ε����� 3���ε�����2���ε�����)
		System.out.println(arrayList);
		
		//remove�� �ڷ��ϳ��� �����°��̵� 
		//��簪�� ���ְ� ��������
		arrayList.clear();//arrayList�� ��� ������ ����
//		if(arrayList.size()==0) {		
		if(arrayList.isEmpty()) {//���� ����ֳ�?
			System.out.println("arrayList �����");
		}
		
		System.out.println(arrayList);
		
		for(String arr:arrayList) {
			System.out.println(arr);
		}
		arrayList=null;//�̷��� �Ǹ� �ּҰ�����
//		if(arrayList.size()==0) {//�̷��ԵǸ� �ּ���ü�� ���� ������ size�� ���� ������ ����
//			System.out.println("arrayList �����");
//		}
		
		
		
	}

}
