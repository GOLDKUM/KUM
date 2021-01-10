//2020.01.07 .��. �ݰ��
package com.lec.ex4update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateDept {
	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Scanner scanner = new Scanner(System.in);
		System.out.print("������ �μ���ȣ��");
		String deptno= scanner.next();//"50"
		
		//�Է��� �ش� �μ���ȣ�� �ִ��� ���� üũ! 
		
		System.out.print("������ �μ��� �̸���?");
		String dname = scanner.next();
		System.out.print("������ �μ��� ��ġ��?");
		String loc = scanner.next();
		
		//DB����
		Connection conn =null;
		Statement  stmt =null;
	//	String query ="    UPDATE DEPT SET DNAME='IT', LOC='PUSAN'" + 
	//			"        WHERE DEPTNO='50'";
		String query =String.format("UPDATE DEPT SET DNAME='%s', LOC='%s'" + 
				"        WHERE DEPTNO='%s'", dname,loc,deptno);
		
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url,"scott","tiger");
			stmt=conn.createStatement();
			int result =stmt.executeUpdate(query);
			
			System.out.println(result>0? deptno+"�� �μ� ���� ����":"�ش� �μ� ���� ���� ");
			
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (SQLException e) {
			System.out.println(e.getMessage()+"��������!");
		} finally {
			try {
				if(stmt!=null)stmt.close();
				if(conn!=null)conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
	}

}
