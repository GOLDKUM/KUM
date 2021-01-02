//2020/12/18/Kyoung-yong,Kum
package com.lec.ex3_writerreader;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Ex02_Writer {
	public static void main(String[] args) {
		Writer writer = null;
		try {
			writer = new FileWriter("txtFile/outTest.txt");
			String str = "안녕~ 반갑다\r\n 더좋은컴퓨터";
			char[] st = str.toCharArray();

			writer.write(str);

		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (writer != null)
					writer.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}

}
