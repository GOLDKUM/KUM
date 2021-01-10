//2020.01.07 .��. �ݰ��
package com.lec.ex6preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertDept {
	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�߰��� �μ� ��ȣ��?");
		int deptno = scanner.nextInt();
		System.out.println("�߰��� �μ� �̸���?");
		String dname = scanner.next();
		System.out.println("�߰��� �μ� ��ġ��?");
		scanner.nextLine();
		String loc = scanner.nextLine();
		//DB �����Ͽ� insert ����
		Connection conn= null;
		PreparedStatement pstmt= null;
		String sql ="INSERT INTO DEPT VALUES(?,?,?)";
		
		
		
		try {
			Class.forName(driver);
			conn= DriverManager.getConnection(url,"scott","tiger");
			//stmt=conn.createStatement();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, deptno);   //deptno ������ Int�̶� setInt
			pstmt.setString(2, dname); //dname ������ String�̶� setString
			pstmt.setString(3, loc);
			
			//int result = stmt.excuteUpdate(sql) -- statement������ 
			int result =pstmt.executeUpdate();
			System.out.println(result>0? deptno+"�Է¼���":deptno+"�Է½���");
			
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			System.out.println(deptno+"�Է½��� ");
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}//close��
		}//DB����
	}

}
