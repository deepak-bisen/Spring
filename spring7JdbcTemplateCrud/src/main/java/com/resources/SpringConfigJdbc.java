package com.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class SpringConfigJdbc {
@Bean
public DriverManagerDataSource myDataSource() {
	DriverManagerDataSource dataSource = new DriverManagerDataSource();
	dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
	dataSource.setUrl("jdbc:mysql://localhost:3306/deepak");
	dataSource.setUsername("root");
	dataSource.setPassword("root");
	return dataSource; 
}

@Bean
public JdbcTemplate myJdbcTemplate() {
	JdbcTemplate jdbcTemplate = new JdbcTemplate();
	jdbcTemplate.setDataSource(myDataSource());
	return jdbcTemplate ;
}
}
