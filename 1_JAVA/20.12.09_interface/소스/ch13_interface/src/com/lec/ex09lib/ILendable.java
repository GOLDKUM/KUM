package com.lec.ex09lib;
public interface ILendable {
	public byte STATE_BORROWED=1;//������   
	public byte STATE_NORMAL  =0;//���Ⱑ��

	public void checkOut(String borrow,String checkoutDate);//�������
	public void checkIn(); //�ݳ�
	public void printState();//"�ڹ�" ȫ�浿�� ���Ⱑ��
						    //"�ڹ�" ȫ�浿�� ������
	
	
}
