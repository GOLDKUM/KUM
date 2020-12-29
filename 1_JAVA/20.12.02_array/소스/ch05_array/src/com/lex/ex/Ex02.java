package com.lex.ex;

public class Ex02 {
	public static void main(String[] args) {
		
		int[]score = {10,20,30,40,50};
		int[] s = score;
		s[0] = 100;
		for(int idx=0 ; idx<score.length ; idx++) {
			System.out.printf("socre[%d]=%d,s[%d]=%d\n",
					idx,score[idx],idx,s[idx]);
		}
			
		
	}
}
