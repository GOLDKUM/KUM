//2020/12/18/Kyoung-yong,Kum
package com.lec.ex2_dateInputStreamoutputStream;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class Ex02_DataInputStream {
	public static void main(String[] args) {
		InputStream fis = null;
		DataInputStream dis = null;
		try {
			fis = new FileInputStream("txtFile/dateFile.dat");
			dis = new DataInputStream(fis);
			String name = dis.readUTF();
			int grade = dis.readInt();
			double score = dis.readDouble();
			System.out.println("파일로부터 입력받은 값은 " + name + "\t" + grade + "\t" + score);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (dis != null)
					dis.close();
				if (fis != null)
					fis.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			} // close
		} // try-catch-finally
	}// main

}// class
