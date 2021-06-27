package com.example.demo.controller;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.BookModel;
import com.example.demo.repository.LibraryRepository;


@RestController
public class LibraryController {
	
	@Autowired
	LibraryRepository libraryRepo;
	
	@PostMapping("/saveBook")
	public BookModel saveBook(@RequestBody BookModel book)
	{
		return libraryRepo.save(book);
	}
	
	@PostMapping("/editBook")
	public BookModel editBook(@RequestBody BookModel book,@RequestParam int bookId)
	{
		book.setBookId(bookId);
		return libraryRepo.save(book);
		
	}
	
	@PostMapping("/deleteBook")
	public String deleteBook(@RequestParam int bookId)
	{
		BookModel book=libraryRepo.getOne(bookId);
		libraryRepo.delete(book);
		return "Deleted Successfully";
		
	}
	@GetMapping("/getBooks")
	public List<BookModel> getBooks()
	{
		return libraryRepo.findAll();
	}
	
	@GetMapping("/getByType")
	public List<BookModel> getByType(@RequestParam String genre)
	{
		return libraryRepo.findByGenre(genre);
	}

}
