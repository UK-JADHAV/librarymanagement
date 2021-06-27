package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.BookModel;

public interface LibraryRepository extends JpaRepository<BookModel, Integer> {

	List<BookModel> findByGenre(String genre);

	



}
