package com.example.demoproject.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demoproject.entity.book;
@Service

public interface booksservice {
	
	public List<book> getbooks();
	
	public book getbook(long bookid);
	
	public book addbook(book Book);
	
	public book updatebook(book Book);

	public void deletebook(long parseLong);


}
