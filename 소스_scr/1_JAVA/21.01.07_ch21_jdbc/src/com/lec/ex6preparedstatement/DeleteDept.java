//2020.01.07 .목. 금경용
package com.lec.ex6preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

//1.삭제할 부서번호를 입력받기
//2-1.입력한 부서번호가 있을 경우: "진짜 xx번 부서를 삭제하겠습니까?"
//2-1-1 Y:삭제 -> 삭제완료메세지
//          그외 삭제안하고 종료 
//2-2. 입력한 부서번호가 없으면 없다고 종료 
public class DeleteDept {
	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Scanner scanner = new Scanner(System.in);
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String deleteSql ="DELETE FROM DEPT WHERE DEPTNO=?";
		String selectSql = "SELECT * FROM DEPT WHERE DEPTNO=?";
		
		System.out.print("삭제할 부서번호는?");
		int deptno = scanner.nextInt();
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,"scott","tiger");
			pstmt = conn.prepareStatement(selectSql);
			pstmt.setInt(1, deptno);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				System.out.println(deptno+"번 부서를 진짜 삭제하시겠습니까? Y/N");
				String answer = scanner.next();
				if(answer.equalsIgnoreCase("y")) {
					rs.close();
					pstmt.close();
					pstmt = conn.prepareStatement(deleteSql);
					pstmt.setInt(1, deptno);
					int result = pstmt.executeUpdate();
					System.out.println(result>0? deptno+"삭제성공":"삭제 실패");
				}else {
					System.out.println("종료되었습니다.");
				}
					
					
				
			}else {
				System.out.println("해당 부서번호의 부서는 존재하지 않습니다.");
			}
			
			
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (SQLException e) {
			System.out.println(e.getMessage());
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
