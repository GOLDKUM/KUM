//2020/12/18/Kyoung-yong,Kum
package com.lec.ex4_buffered;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Writer;

public class Ex03 {
	public static void main(String[] args) {
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
		Writer writer = null;
		System.out.println("출력할 파일이름은??");
		try {
			String filename = keyboard.readLine();
			writer = new FileWriter(filename, true);
			while (true) {
				System.out.println("출력할 파일 내용은(원하지 않을 시 x ");
				String content = keyboard.readLine();
				if (content.equalsIgnoreCase("x")) {
					break;
				}
				writer.write(content + "\r\n");

			}

		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (writer != null)
					writer.close();
				if (keyboard != null)
					keyboard.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}

}
