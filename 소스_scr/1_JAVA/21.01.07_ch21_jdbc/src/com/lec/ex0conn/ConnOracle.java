//2020.01.07 .��. �ݰ��
package com.lec.ex0conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnOracle {
	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		// 1�ܰ�-����̹��ε�
		Connection conn = null;
		try {
			Class.forName(driver);
			System.out.println("����̹� �ε� ����");
			// 2�ܰ� - DB�� ���� ��ü ����
			conn = DriverManager.getConnection(url, "scott", "tiger");
			System.out.println("DB ���� ����");

		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage() + "�帮�̹� ����");
		} catch (SQLException e) {
			System.out.println(e.getMessage() + "conn ��ü ���� ���� ");
		} finally {
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				System.out.println(e.getMessage() + ": �ݱ� ����");
			}
		}
	}
}
