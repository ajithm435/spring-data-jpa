package org.dxc.book.service;

import java.util.List;
import java.util.Optional;

import org.dxc.book.model.Book;
import org.dxc.book.respository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	BookRepository bookRepository;

	@Override
	public Book saveBook(Book book) {

		return bookRepository.save(book);

	}

	@Override
	public List<Book> findAll() {

		return bookRepository.findAll();
	}

	@Override
	public void delete(int bid) {

		bookRepository.deleteById(bid);
	}

	@Override
	public Optional<Book> getBook(int bid) {

		return bookRepository.findById(bid);
	}

	@Override
	public void updateBook(int bid, Book book) {
		
		Book book1 = bookRepository.getOne(bid);
		
		book1.setBookName(book.getBookName());
		book1.setAuthorName(book.getAuthorName());
		book1.setPublisher(book.getPublisher());
		book1.setIsbn(book.getIsbn());
		book1.setCategory(book.getCategory());
		book1.setPrice(book.getPrice());

		bookRepository.save(book1);
	}

	@Override
	public List<Book> findByPublisher(String publisher) {
		// TODO Auto-generated method stub
		return bookRepository.findByPublisher(publisher);
	}


}
