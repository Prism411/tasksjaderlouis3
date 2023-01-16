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
import java.sql.Date;

public class Program {

	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		PreparedStatement stt = null;
		
		try {
			conn = ServerMain.getConnection();
			stt = conn.prepareStatement(""
					+ "UPDATE seller "
					+ "SET BaseSalary = BaseSalary + ? "
					+ "WHERE "
					+ "(DepartmentId = ?)");

			stt.setDouble(1, 200.00);
			stt.setInt(2, 2);
				
			int rowsAffected = stt.executeUpdate();
			
			if (rowsAffected > 0) {
				System.out.println("Rows Affected: " + rowsAffected);
			} else {
				System.out.println("No rows Affected!");
			}
		
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
			ServerMain.CloseSt(st);
			ServerMain.closeConnection();
		}


	}

}
