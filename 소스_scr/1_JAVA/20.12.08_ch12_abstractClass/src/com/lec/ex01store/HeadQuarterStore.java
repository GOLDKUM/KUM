package com.lec.ex01store;
//源�移섏컡媛�?-5,000  ?�����李?���?-6,000  ?��꾨퉼諛�-6,000 �닚��?���?-5,000  ?�듦린諛�?-1,000�썝
public abstract  class HeadQuarterStore {
	private String name;
	public HeadQuarterStore(String name) {
		this.name = name;
	}
	public abstract void kimchi() ;//추상(abstract) 메소드 -무조건 오버라이드 하세요라는 신호
	public abstract void bude();
	public abstract void bibib();
	public abstract void sunde();
	public abstract void gonggibab();
	public String getName() {return name;}
}
