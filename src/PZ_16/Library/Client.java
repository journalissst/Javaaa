package PZ_16.Library;

import java.util.ArrayList;
import java.util.List;

public class Client extends Person implements LibraryClient{
    public List<Book> getsBooks;


    public Client( String name, String lastname){
        super(name, lastname);
        getsBooks = new ArrayList<>();
    }

   public void addBook(Book book){
        getsBooks.add(book);
   }

   public String getBookCount(){
       return "\n" + "Книг у посетителя " + getFullName() + ": " + getsBooks.size();
   }
}