package com.example.demoproject.entity;

public class book {
	
	private long id;
	private String title;
	private String author;
	private String isbn;
	private String date;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "book [id=" + id + ", title=" + title + ", author=" + author + ", isbn=" + isbn + ", date=" + date + "]";
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

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public book(long id, String title, String author, String isbn, String string) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.date = string;
	}

}
