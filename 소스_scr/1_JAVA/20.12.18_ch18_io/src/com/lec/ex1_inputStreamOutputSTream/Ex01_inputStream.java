//2020/12/18/Kyoung-yong,Kum
package com.lec.ex1_inputStreamOutputSTream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Ex01_inputStream {
	public static void main(String[] args) {
		InputStream is = null;
		try {
			is = new FileInputStream("txtFile/1.txt");
			while (true) {
				int i = is.read();
				System.out.print((char) i);
				System.out.println("=");
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			;
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			try {
				if (is != null)
					is.close();
			} catch (IOException e) {
			}
		}

	}

}
