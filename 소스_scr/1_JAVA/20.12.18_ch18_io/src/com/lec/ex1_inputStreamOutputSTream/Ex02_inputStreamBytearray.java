//2020/12/18/Kyoung-yong,Kum
package com.lec.ex1_inputStreamOutputSTream;

import java.io.*;

public class Ex02_inputStreamBytearray {
	public static void main(String[] args) {
		InputStream is = null;
		try {
			is = new FileInputStream("txtFile/1.txt");
			byte[] bs = new byte[10];
			while (true) {
				int readByteCount = is.read(bs);
				if (readByteCount == -1)
					break;
				for (int i = 0; i < readByteCount; i++) {
					System.out.print((char) bs[i]);
				}
			}

		} catch (FileNotFoundException e1) {
			System.out.println(e1.getMessage());
		} catch (IOException e1) {
			System.out.println(e1.getMessage());
		} finally {
			try {
				if (is != null)
					is.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			} // close() try -catch

		} // try

	}// main

}
