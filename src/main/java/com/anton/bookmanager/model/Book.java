package com.anton.bookmanager.model;

import javax.persistence.*;

@Entity
@Table(name = "BOOK")
public class Book {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "BOOK_TITLE")
    private String bookTitle;

    @Column(name = "BOOK_AUTHOR")
    private String bookAuthor;

    @Column(name = "BOOK_PRICE")
    private int bookPrice;

}
