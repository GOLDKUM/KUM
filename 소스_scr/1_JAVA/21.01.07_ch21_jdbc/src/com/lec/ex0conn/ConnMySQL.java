//2020.01.07 .목. 금경용
package com.lec.ex0conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnMySQL {
	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver";// 8.0버젼
		String url = "jdbc:mysql://localhost:3306/kimdb?serverTimezone=UTC";
		Connection conn = null;
		// 1. 드라이버 로드
		try {
			Class.forName(driver);
			System.out.println("드라이버 로드 성공");
			// 2. DB연결 객체
			conn = DriverManager.getConnection(url, "root", "mysql");
			System.out.println("MYSQL DB 연결 성공");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage() + "드라이버 오류");
		} catch (SQLException e) {
			System.out.println(e.getMessage() + "연결오류");
		} finally {
			try {
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}

}
