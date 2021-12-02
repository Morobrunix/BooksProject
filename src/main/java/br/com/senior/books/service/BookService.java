package br.com.senior.books.service;

import br.com.senior.books.repository.BooksRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class BookService {

    @Autowired
    private BooksRepo booksRepo;


}
