package com.lec.superMarket;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;

public class CustomerDao {
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	public static final int SUCCESS = 1;
	public static final int FAIL = 0;
	private static CustomerDao INSTANCE;

	public static CustomerDao getInstace() {
		if (INSTANCE == null) {
			INSTANCE = new CustomerDao();
		}
		return INSTANCE;

	}

	public CustomerDao() {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

	// 콤보박스용
	public Vector<String> getLevelNamelist() {
		Vector<String> LNlist = new Vector<String>();
		LNlist.add("");
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "SELECT LEVELNAME FROM CUS_LEVEL";

		try {
			conn = DriverManager.getConnection(url, "scott", "tiger");
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				LNlist.add(rs.getString("levelname"));
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e2) {
				System.out.println(e2.getMessage());
			}
		}
		return LNlist;
	}

	// 1.cId(아이디)검색
	public CustomerDto cIdGetCustomer(String cId) {
		CustomerDto dto = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String sql = "SELECT cId,cTEL,cNAME,cPOINT,cAMOUNT,LEVELNAME,"
				+ "    (SELECT HIGH-CAMOUNT+1 FROM CUSTOMER WHERE CID=C.CID AND LEVELNO<>5 ) forLEVELUP"
				+ "    FROM CUSTOMER C ,CUS_LEVEL L" + "    WHERE c.levelno=l.levelno" + "    AND CID=?";
		try {
			conn = DriverManager.getConnection(url, "scott", "tiger");
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, cId);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				String cTel = rs.getString("ctel");
				String cName = rs.getString("cname");
				int cPoint = rs.getInt("cpoint");
				String levelName = rs.getString("levelName");
				int forLevelup = rs.getInt("forlevelup");
				dto = new CustomerDto(cId, cTel, cName, cPoint, levelName, forLevelup);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e2) {
				System.out.println(e2.getMessage());
			}
		}
		return dto;
	}
	//2. 폰뒤4자리(FULL) 검색
	public ArrayList<CustomerDto>cTelGetCustomers(String cTel){
		ArrayList<CustomerDto>dtos=new ArrayList<CustomerDto>();
		Connection conn = null;
		PreparedStatement pstmt=null;
		ResultSet rs = null;
		String sql="SELECT cId,cTEL,cNAME,cPOINT,cAMOUNT,LEVELNAME," + 
				"    (SELECT HIGH-CAMOUNT+1 FROM CUSTOMER WHERE CID=C.CID AND LEVELNO<>5 ) forLEVELUP" + 
				"    FROM CUSTOMER C ,CUS_LEVEL L" + 
				"    WHERE c.levelno=l.levelno" + 
				"    AND CTEL LIKE '%'||?";
		try {
			conn=DriverManager.getConnection(url,"scott","tiger");
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, cTel);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				String cId = rs.getString("cId");
				String cName = rs.getString("cname");
				int cPoint = rs.getInt("cpoint");
				String levelName = rs.getString("levelName");
				int forLevelup = rs.getInt("forlevelup");
				dtos.add(new CustomerDto(cId, cTel, cName, cPoint, levelName, forLevelup));
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				if(rs   !=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(conn !=null) conn.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		return dtos;
	}
	//3. 고객이름검색 
	public ArrayList<CustomerDto>cNameGetCustomers(String cName){
		ArrayList<CustomerDto>dtos=new ArrayList<CustomerDto>();
		Connection conn = null;
		PreparedStatement pstmt=null;
		ResultSet rs = null;
		String sql="SELECT cId,cTEL,cNAME,cPOINT,cAMOUNT,LEVELNAME," + 
				"    (SELECT HIGH-CAMOUNT+1 FROM CUSTOMER WHERE CID=C.CID AND LEVELNO<>5 ) forLEVELUP" + 
				"    FROM CUSTOMER C ,CUS_LEVEL L" + 
				"    WHERE c.levelno=l.levelno" + 
				"    AND CNAME=?";
		try {
			conn=DriverManager.getConnection(url,"scott","tiger");
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, cName);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				String cId = rs.getString("cId");
				String cTel = rs.getString("ctel");
				int cPoint = rs.getInt("cpoint");
				String levelName = rs.getString("levelName");
				int forLevelup = rs.getInt("forlevelup");
				dtos.add(new CustomerDto(cId, cTel, cName, cPoint, levelName, forLevelup));
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				if(rs   !=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(conn !=null) conn.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		return dtos;
	}
	//포인트로만 구매 
	public int buyWithPoint(int cAmount,String cId) {
		int result=FAIL;
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql="UPDATE CUSTOMER SET CPOINT=CPOINT -? WHERE CID=?";
		try {
			conn=DriverManager.getConnection(url,"scott","tiger");
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, cAmount);
			pstmt.setString(2, cId);
			result=pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				if(pstmt!=null) pstmt.close();
				if(conn !=null) conn.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		return result;
	}
	//5.물품구매
	public int buy(int cAmount, String cId) {
		int result = FAIL;
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql="UPDATE CUSTOMER SET CPOINT=CPOINT+?*0.05," + 
				"                    CAMOUNT=CAMOUNT+?," + 
				"                    LEVELNO =(SELECT L.LEVELNO " + 
				"                                FROM CUSTOMER C,CUS_LEVEL L" + 
				"                                WHERE CAMOUNT+? BETWEEN LOW AND HIGH AND CID=?)   " + 
				"                    WHERE CID=?";
		
		try {
			conn=DriverManager.getConnection(url,"scott","tiger");
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, cAmount);
			pstmt.setInt(2, cAmount);
			pstmt.setInt(3, cAmount);
			pstmt.setString(4, cId);
			pstmt.setString(5, cId);
			result=pstmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				if(pstmt!=null) pstmt.close();
				if(conn !=null) conn.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		return result;
	}
	//등급별 출력
	public ArrayList<CustomerDto> levelNameGetCustomers(String levelName){
		ArrayList<CustomerDto> dtos = new ArrayList<CustomerDto>();
		Connection conn  = null;
		PreparedStatement  pstmt = null;
		ResultSet  rs    = null;
		String sql="SELECT cId,cTEL,cNAME,cPOINT,cAMOUNT,LEVELNAME," + 
				"    (SELECT HIGH-CAMOUNT+1 FROM CUSTOMER WHERE CID=C.CID AND LEVELNO<>5 ) forLEVELUP" + 
				"    FROM CUSTOMER C ,CUS_LEVEL L" + 
				"    WHERE c.levelno=l.levelno AND levelname=?" + 
				"    ORDER BY CAMOUNT DESC";
		try {
			conn=DriverManager.getConnection(url,"scott","tiger");
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, levelName);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				String cId = rs.getString("cId");
				String cTel = rs.getString("ctel");
				String cName = rs.getString("cName");
				int cPoint = rs.getInt("cpoint");
				int forLevelup = rs.getInt("forlevelup");
				dtos.add(new CustomerDto(cId, cTel, cName, cPoint, levelName, forLevelup));
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				if(rs   !=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(conn !=null) conn.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		return dtos;
	}
	//7.전체출력
	public ArrayList<CustomerDto> getCustomers(){
		ArrayList<CustomerDto> dtos = new ArrayList<CustomerDto>();
		Connection conn  = null;
		PreparedStatement  pstmt = null;
		ResultSet  rs    = null;
		String sql ="SELECT cId,cTEL,cNAME,cPOINT,cAMOUNT,LEVELNAME," + 
				"    (SELECT HIGH-CAMOUNT+1 FROM CUSTOMER WHERE CID=C.CID AND LEVELNO<>5 ) forLEVELUP" + 
				"    FROM CUSTOMER C ,CUS_LEVEL L" + 
				"    WHERE c.levelno=l.levelno " + 
				"    ORDER BY CAMOUNT DESC";
		try {
			conn=DriverManager.getConnection(url,"scott","tiger");
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				String cId = rs.getString("cId");
				String cTel = rs.getString("ctel");
				String cName = rs.getString("cName");
				int cPoint = rs.getInt("cpoint");
				int cAmount=rs.getInt("cAmount");
				String levelName=rs.getString("levelname");
				int forLevelup = rs.getInt("forlevelup");
				dtos.add(new CustomerDto(cId, cTel, cName, cPoint,cAmount,levelName, forLevelup));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		return dtos;
	}
	//8.회원가입
	public int insertCustomer(String cTel, String cName) {
		int result = FAIL;
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql="INSERT INTO CUSTOMER (cID,cTEL,CNAME) VALUES(CUSTOMER_SEQ.NEXTVAL,?,?)";
		try {
			conn=DriverManager.getConnection(url,"scott","tiger");
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, cTel);
			pstmt.setString(2, cName);
			result=pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null) pstmt.close();
				if(conn !=null) conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return result;
	}
	//9.번호수정 
	public int updateCustomer(String cTel, String cId) {
		int result = FAIL;
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql="UPDATE CUSTOMER SET CTEL=? WHERE  CID=?";
		try {
			conn=DriverManager.getConnection(url,"scott","tiger");
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, cTel);
			pstmt.setString(2, cId);
			result=pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null) pstmt.close();
				if(conn !=null) conn.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		return result;
	}
	//10 회원 탈퇴! 
	public int deleteCustomer(String cId) {
		int result = FAIL;
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql="DELETE FROM CUSTOMER WHERE CID=?";
		try {
			conn=DriverManager.getConnection(url,"scott","tiger");
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, cId);
			result=pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null) pstmt.close();
				if(conn !=null) conn.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		return result;
	}
	
}// class
