//2020/12/18/Kyoung-yong,Kum
package com.lec.ex1_inputStreamOutputSTream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Ex04_outputStream {
	public static void main(String[] args) {
		OutputStream os = null;
		try {
			os = new FileOutputStream("txtFile/out.txt", true);
			String str = "모두 다 안녕이 필요한 시국-모두 다 안녕이 필요한 시국";
			byte[] bs = str.getBytes();
			os.write(bs);

		} catch (FileNotFoundException e) {
			System.out.println("파일못찾음" + e.getMessage());
		} catch (IOException e) {
			System.out.println("파일 쓰기오류" + e.getMessage());
			;
		} finally {
			try {
				if (os != null)
					os.close();
			} catch (Exception ignore) {
			}
		}
	}

}
