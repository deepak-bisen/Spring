package com.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.beans.Student;

public class StudentRowMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student std = new Student();
		std.setSno(rs.getInt("sno"));
		std.setName(rs.getString("name"));
		std.setMobile(rs.getLong("mobile"));
		return std;
	}
}
