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
			
<<<<<<< HEAD
			System.out.println("푸시");
=======
			System.out.println("내거봐줘기선아");
>>>>>>> 7305f3c2b28576f36384b86d08f56bb3b8f02822
			
		} catch (Exception e) {e.printStackTrace();}
		
	}
	
	
}