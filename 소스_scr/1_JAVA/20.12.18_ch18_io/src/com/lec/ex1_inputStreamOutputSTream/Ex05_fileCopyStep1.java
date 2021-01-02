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
			is = new FileInputStream("E:\\�ݰ��\\src\\1_Java\\ch18_io\\txtFile\\car.jpg");// �Է�
			os = new FileOutputStream("E:\\�ݰ��\\src\\1_Java\\ch18_io\\txtFile\\car2.jpg");
			int cnt = 0;
			while (true) {
				++cnt;
				int i = is.read();
				if (i == -1)
					break;
				os.write(i);
			}
			System.out.println(cnt + "�� �ݺ��� ������ ���� ���� ����");
		} catch (FileNotFoundException e) {
			System.out.println("�����̳� ���� �� ã��" + e.getMessage());
		} catch (IOException e) {
			System.out.println("�а� ���� �����߻�" + e.getMessage());
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
