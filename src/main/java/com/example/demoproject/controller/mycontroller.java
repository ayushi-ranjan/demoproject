package com.example.demoproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoproject.entity.book;
import com.example.demoproject.services.booksservice;

@RestController
public class mycontroller {
	
	@Autowired
	
	private booksservice Bookservice;
	
	@GetMapping("/home")
	public String home()
	{
		return "Book Application";
	}


//get books info
	
@GetMapping("/books")
public List<book> getbooks()
{
	return this.Bookservice.getbooks();
	
}
@GetMapping("/books/{bookid}")
public book getbook(@PathVariable String bookid) {
	return this.Bookservice.getbook(Long.parseLong(bookid));
}
@PostMapping("/books")
public book addbook(@RequestBody book Book) {
	
	return this.Bookservice.addbook(Book);
}
@PutMapping("/books")
public book updatebook(@RequestBody book Book) {
	

return this.Bookservice.updatebook(Book);
}
@DeleteMapping("/books/{bookid}")
public ResponseEntity<HttpStatus> deletebook(@PathVariable String bookid){
	try {
		this.Bookservice.deletebook(Long.parseLong(bookid));
		return new ResponseEntity<>(HttpStatus.OK);
	}catch(Exception e) {
		return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
}