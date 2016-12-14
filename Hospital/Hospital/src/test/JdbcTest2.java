package test;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class JdbcTest2 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		Connection conn = null;
		String sql;
		String url = "jdbc:mysql://localhost:3306/db_hospital?" + "user=root&password=root&userUnicode=true&characterEncoding=UTF8";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("成功加载MySQL驱动");
			conn = (Connection) DriverManager.getConnection(url);
			Statement stmt = (Statement) conn.createStatement();
			sql = "select * from t_medicine";
			ResultSet rs = stmt.executeQuery(sql);
			System.out.println("ID\t药品名称\t药品单价\t计费方式\t是否有效\t上次更新时间\t药品规格\t库存量\t散装库存量\t备注");
			while (rs.next()) {
				System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4) + "\t" + rs.getString(5) + "\t" + rs.getString(6) + "\t" + rs.getString(7) + "\t" + rs.getString(8) + "\t" + rs.getString(9) + "\t" + rs.getString(10));
			}
		} catch (SQLException e) {
			System.out.println("MySQL操作错误");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			conn.close();
		}
		
	}

}
