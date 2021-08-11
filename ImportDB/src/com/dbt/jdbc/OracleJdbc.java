package com.dbt.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.dbt.entity.TerminalEntity;
public class OracleJdbc {
	static {
		try {
			//加载数据库驱动
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

//获取数据库连接对象
	public static Connection getConn() {
		Connection conn = null;
		try {
			//"jdbc:oracle:thin:@localhost:1521:你的数据库名字", "用户名","密码"
			conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.189:1521:fsadb218SID", "tsingtaosmp","111111");
			//conn = DriverManager.getConnection("jdbc:oracle:thin:@172.16.1.224:1521/cms", "tsingtaosmp","dbtplus123");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

//获取语句执行对象
	public static Statement getStatement(Connection conn) {
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stmt;
	}

	//获取预处理语句执行对象
	public static PreparedStatement getPreparedStatement(Connection conn,
			String sql) {
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return pstmt;
	}

	//获取结果集对象
	public static ResultSet getResultSet(PreparedStatement pstmt) {
		ResultSet res = null;
		try {
			res = pstmt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}

	//获取结果集对象
	public static ResultSet getResultSet(Statement stmt, String sql) {
		ResultSet res = null;
		try {
			res = stmt.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}

	//关闭资源方法
	public static void close(Connection conn, Statement stmt, ResultSet res) {
		close(res);
		close(stmt);
		close(conn);
	}

	//封装方法关闭语句对象
	private static void close(Statement stmt) {
		if (stmt != null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			stmt = null;
		}
	}

	//封装方法关闭结果集对象
	private static void close(ResultSet res) {
		if (res != null) {
			try {
				res.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			res = null;
		}
	}

	//封装方法关闭数据库连接对象
	private static void close(Connection conn) {
		try {
			if (conn != null && !conn.isClosed()) {
				conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		conn = null;
	}
	
	public static boolean savecms(TerminalEntity terminalEntity)
	{
	// 返回影响的行数
			int row = 0;
	// 建立数据库连接
			Connection conn = OracleJdbc.getConn();
			// 要执行的SQL语句
			String sql = "insert into MST_TERMINALINFO_M values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

			// 用PreparedStatement语句执行对象执行sql语句
			PreparedStatement pstmt = OracleJdbc.getPreparedStatement(conn, sql);
	        try {
	            pstmt.setString(1, terminalEntity.getTerminalkey());
				pstmt.setString(2, terminalEntity.getRoutekey());
				pstmt.setString(3, terminalEntity.getTerminalcode());
				pstmt.setString(4, terminalEntity.getTerminalname());
				pstmt.setString(5, terminalEntity.getProvince());
				pstmt.setString(6, terminalEntity.getCity());
				pstmt.setString(7, terminalEntity.getCounty());
				pstmt.setString(8, terminalEntity.getAddress());
				pstmt.setString(9, terminalEntity.getContact());
				pstmt.setString(10, terminalEntity.getMobile());
				pstmt.setString(11, terminalEntity.getTlevel());
				pstmt.setString(12, terminalEntity.getSequence());
				pstmt.setString(13, terminalEntity.getCycle());
				pstmt.setString(14, "0");
				pstmt.setString(15, "0");
				pstmt.setString(16, "0");
				pstmt.setString(17, "1");
				pstmt.setString(18, terminalEntity.getSellchannel());
				pstmt.setString(19, terminalEntity.getMainchannel());
				pstmt.setString(20, terminalEntity.getMinorchannel());
				pstmt.setString(21, "");
				pstmt.setString(22, "");
				Date date1 = new Date();  
				SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				String newdate = formatter.format(date1);
				java.sql.Timestamp buydate=java.sql.Timestamp.valueOf(newdate);
				pstmt.setTimestamp(23, buydate);
				pstmt.setString(24, "");
				pstmt.setTimestamp(25, buydate);
				SimpleDateFormat formatter1 = new SimpleDateFormat("yyyy-MM-dd");
				String newdate1 = formatter1.format(date1);
				pstmt.setString(26, "DBT2014110607");
				pstmt.setString(27, "");
				pstmt.setString(28, "");
				pstmt.setString(29, "0");
				pstmt.setString(30, "");
				pstmt.setTimestamp(31, buydate);
				pstmt.setString(32, "");
				pstmt.setTimestamp(33, buydate);
				pstmt.setString(34, "");
				pstmt.setString(35, "");
				// 执行
				row = pstmt.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				// 断开连接
				OracleJdbc.close(conn, pstmt, null);
			}

			// 返回结果
			//System.out.println("增加了" + row + "行！");
			return (row > 0 ? true : false);
	}
	/**
	 * 使用线路code查询线路key
	 * @return
	 */
	public static String selectRouteKey(String routecode)
	{
	// 建立数据库连接
	   String routeKey = "";
	   Connection conn = OracleJdbc.getConn();
	   String sql = "SELECT m.ROUTEKEY FROM MST_ROUTE_M m WHERE m.ROUTECODE = ?" ;

		// 用PreparedStatement语句执行对象执行sql语句
		PreparedStatement pstmt = OracleJdbc.getPreparedStatement(conn, sql);
		try {
			pstmt.setString(1, routecode);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		ResultSet rs;
		try {
			rs = pstmt.executeQuery();
			while(rs.next()){
				String fname = rs.getString("ROUTEKEY");
				routeKey = fname;
				}
				rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// 断开连接
		OracleJdbc.close(conn, pstmt, null);
		return routeKey;
	}
	public static String checkChannel(String one,String two,String thr)
	{
		// 建立数据库连接
		   String flag = "";
		   Connection conn = OracleJdbc.getConn();
		   String sql = "select(case when ? in (select diccode from cmm_datadic_m) and ? =(select PARENTCODE from cmm_datadic_m where DICcode= ? ) and ? in (select diccode from cmm_datadic_m where parentcode=?) then 1 else 0 end) flags from dual" ;

			// 用PreparedStatement语句执行对象执行sql语句
			PreparedStatement pstmt = OracleJdbc.getPreparedStatement(conn, sql);
			try {
				pstmt.setString(1, two);
				pstmt.setString(2, one);
				pstmt.setString(3, two);
				pstmt.setString(4, thr);
				pstmt.setString(5, two);
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			ResultSet rs;
			try {
				rs = pstmt.executeQuery();
				while(rs.next()){
					String s = rs.getString("flags");
					flag = s;
					//System.out.println(s);
					}
					rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			// 断开连接
			OracleJdbc.close(conn, pstmt, null);
			return flag;
	}
	//
	public static void main(String[] args) {
		OracleJdbc oracleJdbc = new OracleJdbc();
		String reo = OracleJdbc.checkChannel("4F569BFB355A4FDF8B740A9B4563D4E3","41CCC2A304DF49BE9689EE40D963BB89","2A4CC24EAB634BB191BE489B80C9FA94");
		System.out.println(reo);
	}
}
