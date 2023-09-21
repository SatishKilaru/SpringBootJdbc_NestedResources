package com.example.BookPublisherManager.contractors;

import java.util.List;

import com.example.BookPublisherManager.models.Book;
import com.example.BookPublisherManager.models.Publisher;

public interface IDao {

	List<Book> getAllBooks();

	List<Publisher> getAllPublishers();

	List<Book> getBooksById(int id);

	void addBook(Book b);

	void updateBook(Book b);

	void deleteBook(Book b);

}
