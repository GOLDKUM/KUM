//2020/12/18/Kyoung-yong,Kum
package comlec.ex5_printwriter;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class CoustomerMain {
	public static void main(String[] args) {
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
		String keepgoing, name, phone, birth, address;
		ArrayList<Customer> customers = new ArrayList<Customer>();
		Date today = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd");
		String todayStr = sdf.format(today);
		do {
			try {
				System.out.print("회원가입을 하실래요(Y/N) ? ");
				keepgoing = keyboard.readLine();
				if(keepgoing.equalsIgnoreCase("n")) break;
				System.out.print("회원이름 ? ");
				name = keyboard.readLine();
				System.out.print("전화번호 ? ");
				phone = keyboard.readLine();
				System.out.print("생일(mm-dd) ? ");
				birth = keyboard.readLine();
				if(birth.equals(todayStr)) {
					System.out.println(name+"님 생일이시군요. 생일축하합니다");
				}
				System.out.print("주소 ? ");
				address = keyboard.readLine();
				customers.add(new Customer(name, phone, birth, address));
			}catch ( IOException e) {
				System.out.println(e.getMessage());
			}
		}while(true);
		// 2. ArrayList 정보와 몇명 가입했는지 파일 출력과 콘솔 출력한다
		OutputStream os = null;
		PrintWriter printwriter = null;
		try {
			os = new FileOutputStream("src/com/lec/homework/customer.txt",true);
			printwriter = new PrintWriter(os);
			for(Customer c:customers) {
				System.out.print(c);
				printwriter.print(c.toString());
			}
		} catch (IOException e) {
			System.out.println("쓰기 예외"+e.getMessage());
		}finally {
			try {
				if(printwriter!=null) printwriter.close();
				if(os!=null) os.close();
				if(keyboard!=null) keyboard.close();
			} catch (Exception ignore) { 
				System.out.println(ignore.getMessage());
			}
		}
	}
}
