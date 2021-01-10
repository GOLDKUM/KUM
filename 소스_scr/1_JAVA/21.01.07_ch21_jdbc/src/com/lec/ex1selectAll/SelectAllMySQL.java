//2020.01.07 .��. �ݰ��
package com.lec.ex1selectAll;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Date;

public class SelectAllMySQL {
	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver";// 8.0����
		String url = "jdbc:mysql://localhost:3306/kimdb?serverTimezone=UTC";
		Connection conn = null;
		Statement stmt  = null;
		ResultSet rs    = null;
		
		String query ="SELECT * FROM PERSONAL";
		
		try {
			Class.forName(driver); //(1)
			conn= DriverManager.getConnection(url,"root","mysql"); //(2)
			stmt = conn.createStatement();//(3)
			rs   =stmt.executeQuery(query);//(4)+(5)
			System.out.println("���\t�̸�\t��å\t�����\t�Ի���\t�޿�\t��\t�μ���ȣ");
			if(rs.next()) {//select ��� ���� 
				do {
					int pno=rs.getInt("pno");
					String pname = rs.getString("pname");
					String job   = rs.getString("job");
					int manager  = rs.getInt("manager");
					Date startdate = rs.getDate("startdate");
					int pay      = rs.getInt("pay");
					int bouns    = rs.getInt("bouns");
					int dno      =rs.getInt("dno");
					if(pname!=null && pname.length()<7) {
						System.out.printf("%d\t %s\t %s\t %d\t %TF\t %d\t %d\t %d\n",
								pno,pname,job,manager,startdate,pay,bouns,dno);
					}else {
						System.out.printf("%d\t %s %s\t %d\t %TF\t %d\t %d\t %d\n",
								pno,pname,job,manager,startdate,pay,bouns,dno);
					}
					
				}while(rs.next());
				
				
			}else {
				System.out.println("��� ������ �����ϴ�.");
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {//(7)
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
