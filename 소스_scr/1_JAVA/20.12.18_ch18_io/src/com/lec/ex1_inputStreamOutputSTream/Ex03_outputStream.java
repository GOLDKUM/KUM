//2020/12/18/Kyoung-yong,Kum
package com.lec.ex1_inputStreamOutputSTream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Ex03_outputStream {
	public static void main(String[] args) {
		OutputStream os = null;
		try {
			os = new FileOutputStream("txtFile/out txt");
			byte[] bs = { 'H', 'E', 'L', 'L', 'O', '\r', '\n', 'J', 'a', 'v', 'a' };
			for (int i = 0; i < bs.length; i++) {
				os.write(bs[i]);
			}
			System.out.println("성공");
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (os != null)
					os.close(); // 3.파일닫기!
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}
}
