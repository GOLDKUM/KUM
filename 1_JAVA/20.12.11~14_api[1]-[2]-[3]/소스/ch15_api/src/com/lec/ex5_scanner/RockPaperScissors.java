//2020-12-15 ⒦금경용
package com.lec.ex5_scanner;

import java.util.Scanner;

public class RockPaperScissors {
	public static void main(String[] args) {
		int computer, you;
		String input;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("가위,바위,보 중 하나선택(당신이 이길때까지) : ");
			input = sc.nextLine().trim();
			computer = (int) (Math.random() * 3);
			if (input.equals("가위")) {
				you = 0;
			} else if (input.equals("바위")) {
				you = 1;
			} else if (input.equals("보")) {
				you = 2;
			} else {
				you = -1;
				continue;
			}
			if ((you + 2) % 3 == computer) {
				printResult(you, computer);
				System.out.println("당신이 이겼어요");
			} else if (you == computer) {
				printResult(you, computer);
				System.out.println("비겼어요");
			} else {
				printResult(you, computer);
				System.out.println("당신이 졌어요");
			} // if
		} while ((you < 0 || you > 2) || ((you + 1) % 3 == computer || you == computer));
		sc.close();
		System.out.println("bye");
	}// main

	private static void printResult(int you, int computer) {
		System.out.println("당신은 " + ((you == 0) ? "가위" : ((you == 1) ? "바위" : "보")));
		System.out.println("컴퓨터는 " + ((computer == 0) ? "가위" : ((computer == 1) ? "바위" : "보")));
	} // printResult

}
