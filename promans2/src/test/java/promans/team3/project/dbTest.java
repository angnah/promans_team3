package promans.team3.project;

import java.sql.Connection;
import java.sql.DriverManager;
import org.junit.Test;

public class dbTest {
	
	@Test
	public void dbTest() {
		String info = "jdbc:oracle:thin:@192.168.0.253:1521:xe";
		String id = "ANGNAH";
		String pass = "1234";
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			String url;
			Connection connection = DriverManager.getConnection(info,id,pass);
			
			System.out.println("puss");

			
		} catch (Exception e) {e.printStackTrace();}
		
	}
	
	
}