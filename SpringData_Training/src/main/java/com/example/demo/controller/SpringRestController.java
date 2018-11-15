package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Book;
import com.example.demo.service.BookService;


 /**
 * @author Instructor
 **/

@RestController
public class SpringRestController 
{

	@Autowired
	BookService bookService;
	
	@GetMapping("/")
	public String getData()
	{
		return "Hello";
	}
	
	@GetMapping("/book")
	public List<Book> getAllBooks()
	{
		return bookService.findAll();
	}
	
	@PostMapping("/book")
	public String addBook(@RequestParam int id,@RequestParam String name,@RequestParam String author,@RequestParam int price)
	{
		Book b=new Book(id, name, author, price);
		bookService.add(b);
		
		return "BOOK ADDED";
	}
	
	@GetMapping("/book1")
	public Book getBookByid(@RequestParam int id)
	{
		return bookService.getBook(id);
	}
	
	@DeleteMapping("/book1")
	public String delBookByid(@RequestParam int id)
	{
		bookService.delBook(id);
		
		return "Book Deleted by id: "+id;
	} 
	
}
