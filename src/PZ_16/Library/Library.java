package PZ_16.Library;

import java.util.ArrayList;
import java.util.List;

public class Library  extends Final implements AInterface {
    private int booksCount;
    private int emplCount;
    private String directorName;
    private String name;

    private List<Book> books;
    private List<Employees> employees;
    private List<Client> clients;

    public Library(int booksCount, int emplCount, String directorName) {
        this.booksCount = booksCount;
        this.emplCount = emplCount;
        this.directorName = directorName;
        this.name = "Rostov cringe lib";

        books = new ArrayList<>();
        employees = new ArrayList<>();
        clients = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        booksCount++;
    }

    public void delBook(Book book) {
        books.remove(book);
        booksCount--;
    }

    public void addEmpl(Employees empl) {
        employees.add(empl);
    }

    public void delEmpl(Employees empl) {
        employees.remove(empl);
    }

    public void addClient(Client client) {
        clients.add(client);
    }

    public void delClient(Client client) {
        clients.remove(client);
    }

    public String getBooksCount() {
        return "\n" + "Книг в библиотеке на данный момент " + booksCount;
    }

    public void setBooksCount(int booksCount) {
        this.booksCount = booksCount;
    }

    @Override
    public void issueBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                if (!book.isIssued()) {
                    book.setIssued(true);
                    System.out.println("Книга " + book.getTitle() + " успешно выдана.");
                } else {
                    System.out.println("Книга " + book.getTitle() + " уже выдана.");
                }
                return;
            }
        }
        System.out.println("Книга не найдена.");
    }


    @Override
    public void ReturnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && book.isIssued()) {
                book.setIssued(false);
                System.out.println("Книга " + book.getTitle() + " успешно возвращена.");
                return;
            }
        }
        System.out.println("Книга не найдена или уже возвращена.");
    }


    @Override
    public void displayAvailableBook() {
        System.out.println("Доступные книги: ");
        for (Book book : books) {
            if (!book.isIssued()) {
                System.out.println(" -"+book.getTitle() +"  \n" +"Автор: " +book.getAuthor());
            }
        }
    }

    @Override
    public String display() {
        return "Добро пожаловать в нашу библиотеку " + name + "\n"+
                "Имя директора " + directorName;
    }
}
