//2020-12-15 �ױݰ��
package com.lec.ex6_wrapper;

public class Ex02 {

	public static void main(String[] args) {
		int total=valueSum("10","20","30","40");
		System.out.println("���� ���� �Ѱ��"+total);
		
	}
	private static int valueSum(String...value ) {
//		Stirng[]value= {"10","20","30","40"};
		
		int result=0;//��������
		for(int i=0; i<value.length;i++) {
			//result+=value[i]; //���� ��Ʈ������ �Ǽ� ������ �Ҽ����� 
			result+=Integer.parseInt(value[i]); //���� ��Ʈ���� ������ �ٲ��ִ� ������ ��!
			//Integer.parseInt(val); val���ڿ��� ������ �ٲ��� ! 
		}
		return result;
	}

	
	

}
