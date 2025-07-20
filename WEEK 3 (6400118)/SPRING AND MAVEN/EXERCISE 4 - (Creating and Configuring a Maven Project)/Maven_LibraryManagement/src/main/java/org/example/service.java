package org.example;
public class service {
    private bookrepository bookRepository;
    public void setBookRepository(bookrepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    public void displayBook() {
        bookRepository.display();
    }
}