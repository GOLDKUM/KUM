//2020/12/18/Kyoung-yong,Kum
package com.lec.ex1_inputStreamOutputSTream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex05_fileCopyStep3 {
	public static void main(String[] args) {// step2���� ������ �ӵ� ������ !
		FileInputStream is = null;
		OutputStream os = null;
		try {

			File originalFile = new File("E:\\�ݰ��\\src\\1_Java\\ch18_io\\txtFile\\car.jpg");
			is = new FileInputStream(originalFile);// �Է�
			os = new FileOutputStream("E:\\�ݰ��\\src\\1_Java\\ch18_io\\txtFile\\car2.jpg");

			int cnt = 0;

			byte[] bs = new byte[(int) originalFile.length()];
			while (true) {
				++cnt;
				int readByCount = is.read(bs);
				if (readByCount == -1)
					break;

				os.write(bs, 0, readByCount);

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
