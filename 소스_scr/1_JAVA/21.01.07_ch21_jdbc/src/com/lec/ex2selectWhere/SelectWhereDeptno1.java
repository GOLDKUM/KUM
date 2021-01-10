//2020.01.07 .목. 금경용
package com.lec.ex2selectWhere;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
/* 사용자에게 원하는 부서번호를 입력받아
 (1)해당 부서번호가 존재하는 경우 : 부서정보 출력,
   사원(사번, 이름, 급여, 부서)이 존재할 경우 리스트 출력, 존재하지 않은 경우 사원이 없다고 출력
 (2) 해당 부서번호가 존재하지 않을 경우 : 존재하지 않는 부서번호라고 출력
 */ 
public class SelectWhereDeptno1 {
	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Scanner sc = new Scanner(System.in);
		System.out.print("출력을 원하는 부서번호는 ? ");
		int deptno = sc.nextInt();
		String query1 = "SELECT * FROM DEPT WHERE DEPTNO="+deptno;
		String query2 = "SELECT EMPNO 사번, ENAME 이름, SAL 급여, DEPTNO "
										+ "FROM EMP WHERE DEPTNO="+deptno;
		Connection conn = null;
		Statement  stmt = null;
		ResultSet  rs   = null;
		try {
			Class.forName(driver);//1
			conn = DriverManager.getConnection(url, "scott","tiger");//2
			stmt = conn.createStatement(); //3
			rs   = stmt.executeQuery(query1); // 4+5
			if(rs.next()) {
				System.out.println("원하는 부서번호 : "+deptno);
				System.out.println("원하는 부서이름 : "+rs.getString("dname"));
				System.out.println("원하는 부서위치 : "+rs.getString("loc"));
				rs.close();
				rs = stmt.executeQuery(query2);
				if(rs.next()) {
					System.out.println("사번\t이름\t급여\t부서번호");
					do {
						int empno    = rs.getInt("사번");
						String ename = rs.getString("이름");
						int sal      = rs.getInt("급여");
						System.out.println(empno+"\t"+ename+"\t"+sal+"\t"+deptno);
					}while(rs.next());
				}else {
					System.out.println(deptno+"번 부서 사원은 없습니다");
				}
			}else {
				System.out.println("유효하지 않는 부서번호입니다");
			}
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}finally {
			try { //7.연결해제
				if(rs  !=null) rs.close();
				if(stmt!=null) stmt.close();
				if(conn!=null) conn.close();
			}catch (Exception e) {  }
		}//try-catch-finally
	}// main
}//class