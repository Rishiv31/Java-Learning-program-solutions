package com.Library.service;

import com.Library.repository.BookRepository;

public class BookService {
    public BookService(){
        System.out.println("BookService is created");
    }
    private BookRepository bookRepository;
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    public void displayBook() {
        bookRepository.getBook();
    }
}
