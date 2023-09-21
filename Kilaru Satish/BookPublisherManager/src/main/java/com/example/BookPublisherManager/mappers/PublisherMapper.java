package com.example.BookPublisherManager.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.BookPublisherManager.models.Publisher;

public class PublisherMapper implements RowMapper<Publisher> {

	@Override
	public Publisher mapRow(ResultSet rs, int rowNum) throws SQLException {

		Publisher p = new Publisher();
		p.setPublisher_id(rs.getInt(1));
		p.setName(rs.getString(2));
		p.setAddress(rs.getString(3));
		p.setPhone_number(rs.getString(4));
		p.setDescription(rs.getString(5));
		return p;
	}

}
