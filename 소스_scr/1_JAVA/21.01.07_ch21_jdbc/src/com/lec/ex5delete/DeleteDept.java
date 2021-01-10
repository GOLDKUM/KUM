//2020.01.07 .목. 금경용
package com.lec.ex5delete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteDept {
	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Scanner scanner = new Scanner(System.in);
		System.out.print("삭제할 부서번호는?");
		int deptno = scanner.nextInt();
		
		Connection conn = null;
		Statement  stmt = null;
		String deleteSql = "DELETE FROM DEPT WHERE DEPTNO="+deptno;
		
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url,"scott","tiger");
			stmt=conn.createStatement();
			int result = stmt.executeUpdate(deleteSql);
			if(result>0){
				System.out.println(deptno+"번 부서 삭제완료");
			}else {
				System.out.println(deptno+"번 부서는 존재하지 않습니다 .");
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				if(stmt!=null)stmt.close();
				if(conn!=null)conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}//close문
		}//DB접속
	}//main
}//class
