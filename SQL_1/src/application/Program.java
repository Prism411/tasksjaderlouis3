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
		Statement st = null;
		
		try {
			conn = ServerMain.getConnection();
			
			conn.setAutoCommit(false);
			
			st = conn.createStatement();
			
			
				 int Rows1= st.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE DepartmentId = 1");
				 int Rows2= st.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE DepartmentId = 2");
				 conn.commit();
				 
				System.out.print("Rows 1 = " + Rows1 + ""+"    "+ "Rows2 = " + Rows2);
		} catch(SQLException e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
				throw new ServerException("rollback ERROR!");
			}
			e.printStackTrace();
			throw new ServerException("Errou SQLEXCEPTION!");
		}
		finally {
			ServerMain.CloseSt(st);
			ServerMain.closeConnection();
		}
	
	
	
	}
	}
