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
			stt = conn.prepareStatement(
					"INSERT INTO seller "
					+	"(Name, Email, BirthDate, BaseSalary, DepartmentId) "
					+	"VALUES "
					+	"(?, ?, ?, ?, ?)", + Statement.RETURN_GENERATED_KEYS); 
			stt.setString(1, "Carlo Purple");
			stt.setString(2, "carl@gmail.com");
			stt.setDate(3, new java.sql.Date(sdf.parse("22/04/1996").getTime()));
			stt.setDouble(4, 3000);
			stt.setInt(5, 4);
			int rowsAffected = stt.executeUpdate();
			
			if (rowsAffected > 0) {
				System.out.println("Rows Affected: " + rowsAffected);
				rs = stt.getGeneratedKeys();
				while (rs.next()) {
					int id 	= rs.getInt(1);
					System.out.println("Done! id = " + id);
				}
			} else {
				System.out.println("No rows Affected!");
			}
		
			st = conn.createStatement();
			rs = st.executeQuery("select * from department");
			while (rs.next()) {
				System.out.println(rs.getInt("id") +" , " +  rs.getString("Name"));
			}
		} 
		catch (SQLException | ParseException e) {
			e.printStackTrace();
			throw new ServerException("Errou!");
		} finally {
			ServerMain.CloseRS(rs);
			ServerMain.CloseSt(st);
			ServerMain.closeConnection();
		}


	}

}
