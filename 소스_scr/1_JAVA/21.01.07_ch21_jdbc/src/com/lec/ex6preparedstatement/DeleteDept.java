//2020.01.07 .��. �ݰ��
package com.lec.ex6preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

//1.������ �μ���ȣ�� �Է¹ޱ�
//2-1.�Է��� �μ���ȣ�� ���� ���: "��¥ xx�� �μ��� �����ϰڽ��ϱ�?"
//2-1-1 Y:���� -> �����Ϸ�޼���
//          �׿� �������ϰ� ���� 
//2-2. �Է��� �μ���ȣ�� ������ ���ٰ� ���� 
public class DeleteDept {
	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Scanner scanner = new Scanner(System.in);
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String deleteSql ="DELETE FROM DEPT WHERE DEPTNO=?";
		String selectSql = "SELECT * FROM DEPT WHERE DEPTNO=?";
		
		System.out.print("������ �μ���ȣ��?");
		int deptno = scanner.nextInt();
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,"scott","tiger");
			pstmt = conn.prepareStatement(selectSql);
			pstmt.setInt(1, deptno);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				System.out.println(deptno+"�� �μ��� ��¥ �����Ͻðڽ��ϱ�? Y/N");
				String answer = scanner.next();
				if(answer.equalsIgnoreCase("y")) {
					rs.close();
					pstmt.close();
					pstmt = conn.prepareStatement(deleteSql);
					pstmt.setInt(1, deptno);
					int result = pstmt.executeUpdate();
					System.out.println(result>0? deptno+"��������":"���� ����");
				}else {
					System.out.println("����Ǿ����ϴ�.");
				}
					
					
				
			}else {
				System.out.println("�ش� �μ���ȣ�� �μ��� �������� �ʽ��ϴ�.");
			}
			
			
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				if(rs!=null)rs.close();
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			} catch (Exception e) {
				
			}
		}
		
	}

}
