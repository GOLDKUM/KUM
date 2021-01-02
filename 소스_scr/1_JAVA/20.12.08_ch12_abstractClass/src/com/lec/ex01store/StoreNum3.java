package com.lec.ex01store;
//3È£Á¡: ±èÄ¡Âî°³-6,000 ºÎ´ëÂî°³-7,000 ºñºö¹ä-7,000 ¼ø´ë±¹-6,000  °ø±â¹ä-1,000¿ø
public class StoreNum3 extends HeadQuarterStore{
	public StoreNum3(String name) {
		super(name);
	}
	@Override
	public void kimchi() {
		System.out.println("±èÄ¡Âî°³ 6,000¿ø");
	}
	@Override
	public void bude() {
		System.out.println("ºÎ´ëÂî°³ 7,000¿ø");
	}
	@Override
	public void bibib() {
		System.out.println("ºñºö¹ä 7,000¿ø");
	}
	@Override
	public void sunde() {
		System.out.println("¼ø´ë±¹ 6,000¿ø");
	}
	@Override
	public void gonggibab() {
		System.out.println("°ø±â¹ä 1,000¿ø");
		
	}
}
