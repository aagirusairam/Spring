package com.wavity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class JDBCController {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@RequestMapping("/insert")
	public String insertCustomerDetails() {
		jdbcTemplate.execute("insert into customer(name,email)values('zion2','zion2@gmail.com')");
		return "Data Inserted Successfully  into the DB";
	}	
}

