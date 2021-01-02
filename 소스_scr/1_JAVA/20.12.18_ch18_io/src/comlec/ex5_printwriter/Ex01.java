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

			System.out.println("�ȳ��ϼ���\n�ݰ����ϴ�");
			printWriter.println("�ȳ��ϼ���\r\n �ݰ����ϴ�");

			System.out.println("�����ڵ� �ȵ� ����\n");
			printWriter.print("�����ڵ� �ȵ� ����\r\n");

			System.out.printf("%5s %3d %3d %5.1f\n", "ȫ�浿", 99, 98, 98.5);
			printWriter.printf("%5s %3d %3d %5.1f\r\n", "ȫ�浿", 99, 98, 98.5);

			System.out.printf("%5s %3d %3d %5.1f\n", "��浿", 100, 100, 99.5);
			printWriter.printf("%5s %3d %3d %5.1f\r\n", "��浿", 100, 100, 99.5);

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
