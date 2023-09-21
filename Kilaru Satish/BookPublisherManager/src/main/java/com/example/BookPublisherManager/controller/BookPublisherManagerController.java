package com.example.BookPublisherManager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.BookPublisherManager.contractors.IRepository;
import com.example.BookPublisherManager.models.Book;
import com.example.BookPublisherManager.models.Publisher;

@RestController
public class BookPublisherManagerController {

	@Autowired
	IRepository irip;

	@GetMapping(value = "/publishers")
	public List<Publisher> getAllPublishers() {
		// finds all the products
		List<Publisher> publishers = irip.getAllPublishers();
		System.out.println(publishers.size());
		return publishers;
	}

	@RequestMapping(value = "/books/{id}")
	public List<Book> getBooksByPublisherId(@PathVariable("id") int id) {
		List<Book> books = irip.getBooksById(id);
		System.out.println("satish");
		return books;
	}

	@RequestMapping(value = "/books/{id}", method = RequestMethod.POST)
	public void AddBook(Book b) {
		System.out.println("satish");
		irip.addBook(b);
	}

	@RequestMapping(value = "/books/{id}", method = RequestMethod.PUT)
	public void updateBook(Book b) {
		System.out.println("satish");
		irip.updateBook(b);
	}

	@RequestMapping(value = "/books/{id}", method = RequestMethod.DELETE)
	public void deleteBook(Book b) {
		System.out.println("satish");
		irip.deleteBook(b);
	}

}
