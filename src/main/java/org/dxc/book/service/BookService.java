package org.dxc.book.service;


import java.util.List;
import java.util.Optional;

import org.dxc.book.model.Book;
import org.springframework.stereotype.Service;

@Service
public interface BookService {
		
	public Book saveBook(Book book);

	public List<Book> findAll();

	public void delete(int bid);

	public Optional<Book> getBook(int bid);

	public void updateBook(int bid, Book book);

	public List<Book> findByPublisher(String publisher);

	
	
}
