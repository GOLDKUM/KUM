package com.lec.loop;

//1~20까지의 누적합을 출력
//1+2+3+4+5+6+7+8+9+10+11+12+...+19+20=210
public class Ex02for {
	public static void main(String[] args) {
		int tot = 0; // 누적할 변수
		for (int i = 1; i <= 20; i++) {
//		tot 변수에 i값을 계속 누적	
			tot = tot + i;
//	여기서부터 이해 못했던구간
			System.out.println("1~20까지 누적합은" + tot);
		}
	}

}
