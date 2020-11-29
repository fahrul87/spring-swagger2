package com.fahrul.springswagger.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fahrul.springswagger.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
