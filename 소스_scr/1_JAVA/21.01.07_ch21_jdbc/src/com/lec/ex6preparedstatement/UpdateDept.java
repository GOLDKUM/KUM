//2020.01.07 .목. 금경용
package com.lec.ex6preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateDept {
	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Scanner scanner = new Scanner(System.in);
		
		Connection        conn =null;
		PreparedStatement pstmt=null;
		ResultSet         rs   =null;
		
		String SelectSql="SELECT * FROM DEPT WHERE DEPTNO=?";
		String UpdateSql="UPDATE DEPT SET DNAME=?, LOC=?" + 
				"        WHERE DEPTNO=?";
		
		System.out.print("수정하고자 하는 부서번호는?");
		int deptno = scanner.nextInt();
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url,"scott","tiger");
			pstmt=conn.prepareStatement(SelectSql);
			pstmt.setInt(1, deptno);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				System.out.println("수정하고자 하는 부서이름?");
				String dname = scanner.next();
				System.out.println("수정하고자 하는 부서위치는?");
				scanner.nextLine();
				String loc   = scanner.nextLine();
				rs.close();
				pstmt.close();
				
				pstmt=conn.prepareStatement(UpdateSql);
				pstmt.setString(1, dname);
				pstmt.setString(2, loc);
				pstmt.setInt(3, deptno);
				
				int result = pstmt.executeUpdate();
				System.out.println(result>0? "입력성공":"수정실패");
				
			}else {
				System.out.println("존재하지 않는 부서입니다.");
			}
			
			
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			System.out.println("수정실패 ");
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
