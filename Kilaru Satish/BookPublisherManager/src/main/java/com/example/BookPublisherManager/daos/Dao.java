package com.example.BookPublisherManager.daos;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.example.BookPublisherManager.contractors.IDao;
import com.example.BookPublisherManager.mappers.BookMapper;
import com.example.BookPublisherManager.mappers.PublisherMapper;
import com.example.BookPublisherManager.models.Book;
import com.example.BookPublisherManager.models.Publisher;

@Component
public class Dao implements IDao {

	JdbcTemplate jdbcTemplate;

	private String SQL_GET_BOOKS_BY_ID = "select * from  s_books where publisher_id=?";
	private String SQL_GET_BOOKS = "select * from  s_books";
	private String SQL_DELETE_BOOK = "Delete from  s_books where book_id=?";
	private String SQL_UPDATE_BOOK = "Update s_books set book_name=?,title=?,author=?,publcation_year=?,isbn=?,publisher_id=? where book_id=?";
	private String SQL_ADD_BOOK = "INSERT INTO s_books (title, author, publication_year, isbn, publisher_id) VALUES=(?,?,?,?,?)";
	private String SQL_GET_PUBLISHERS = "select * from  s_publishers";

	@Autowired
	public Dao(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public List<Book> getAllBooks() {

		return jdbcTemplate.query(SQL_GET_BOOKS, new BookMapper());
	}

	@Override
	public List<Publisher> getAllPublishers() {

		return jdbcTemplate.query(SQL_GET_PUBLISHERS, new PublisherMapper());
	}

	@Override
	public List<Book> getBooksById(int id) {
		return jdbcTemplate.query(SQL_GET_BOOKS_BY_ID, preparedStatement -> {
			preparedStatement.setInt(1, id);
		}, new BookMapper());
	}

	@Override
	public void updateBook(Book b) {
		jdbcTemplate.update(SQL_UPDATE_BOOK, b.getTitle(), b.getAuthor(), b.getPublication_year(), b.getIsbn(),
				b.getPublisher_id(), b.getBook_id());
	}

	@Override
	public void deleteBook(Book b) {
		jdbcTemplate.update(SQL_DELETE_BOOK, b.getBook_id());
	}

	@Override
	public void addBook(Book b) {
		jdbcTemplate.update(SQL_ADD_BOOK, b.getTitle(), b.getAuthor(), b.getPublication_year(), b.getIsbn(),
				b.getPublisher_id());
	}

}
