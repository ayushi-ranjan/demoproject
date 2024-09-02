package com.example.demoproject.services;

import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.demoproject.entity.book;
@Service

public class bookserviceimpl implements booksservice {

	
List<book> list;

public bookserviceimpl() {
	
	list=new ArrayList<>();
	list.add(new book(145,"Kite runner","khaled","12345","1.4.1999"));
	list.add(new book(146,"it ends with us","collen hover","22345","2.9.2000"));
	list.add(new book(111,"ugly love","collen hover","22345","28.3.2002"));
	list.add(new book(288,"the silent patient","Alex Michaelides","22345","1.11.2003"));

}
	@Override
	public List<book> getbooks() {
		// TODO Auto-generated method stub
		return list;
	}
	@Override
	public book getbook(long bookid) {
		book b=null;
		for(book  book:list)
		{
			if(book.getId()==bookid) {
				b=book;
				break;
			}
		}
		return b;
	}
	@Override
	public book addbook(book Book) {
		list.add(Book);
		return Book;
	}
	@Override
	public book updatebook(book Book) {
		list.forEach(e -> {
			if(e.getId()== Book.getId()) {
				e.setTitle(Book.getTitle());
				e.setAuthor(Book.getAuthor());
				e.setIsbn(Book.getIsbn());
				e.setDate(Book.getDate());


			}
		});

		return Book;
	}
	@Override
	public void deletebook(long parseLong) {
	
	list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());

	}
}
