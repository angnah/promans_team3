package promans.team3.project;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class dsTest {
	
	@Autowired
	private DataSource ds;
	
	@Test
	public void text() {
		
		try {
			Connection connection = ds.getConnection();
			
			System.out.println("성공");
		} catch (SQLException e) {e.printStackTrace();}
		
	}
	
}
