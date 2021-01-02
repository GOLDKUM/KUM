package com.lex.warming3;

public class Parking {
	private String no;
	private int inTime;
	private int outTime;
	private int fee;
	private final int HOURLYRATE =2000;//상수
	//데이터부분의속성
	public Parking(String no, int inTime) {
		this.no=no;
		this.inTime=inTime;
		System.out.println(no+"님 어서오세요");
		System.out.println("입차시간:"+inTime+"시");
		System.out.println("************************");
	}//생성자 인것같은데 
//	public ParkingSystem() {}
//	public ParkingSystem(String no, int inTime, int outTime) {
//		this.no=no;
//		this.inTime=inTime;
//		this.outTime=outTime;
//		fee=(outTime-inTime)*2000;
//	}//데이터안에 있는 속성들의 생성자 내가한거 틀린거 같음
	public void out(int outTime) {
		this.outTime=outTime;
		fee=(outTime-inTime)*HOURLYRATE;
		System.out.println(no+"님 안녕히 가세요");
		System.out.println("입차시간 : "+inTime+"시");
		System.out.println("출차시간 : "+outTime+"시");
		System.out.println("주차요금 :"+fee+"원");
		System.out.println("******************");
		
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public int getInTime() {
		return inTime;
	}
	public void setInTime(int inTime) {
		this.inTime = inTime;
	}
	public int getOutTime() {
		return outTime;
	}
	public void setOutTime(int outTime) {
		this.outTime = outTime;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	
	

	
//	public void in() {
//		System.out.printf("\t %s님 어서오세요 \t 입차시간:%d",
//				                 );
//	}
//	
	
	

}
//데이터 no,inTime,outTime,fee(주차 요금은 시간당 2000)
//메소드 :out(int, outTime)