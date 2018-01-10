package com.wavity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootWithJdbcTemplateMySqlApplication {

	public static void main(String[] args) throws SQLException {
		
		SpringApplication.run(SpringBootWithJdbcTemplateMySqlApplication.class, args);
		
 	/*	String url = "jdbc:postgresql://localhost:5432/customer";
		Properties props = new Properties();
		props.setProperty("username","postgres");
		props.setProperty("password","postgres");
		props.setProperty("ssl","true");
		Connection conn = (Connection) DriverManager.getConnection(url, props);

		String url1 = "jdbc:postgresql://localhost:5432/customer?username=postgres&password=postgres&ssl=true";
		Connection conn1 = (Connection) DriverManager.getConnection(url1);*/
	}
}


