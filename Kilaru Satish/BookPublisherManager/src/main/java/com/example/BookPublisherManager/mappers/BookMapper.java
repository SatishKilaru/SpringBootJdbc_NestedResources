package com.example.BookPublisherManager.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.BookPublisherManager.models.Book;

public class BookMapper implements RowMapper<Book> {

	@Override
	public Book mapRow(ResultSet rs, int rowNum) throws SQLException {

		Book b = new Book();
		b.setBook_id(rs.getInt(1));
		b.setTitle(rs.getString(2));
		b.setAuthor(rs.getString(3));
		b.setPublication_year(rs.getInt(4));
		b.setIsbn(rs.getString(5));
		b.setPublisher_id(rs.getInt(6));
		return b;
	}

}
