package com.lec.loop;
// i가 1일 떄 누적합은 x이다(i가 1~10까지)
public class Ex08while {
	public static void main(String[] args) {
		int i=1;
		int sum=0;
		while(i<=10) {
			sum+=1;//sum = sum+i
//			System.out.println("i가"+i+"일 떄 누적합은"+sum+"이다");
			System.out.printf("i가 %d일 때 누적합은 %d이다\n",i,sum);
			++i;
		}
		for(int j=1 ; j<=10 ; j++) {
			System.out.printf("j가 %d일 때 누적합은 %d이다\n",j,sum);
		}
	}
//oh wo ya meidayan
}
