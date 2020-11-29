package com.fahrul.springswagger.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fahrul.springswagger.model.Book;
import com.fahrul.springswagger.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;

	public String saveBook(Book book) {
		bookRepository.save(book);
		return "book save dwith id " + book.getBookid();
	}

	public Optional<Book> getBook(int id) {
		return bookRepository.findById(id);
	}

	public List<Book> removeBook(int id) {
		bookRepository.deleteById(id);
		return bookRepository.findAll();
	}

}
