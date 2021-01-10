//2020.01.07 .목. 금경용
package com.lec.ex0conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnOracle {
	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		// 1단계-드라이버로드
		Connection conn = null;
		try {
			Class.forName(driver);
			System.out.println("드라이버 로드 성공");
			// 2단계 - DB와 연결 객체 생성
			conn = DriverManager.getConnection(url, "scott", "tiger");
			System.out.println("DB 연결 성공");

		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage() + "드리이버 오류");
		} catch (SQLException e) {
			System.out.println(e.getMessage() + "conn 객체 생성 못함 ");
		} finally {
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage() + ": 닫기 오류");
			}
		}
	}
}
