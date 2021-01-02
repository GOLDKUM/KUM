package com.lec.loop;

public class Homework1 {
	public static void main(String[] args) {
		int tot = 0;
		for (int i = 1; i < 21; ++i) {
			if (i % 2 != 0 && i % 3 != 0) {
				tot = tot + i;
			}

		}
		System.out.println(tot);

	}

}
