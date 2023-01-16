package application;
import server.ServerException;
import server.ServerMain;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {

	public static void main(String[] args) {
		
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		
		try {
			conn = ServerMain.getConnection();
			st = conn.createStatement();
			rs = st.executeQuery("select * from department");
			while (rs.next()) {
				System.out.println(rs.getInt("id") +" , " +  rs.getString("Name"));
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
			throw new ServerException("Errou!");
		} finally {
			ServerMain.CloseRS(rs);
			ServerMain.closeConnection();
		}


	}

}
