//2020/12/18/Kyoung-yong,Kum
package com.lec.ex1_inputStreamOutputSTream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex05_fileCopyStep1 {
	public static void main(String[] args) {
		FileInputStream is = null;
		OutputStream os = null;
		try {
			is = new FileInputStream("E:\\금경용\\src\\1_Java\\ch18_io\\txtFile\\car.jpg");// 입력
			os = new FileOutputStream("E:\\금경용\\src\\1_Java\\ch18_io\\txtFile\\car2.jpg");
			int cnt = 0;
			while (true) {
				++cnt;
				int i = is.read();
				if (i == -1)
					break;
				os.write(i);
			}
			System.out.println(cnt + "번 반복문 실행후 파일 복사 성공");
		} catch (FileNotFoundException e) {
			System.out.println("파일이나 폴더 못 찾음" + e.getMessage());
		} catch (IOException e) {
			System.out.println("읽고 쓸떄 에러발생" + e.getMessage());
		} finally {
			try {
				if (os != null)
					os.close();
				if (is != null)
					is.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
