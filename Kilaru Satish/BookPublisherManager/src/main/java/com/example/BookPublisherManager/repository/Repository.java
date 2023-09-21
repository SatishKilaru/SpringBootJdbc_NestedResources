package com.example.BookPublisherManager.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.BookPublisherManager.contractors.IDao;
import com.example.BookPublisherManager.contractors.IRepository;
import com.example.BookPublisherManager.models.Book;
import com.example.BookPublisherManager.models.Publisher;

@Component
public class Repository implements IRepository {

	@Autowired
	IDao idao;

	@Override
	public List<Book> getAllBooks() {

		return idao.getAllBooks();
	}

	@Override
	public List<Publisher> getAllPublishers() {
		return idao.getAllPublishers();
	}

	@Override
	public List<Book> getBooksById(int id) {
		// TODO Auto-generated method stub
		return idao.getBooksById(id);
	}

	@Override
	public void addBook(Book b) {
		// TODO Auto-generated method stub
		idao.addBook(b);
	}

	@Override
	public void updateBook(Book b) {
		idao.updateBook(b);

	}

	@Override
	public void deleteBook(Book b) {
		idao.deleteBook(b);

	}

}
