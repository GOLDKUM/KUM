package com.lec.ex1_list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex03_arrayListLinkedList {
	public static void main(String[] args) {
		
		ArrayList<String> array= new ArrayList<String>();
		
		LinkedList<String> linked = new LinkedList<String>();
		System.out.println("arrayList 순차적(끝으로) 추가 시간:"+addSeqTime(array));
		System.out.println("linkedList 순차적(끝으로) 추가 시간:"+addSeqTime(linked));
		System.out.println("arrayList 중간인덱스로 추가 시간"+addRandTime(array));
		System.out.println("linkedList 중간인덱스로 추가 시간"+addRandTime(linked));	
		System.out.println("arrayList 끝부터 삭제시간: "+removeSeqTime(array));
		System.out.println("linkedList 끝부터 삭제시간: "+removeSeqTime(linked));
		System.out.println("arrayList 중간부터 삭제시간: "+removeRandTime(array));
		System.out.println("linkedList 중간부터 삭제시간: "+removeRandTime(linked));
	}
	private static long removeRandTime(List<String> list) {
		long start =System.currentTimeMillis();
		for(int i=0; i<list.size();i++) {
			list.remove(0);
			
		}
		long end = System.currentTimeMillis();
		return end-start;
	}
	
	private static long removeSeqTime(List<String> list) {
		long start =System.currentTimeMillis();
		for(int i=list.size()-1; i>1000 ; i--) {
			list.remove(i);
			
		}
		long end = System.currentTimeMillis();
		return end-start;
	}
	
	
	
	private static long addRandTime(List<String> list) {
		long start =System.currentTimeMillis();
		for(int i=0; i<1000; i++) {
			list.add(100,"중간인덱스로 추가 시간 ");
		}
		long end = System.currentTimeMillis();
		return end-start;
	}
	
	private static long addSeqTime(List<String> list) {
		long start =System.currentTimeMillis();//시작시간
		for(int i=0; i<5000000; i++) {
			list.add("순차적으로 추가 ");
		}
		long end = System.currentTimeMillis();//for문 수행 후 시간 
		return end-start;
	}
}
