package com.example.BookPublisherManager.models;

public class Book {

	private int book_id;
	private String title;
	private String author;
	private int publication_year;
	private String isbn;
	private int publisher_id;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(int book_id, String title, String author, int publication_year, String isbn, int publisher_id) {
		super();
		this.book_id = book_id;
		this.title = title;
		this.author = author;
		this.publication_year = publication_year;
		this.isbn = isbn;
		this.publisher_id = publisher_id;
	}

	public int getBook_id() {
		return book_id;
	}

	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPublication_year() {
		return publication_year;
	}

	public void setPublication_year(int publication_year) {
		this.publication_year = publication_year;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getPublisher_id() {
		return publisher_id;
	}

	public void setPublisher_id(int publisher_id) {
		this.publisher_id = publisher_id;
	}

}
