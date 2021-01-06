//2021.01.07 금경용
package com.lec.ex2selectWhere;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

//사용자에게 원하는 부서번호를 입력받아 부서정보 뿌리기 
public class SelectWhereDeptno {
	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Connection conn = null;
		Statement  stmt  = null;
		ResultSet  rs    = null;// select문 전송 결과만 받기 위한 변수 
		Scanner scanner=new Scanner(System.in);

		System.out.print("원하는 부서번호는?");
		int deptno = scanner.nextInt();

		String sql="SELECT * FROM DEPT WHERE DEPTNO="+deptno;
		
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url,"scott","tiger");
			stmt = conn.createStatement();
			rs= stmt.executeQuery(sql);
			if(rs.next()) {
				String dname = rs.getString("dname");
				String loc   = rs.getString("LOC");
				System.out.println( deptno+"번 부서의 정보는 다음과 같습니다");
				System.out.println("부서명"+dname);
				System.out.println("위치"+loc);
				
			}else {//해당부서가 없음 
				System.out.println("해당 부서가 존재하지 않습니다");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null)rs.close();
				if(stmt!=null)stmt.close();
				if(conn!=null)conn.close();
			}catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}

}
