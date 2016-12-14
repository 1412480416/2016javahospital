package test;

import java.sql.SQLException;
import java.util.Properties;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;

public class JdbcTest1 {
	
	/**
	 * JSBC测试类
	 * Driver是一个接口：数据库厂商必须实现的接口，能从中获取数据库连接。
	 * 1.首先加入mysql驱动，即mysql的jar包
	 *  1).解压下载的zip压缩包mysql-connector-java-5.1.40.zip
	 *  2).在工程当前目录下新建lib包
	 *  3).把解压后的jar包mysql-connector-java-5.1.40-bin.jar放入lib目录中
	 *  4).在lib目录中的jar包上右键Build path， add to build path 添加到类路径下
	 * @param args
	 * @throws SQLException
	 */

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		Driver driver = new com.mysql.jdbc.Driver();
		
		String url = "jdbc:mysql://127.0.0.1:3306/db_hospital";
		Properties info = new Properties();
		info.put("user", "root");
		info.put("password", "root");
		
		Connection conn = (Connection) driver.connect(url, info);
		System.out.println(conn);
	}

}
