package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.util.Properties;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {
	
	private static Connection conn = null;
	
	public static Connection getConnection() {
		if (conn == null) {
			
			try {
				Properties props = loadProperties();
				String url = props.getProperty("dburl");
				DriverManager.getConnection(url, props);
				} 
				catch (SQLException e) {
				e.printStackTrace();
				throw new DbExcepetion("errou!");
										}
			
		}
		return conn;
												}
	
	public static void CloseConnection() {
		if  (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				throw new DbExcepetion(e.getMessage());
			}
		}
	}
	
	
	
	
	
	private static Properties loadProperties() {
		try(FileInputStream fs = new FileInputStream("db.properties")){
			Properties props = new Properties();
			props.load(fs);
			return props;}
			catch (IOException e) {
				throw new DbExcepetion("erro!");
			}
	

}
}
