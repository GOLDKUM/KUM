//2020.01.07 .목. 금경용
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
		
		System.out.println("추가할 부서 번호는?");
		int deptno = scanner.nextInt();
		System.out.println("추가할 부서 이름은?");
		String dname = scanner.next();
		System.out.println("추가할 부서 위치는?");
		scanner.nextLine();
		String loc = scanner.nextLine();
		//DB 접속하여 insert 실행
		Connection conn= null;
		PreparedStatement pstmt= null;
		String sql ="INSERT INTO DEPT VALUES(?,?,?)";
		
		
		
		try {
			Class.forName(driver);
			conn= DriverManager.getConnection(url,"scott","tiger");
			//stmt=conn.createStatement();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, deptno);   //deptno 변수가 Int이라 setInt
			pstmt.setString(2, dname); //dname 변수가 String이라 setString
			pstmt.setString(3, loc);
			
			//int result = stmt.excuteUpdate(sql) -- statement차이점 
			int result =pstmt.executeUpdate();
			System.out.println(result>0? deptno+"입력성공":deptno+"입력실패");
			
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			System.out.println(deptno+"입력실패 ");
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}//close문
		}//DB접속
	}

}
