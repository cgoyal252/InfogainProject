package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepo;

@Service
public class BookService 
{

	@Autowired
	BookRepo bookRepo;


	public List<Book> findAll()
	{
		List<Book> book =new ArrayList<>();

		for(Book b:bookRepo.findAll())
		{
			book.add(b);
		}

		return book;
	}


	public void add(Book b)
	{
        bookRepo.save(b);
	}
	
	public Book getBook(int id)
	{
		return bookRepo.findOne(id);
	}
	public void delBook(int id)
	{
		bookRepo.delete(id);
	}

}
