package com.lex.warming3;

public class Parking {
	private String no;
	private int inTime;
	private int outTime;
	private int fee;
	private final int HOURLYRATE =2000;//���
	//�����ͺκ��ǼӼ�
	public Parking(String no, int inTime) {
		this.no=no;
		this.inTime=inTime;
		System.out.println(no+"�� �������");
		System.out.println("�����ð�:"+inTime+"��");
		System.out.println("************************");
	}//������ �ΰͰ����� 
//	public ParkingSystem() {}
//	public ParkingSystem(String no, int inTime, int outTime) {
//		this.no=no;
//		this.inTime=inTime;
//		this.outTime=outTime;
//		fee=(outTime-inTime)*2000;
//	}//�����;ȿ� �ִ� �Ӽ����� ������ �����Ѱ� Ʋ���� ����
	public void out(int outTime) {
		this.outTime=outTime;
		fee=(outTime-inTime)*HOURLYRATE;
		System.out.println(no+"�� �ȳ��� ������");
		System.out.println("�����ð� : "+inTime+"��");
		System.out.println("�����ð� : "+outTime+"��");
		System.out.println("������� :"+fee+"��");
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
//		System.out.printf("\t %s�� ������� \t �����ð�:%d",
//				                 );
//	}
//	
	
	

}
//������ no,inTime,outTime,fee(���� ����� �ð��� 2000)
//�޼ҵ� :out(int, outTime)