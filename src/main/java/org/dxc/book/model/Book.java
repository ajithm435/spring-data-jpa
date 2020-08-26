package org.dxc.book.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "book")
public class Book implements Serializable {

	private static final long serialVersionUID = -7745288526890696508L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bid;

	@Column(name = "BookName")
	private String bookName;

	@Column(name = "AuthorName")
	private String authorName;

	@Column(name = "Publisher")
	private String publisher;

	@Column(name = "ISBN")
	private String isbn;

	@Column(name = "Category")
	private String category;

	@Column(name = "Price")
	private double price;

	public Book() {
		super();

	}

	public Book(int bid, String bookName, String authorName, String publisher, String isbn, String category,
			double price) {
		super();
		this.bid = bid;
		this.bookName = bookName;
		this.authorName = authorName;
		this.publisher = publisher;
		this.isbn = isbn;
		this.category = category;
		this.price = price;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bookName=" + bookName + ", authorName=" + authorName + ", publisher=" + publisher
				+ ", isbn=" + isbn + ", category=" + category + ", price=" + price + "]";
	}

}
