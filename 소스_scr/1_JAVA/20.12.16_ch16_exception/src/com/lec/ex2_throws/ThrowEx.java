//2020.12.16 ,yong-kyoung, kum, throw
package com.lec.ex2_throws;

public class ThrowEx {
	public ThrowEx() throws Exception {
		actionC();
	}

	private void actionC() throws Exception {
		System.out.println("actionC ���ݺ�");
		actionB();
		System.out.println("actionC �Ĺݺ�");
	}

	private void actionB() throws ArrayIndexOutOfBoundsException {
		System.out.println("actionB ���ݺ�");
		actionA();
		System.out.println("actionB �Ĺݺ�");
	}

	
	private void actionA() throws ArrayIndexOutOfBoundsException {
		System.out.println("actionA ���ݺ�");
		int[] arr = { 0, 1, 2, 3 };
		System.out.println(arr[4]);
		System.out.println("actionA �Ĺݺ� ");
	}


}
