//2020/12/18/Kyoung-yong,Kum
package com.lec.ex2_dateInputStreamoutputStream;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Ex01_dataOutputStream {
	public static void main(String[] args) {
		OutputStream fos = null;
		DataOutputStream dos = null;
		try {
			fos = new FileOutputStream("txtFile/dateFile.dat");
			dos = new DataOutputStream(fos);
			dos.writeUTF("홍길동");
			dos.writeInt(2);
			dos.writeDouble(95.9);
			System.out.println("저장 완료");

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (dos != null)
					dos.close();
				if (fos != null)
					fos.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}

}
