package views;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PruebaConexion {

	public static void main(String[] args) throws SQLException{
		// TODO Auto-generated method stub
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost/registro?useTimeZone=true&serverTimeZone=UTC",
				"root", "pass1234");
		System.out.println("Todo OK!!!!");
		
		con.close();
	}

}
