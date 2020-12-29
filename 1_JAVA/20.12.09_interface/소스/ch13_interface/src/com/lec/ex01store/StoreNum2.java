package com.lec.ex01store;
//extends-> implement name변수 추가, 생성자 수정, getter추가  
//2호점: 김치찌개-5,000 부대찌개-5,000 비빔밥-5,000 순대국-5,000  공기밥-무료
public class StoreNum2 implements HeadQuarterStore {
	private String name;
	public StoreNum2(String name) {
		this.name=name;
	}
	// 오버라이드(재정의) ; 부모클래스의 메소드를 재정의
	// 오버로드(중복정의) ; 매개변수의 수나 타입으로 같은 이름의 함수를 중복 정의
	@Override         
	public void bude() {
		System.out.println("부대찌개 5,000원");
	}
	@Override
	public void bibib() {
		System.out.println("비빔밥 5,000원");
	}
	@Override
	public void gonggibab() {
		System.out.println("공기밥 0원. 무료");
	}
	@Override
	public void kimchi() {
		System.out.println("김치찌개 5,000원");
		
	}
	@Override
	public void sunde() {
		System.out.println("순대 5,000원");
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
