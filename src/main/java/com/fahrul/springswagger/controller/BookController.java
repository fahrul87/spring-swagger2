package com.fahrul.springswagger.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fahrul.springswagger.model.Book;
import com.fahrul.springswagger.service.BookService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/book")
@Api(value = "Book Service", description = "Book Store..")
public class BookController {

	@Autowired
	private BookService bookService;

	@PostMapping("/save")
	@ApiOperation(value = "save book api")
	public String saveBook(@RequestBody Book book) {
		return bookService.saveBook(book);
	}

	@ApiOperation(value = "search book")
	@GetMapping("/searchBook/{id}")
	public Optional<Book> getBookById(@PathVariable int id) {
		return bookService.getBook(id);
	}

	@ApiOperation(value = "delete book")
	@DeleteMapping("/deleteBook/{id}")
	public List<Book> deleteBook(@PathVariable int id) {
		return bookService.removeBook(id);
	}

}
