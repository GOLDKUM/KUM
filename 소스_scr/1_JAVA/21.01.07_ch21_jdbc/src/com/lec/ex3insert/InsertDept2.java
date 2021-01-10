//2020.01.07 .��. �ݰ��
package com.lec.ex3insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertDept2 {
	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Scanner scanner = new Scanner(System.in);
		System.out.print("�Է��� �μ���ȣ�� ?");
		int deptno = scanner.nextInt();
		Connection conn = null;
		Statement  stmt = null;
		ResultSet  rs   = null;
		String selectSql ="SELECT  * FROM DEPT WHERE DEPTNO ="+deptno;
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url,"scott","tiger");
			stmt= conn.createStatement();
			rs  =stmt.executeQuery(selectSql);
			if(rs.next()) {
				System.out.print("�ߺ��� �μ���ȣ�� �Է��� �Ұ��մϴ�");
				
			}else {
				System.out.print("�Է��� �μ��̸���?");
				String dname = scanner.next();
				System.out.print("�Է��� �μ���ġ��?");
				scanner.nextLine();
				String loc = scanner.nextLine();
				String insertSql = String.format("INSERT INTO DEPT VALUES (%d,'%s','%s')", 
														deptno,dname,loc);
				int result =stmt.executeUpdate(insertSql);
				//System.out.println(result>0? "�Է¼���":"�Է½���");
				if(result>0) {
					System.out.println("�Է¼���");
				}
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {//(7)
			try {
				if(rs != null)rs.close();
				if(stmt!= null)stmt.close();
				if(conn!=null)conn.close();
			} catch (Exception e2) {
				System.out.println(e2.getMessage());
			}//�������� try-catch
		}//try-catch
	}//main
}//class
