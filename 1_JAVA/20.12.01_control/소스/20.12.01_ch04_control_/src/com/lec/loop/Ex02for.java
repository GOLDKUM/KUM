package com.lec.loop;

//1~20������ �������� ���
//1+2+3+4+5+6+7+8+9+10+11+12+...+19+20=210
public class Ex02for {
	public static void main(String[] args) {
		int tot = 0; // ������ ����
		for (int i = 1; i <= 20; i++) {
//		tot ������ i���� ��� ����	
			tot = tot + i;
//	���⼭���� ���� ���ߴ�����
			System.out.println("1~20���� ��������" + tot);
		}
	}

}
