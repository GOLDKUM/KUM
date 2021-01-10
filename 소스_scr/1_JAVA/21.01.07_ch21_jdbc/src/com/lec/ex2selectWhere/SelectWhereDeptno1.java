//2020.01.07 .��. �ݰ��
package com.lec.ex2selectWhere;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
/* ����ڿ��� ���ϴ� �μ���ȣ�� �Է¹޾�
 (1)�ش� �μ���ȣ�� �����ϴ� ��� : �μ����� ���,
   ���(���, �̸�, �޿�, �μ�)�� ������ ��� ����Ʈ ���, �������� ���� ��� ����� ���ٰ� ���
 (2) �ش� �μ���ȣ�� �������� ���� ��� : �������� �ʴ� �μ���ȣ��� ���
 */ 
public class SelectWhereDeptno1 {
	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Scanner sc = new Scanner(System.in);
		System.out.print("����� ���ϴ� �μ���ȣ�� ? ");
		int deptno = sc.nextInt();
		String query1 = "SELECT * FROM DEPT WHERE DEPTNO="+deptno;
		String query2 = "SELECT EMPNO ���, ENAME �̸�, SAL �޿�, DEPTNO "
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
				System.out.println("���ϴ� �μ���ȣ : "+deptno);
				System.out.println("���ϴ� �μ��̸� : "+rs.getString("dname"));
				System.out.println("���ϴ� �μ���ġ : "+rs.getString("loc"));
				rs.close();
				rs = stmt.executeQuery(query2);
				if(rs.next()) {
					System.out.println("���\t�̸�\t�޿�\t�μ���ȣ");
					do {
						int empno    = rs.getInt("���");
						String ename = rs.getString("�̸�");
						int sal      = rs.getInt("�޿�");
						System.out.println(empno+"\t"+ename+"\t"+sal+"\t"+deptno);
					}while(rs.next());
				}else {
					System.out.println(deptno+"�� �μ� ����� �����ϴ�");
				}
			}else {
				System.out.println("��ȿ���� �ʴ� �μ���ȣ�Դϴ�");
			}
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}finally {
			try { //7.��������
				if(rs  !=null) rs.close();
				if(stmt!=null) stmt.close();
				if(conn!=null) conn.close();
			}catch (Exception e) {  }
		}//try-catch-finally
	}// main
}//class