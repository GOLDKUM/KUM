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
		
		ArrayList<String> arrayList= new ArrayList<String>(); //안에 int는 쓸 수 없음! integer이거 객체타입만 가능함
		arrayList.add("str0");//자동적으로 순서대로 0번방 0인덱스로 들어감 
		arrayList.add("str1");//1번 인덱스
		arrayList.add("str2");//2번 인덱스 
		arrayList.add(1,"11111");//특정한 인덱스로 꽂아준다 1번!
		
		for(int idx=0; idx<arrayList.size();idx++) {
			System.out.println("arrayList"+idx+"번쨰="+
									arrayList.get(idx));
		}
		System.out.println("==============");
		//1번인덱스 뺴는법
		arrayList.remove(1);// 1번 인덱스 값 삭제 (2번인덱스가 1번인덱스로 3번인덱스가2번인덱스로)
		System.out.println(arrayList);
		
		//remove는 자료하나를 날리는것이도 
		//모든값을 없애고 싶을떄는
		arrayList.clear();//arrayList의 모든 데이터 삭제
//		if(arrayList.size()==0) {		
		if(arrayList.isEmpty()) {//안이 비어있냐?
			System.out.println("arrayList 비워짐");
		}
		
		System.out.println(arrayList);
		
		for(String arr:arrayList) {
			System.out.println(arr);
		}
		arrayList=null;//이렇게 되면 주소가없음
//		if(arrayList.size()==0) {//이렇게되면 주소자체가 없기 때문에 size로 가서 실행을 못함
//			System.out.println("arrayList 비워짐");
//		}
		
		
		
	}

}
