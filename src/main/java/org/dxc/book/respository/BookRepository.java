package org.dxc.book.respository;

import java.util.List;

import org.dxc.book.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

	
	  @Query("SELECT b FROM Book b WHERE b.publisher=:publisher") 
	  List<Book> findByPublisher(@Param("publisher") String publisher);
	 
}
