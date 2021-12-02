package br.com.senior.books.model.book;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = true)
    private String Author;

    @Column(nullable = false)
    private String genere;


    public Book(Long id, String title, String author, String genere) {
        this.id = id;
        this.title = title;
        Author = author;
        this.genere = genere;
    }

    @Deprecated
    public Book() {
    }
}
