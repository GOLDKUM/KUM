//2020/12/18/Kyoung-yong,Kum
package comlec.ex5_printwriter;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Writer;

public class Ex01 {
	public static void main(String[] args) {
		PrintWriter printWriter = null;
		OutputStream os = null;
		Writer writer = null;
		try {

			writer = new FileWriter("txtFile/1.txt");
			printWriter = new PrintWriter(writer);

			System.out.println("안녕하세요\n반갑습니다");
			printWriter.println("안녕하세요\r\n 반갑습니다");

			System.out.println("개행자동 안될 예정\n");
			printWriter.print("개행자동 안될 예정\r\n");

			System.out.printf("%5s %3d %3d %5.1f\n", "홍길동", 99, 98, 98.5);
			printWriter.printf("%5s %3d %3d %5.1f\r\n", "홍길동", 99, 98, 98.5);

			System.out.printf("%5s %3d %3d %5.1f\n", "김길동", 100, 100, 99.5);
			printWriter.printf("%5s %3d %3d %5.1f\r\n", "김길동", 100, 100, 99.5);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (printWriter != null)
					printWriter.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
