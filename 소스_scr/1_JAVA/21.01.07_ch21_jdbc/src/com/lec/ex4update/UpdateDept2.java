//2020.01.07 .목. 금경용
package com.lec.ex4update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateDept2 {
	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Scanner scanner = new Scanner(System.in);
		System.out.print("수정할 부서번호는");
		String deptno= scanner.next();//"50"
		//입력한 해당 부서번호가 있는지 없는 체크! 
		String selectquery=String.format("SELECT * FROM DEPT WHERE DEPTNO=%s", deptno);
		Connection conn =null;
		Statement  stmt =null;
		ResultSet  rs   =null;
		
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url,"scott","tiger");
			stmt = conn.createStatement();
			rs   = stmt.executeQuery(selectquery);
			if(rs.next()) {
				System.out.print("수정할 부서의 이름은?");
				String dname = scanner.next();
				System.out.print("수정할 부서의 위치은?");
				String loc = scanner.next();
				
				//DB수정
				
				String query =String.format("UPDATE DEPT SET DNAME='%s', LOC='%s'" + 
						"        WHERE DEPTNO='%s'", dname,loc,deptno);
				int result =stmt.executeUpdate(query);
				System.out.println(result>0? deptno+"번 부서 수정 성공":"수정 실패");
				
				
			}else {
				System.out.println("유효한 부서번호가 아닙니다. 수정을 종료합니다");
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				if(rs!=null)rs.close();
				if(stmt!=null)stmt.close();
				if(conn!=null)conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		
	}

}
