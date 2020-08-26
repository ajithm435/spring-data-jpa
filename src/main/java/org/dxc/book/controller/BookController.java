package org.dxc.book.controller;

import java.util.List;
import java.util.Optional;

import org.dxc.book.model.Book;
import org.dxc.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

	@Autowired
	BookService bookService;

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public HttpStatus insertEmployee(@RequestBody Book book) {
		boolean status = bookService.saveBook(book) != null;
		return status ? HttpStatus.CREATED : HttpStatus.BAD_REQUEST;
	}

	@RequestMapping(value = "/findall", method = RequestMethod.GET)
	public List<Book> findAll() {
		return bookService.findAll();
	}

	@RequestMapping(value = "/delete", method = RequestMethod.DELETE)
	public void deleteBook(@RequestParam("bid") int bid) {
		System.out.println(bid);
		bookService.delete(bid);
	}

	@RequestMapping(value = "/getbook", method = RequestMethod.GET)
	public Optional<Book> getBook(@RequestParam("bid") int bid) {
		System.out.println(bid);
		return bookService.getBook(bid);
	}
	
	@RequestMapping(value = "/findbypublisher", method = RequestMethod.GET)
	public List<Book> findByPublisher(@RequestParam("publisher") String publisher) {
		System.out.println("Find by Publisher");
		return bookService.findByPublisher(publisher);
	}
	

	@RequestMapping(value = "/updatebook/{bid}", method = RequestMethod.PUT)
	public void updateBook(@PathVariable("bid") int bid, @RequestBody Book book) {
		System.out.println("Updating....");
		bookService.updateBook(bid, book);
	}

}
