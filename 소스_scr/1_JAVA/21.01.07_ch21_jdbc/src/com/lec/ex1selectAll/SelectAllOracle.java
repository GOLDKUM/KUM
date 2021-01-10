//2020.01.07 .목. 금경용
package com.lec.ex1selectAll;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.Date;

public class SelectAllOracle {
	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Connection conn = null; // DB연결 객체 변수
		Statement stmt = null; // SQL전송 객체 변수
		ResultSet rs = null; // SELECT문 결과 받는 객체 변수
		String sql = "SELECT * FROM EMP";
		try {
			Class.forName(driver);// (1) 드라이브 로드
			conn = DriverManager.getConnection(url, "scott", "tiger");// (2) DB연결
			stmt = conn.createStatement();// (3)SQL 전송 객체 생성
			rs = stmt.executeQuery(sql);// (4) SQL전송+ (5)SQL전송결과받기
			// (6) 결과 받아 원하는 로직 수행 -rs에 있는 데이터 콘솔에 출력
			System.out.println("사번\t이름\t직책\t\t상사번호\t\t입사일\t급여\t상여금\t부서번호");
			while (rs.next()) {
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				int mgr = rs.getInt("mgr");
				// Date hiredate= rs.getDate("hiredate");
				// String hiredate =rs.getString("hiredate");
				Timestamp hiredate = rs.getTimestamp("hiredate");
				int sal = rs.getInt("sal");
				int comm = rs.getInt("comm");
				int deptno = rs.getInt("deptno");
				if(job!=null && job.length()<7) {
				System.out.printf("%d\t %s\t %s\t\t %d\t   %TF\t    %d\t  %d\t %d\t\n", 
						        empno, ename, job, mgr, hiredate, sal, comm, deptno);
				}else {
					System.out.printf("%d\t %s\t %s\t %d\t   %TF\t    %d\t  %d\t %d\t\n", 
					        empno, ename, job, mgr, hiredate, sal, comm, deptno);	
				}
			}

		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage() + "드라이브 오류");
		} catch (SQLException e) {
			System.out.println(e.getMessage() + "접속 오류");
		} finally {
			try {
				if(rs!=null) rs.close();
				if(stmt!=null) stmt.close();
				if(conn!=null)conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

	}

}
