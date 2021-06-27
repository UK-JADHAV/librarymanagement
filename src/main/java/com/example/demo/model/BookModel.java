package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BookModel {
	
	@Id
	@Column(name="bookId")
	private int bookId;
	
	@Column(name="quantity")
	private int quantity;
	
	@Column(name="bookName")
	private String bookName;
	
	@Column(name="genre")
	private String genre;
	
	public BookModel()
	{
		
	}
	

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
      
}
