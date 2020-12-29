package com.lec.ex3_Set;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class Ex02_lotto {
	public static void main(String[] args) {
		TreeSet<Integer>lotto = new TreeSet<Integer>();
		Random random = new Random();
		while(lotto.size()<6) {
			lotto.add(random.nextInt(45)+1);
			
		}
		
//		for(int i=0 ; i<lotto.size(); i++) {
//			lotto.add((int)(Math.random()*45)+1);
//			
//			
//		}
		System.out.println(lotto);
	}

}
