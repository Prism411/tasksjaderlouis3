package application;
import server.ServerException;
import server.ServerMain;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import server.ServerIntegrityException;

@SuppressWarnings("unused")
public class Program {

	public static void main(String[] args) {
		
		
		Connection conn = null;
		PreparedStatement st = null;
		
		try {
			conn = ServerMain.getConnection();
			st = conn.prepareStatement(""
					+ "DELETE FROM seller "
					+ "WHERE "
					+ "id = ?");
				 st.setInt(1, 7);
				 int RowsAffected = st.executeUpdate();
				 
				 if (RowsAffected > 0) {
					 System.out.println("Rows Affected where: " + RowsAffected);
				 } else {
					 System.out.println("No rows where affected");
				 }
			
		} catch(SQLException e) {
			e.printStackTrace();
			throw new ServerException("Errou SQLEXCEPTION!");
		}
		finally {
			ServerMain.CloseSt(st);
			ServerMain.closeConnection();
		}
	
	
	
	}
	}
