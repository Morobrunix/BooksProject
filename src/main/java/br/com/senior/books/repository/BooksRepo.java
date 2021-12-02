package br.com.senior.books.repository;

import br.com.senior.books.model.book.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BooksRepo extends JpaRepository<Book, Long> {
}
