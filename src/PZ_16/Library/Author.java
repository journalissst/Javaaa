package PZ_16.Library;

import java.util.ArrayList;
import java.util.List;

public class Author extends Person {
    private List<Book> booksByAuthor;

    public Author(String name, String lastname) {
        super(name, lastname);
        booksByAuthor = new ArrayList<>();
    }

    public void addBookByAuthor(Book book) {
        booksByAuthor.add(book);
    }

    public void displayBooksByAuthor() {
        System.out.println("\n"+"Книги от автора " + getFullName() + ":");
        for (Book book : booksByAuthor) {
            System.out.println(" - " + book.getTitle());
        }
    }
}
