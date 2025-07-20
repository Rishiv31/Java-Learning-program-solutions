package org.example;

public class BookService {
    private BookRepository Bookrep;

    public void setBookrep(BookRepository bookrep) {
        Bookrep = bookrep;
    }

    public void bookdisplay(){
        Bookrep.display();
    }
}
