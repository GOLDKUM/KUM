package com.lec.ex01store;
//extends-> implement name변수 추가, 생성자 수정, getter추가  
//1호점: 김치찌개-4,500 부대찌개-5,000 비빔밥-6,000 순대국-안팔아 공기밥-1,000원
public class StoreNum1 implements HeadQuarterStore{
	private String name;
	public StoreNum1(String name) {
		this.name=name;
	}
	@Override
	public void bude() {
		System.out.println("부대찌개 5,000원");
	}
	@Override
	public void sunde() {
		System.out.println("순대국 안 팔아");
	}
	@Override
	public void kimchi() {
		System.out.println("김치찌개 4,500원");
	}
	@Override
	public void bibib() {
		System.out.println("비빔밥 6,000원");
	}
	@Override
	public void gonggibab() {
		System.out.println("공기밥 1,000원");
	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
