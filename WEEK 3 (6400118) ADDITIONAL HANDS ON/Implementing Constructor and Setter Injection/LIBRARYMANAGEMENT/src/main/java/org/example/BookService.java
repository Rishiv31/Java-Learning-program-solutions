package org.example;
public class BookService {
    private BookRepository Bookrep;
    private String name;
    public BookService(String name) {
        this.name = name;
        System.out.println("Constructor injection: " + name);
    }
    public void setBookrep(BookRepository bookrep) {
        Bookrep = bookrep;
    }
    public void bookdisplay(){
        Bookrep.display();
    }
}
