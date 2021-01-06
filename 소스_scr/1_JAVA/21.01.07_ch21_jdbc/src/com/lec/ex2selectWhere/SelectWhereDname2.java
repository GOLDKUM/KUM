//2021.01.07 금경용
package com.lec.ex2selectWhere;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

//부서명을 입력받아 해단 부서명 정보와 사원 리스트 출력(사번, 이름, 급여, 급여등급 )
public class SelectWhereDname2 {
	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("원하는 부서번호는?");
		String dname = scanner.next();
		
		Connection conn =null;
		Statement  stmt =null;
		ResultSet  rs   =null;
	
		String sql1= String.format("SELECT * FROM DEPT WHERE DNAME='%s'", dname);
		String sql2= String.format("SELECT EMPNO,ENAME,SAL,GRADE FROM EMP E,DEPT D,SALGRADE" + 
				"    WHERE SAL BETWEEN LOSAL AND HISAL" + 
				"    AND E.DEPTNO=D.DEPTNO" + 
				"    AND DNAME='%S'", dname);
		
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url,"scott","tiger");
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql1);
			if(rs.next()) {
				System.out.println("부서번호:"+rs.getInt("deptno"));
				System.out.println("부서이름:"+dname);
				System.out.println("부서위치:"+rs.getString("loc"));
				rs.close();
				rs=stmt.executeQuery(sql2);
				if(rs.next()) {
					System.out.println("사번\t이름\t급여\t급여등급");
					do {
						int empno=rs.getInt("empno");
						String ename= rs.getString("ename");
						int sal = rs.getInt("sal");
						int salgrade = rs.getInt("grade");
						System.out.println(empno+"\t"+ename+"\t"+sal+"\t"+salgrade);
						
						
					}while(rs.next());
					
				}else {
					System.out.println("해당사원이 없습니다");
				}
				
			}else {
				System.out.println("해당부서명이 없습니다");
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if(rs != null)rs.close();
				if(stmt!= null)stmt.close();
				if(conn!=null)conn.close();
			} catch (Exception e2) {
				System.out.println(e2.getMessage());
			}
		}
		
		
		
	}

}
