package com.lec.loop;
// i�� 1�� �� �������� x�̴�(i�� 1~10����)
public class Ex08while {
	public static void main(String[] args) {
		int i=1;
		int sum=0;
		while(i<=10) {
			sum+=1;//sum = sum+i
//			System.out.println("i��"+i+"�� �� ��������"+sum+"�̴�");
			System.out.printf("i�� %d�� �� �������� %d�̴�\n",i,sum);
			++i;
		}
		for(int j=1 ; j<=10 ; j++) {
			System.out.printf("j�� %d�� �� �������� %d�̴�\n",j,sum);
		}
	}
//oh wo ya meidayan
}
