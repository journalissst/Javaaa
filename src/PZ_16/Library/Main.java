package PZ_16.Library;

public class Main {
    public static void main(String[] args){
        Book book1 = new Book("L. Tolstoy", 1878, "Anna Karenina");
        Book book2 = new Book("G. Troepolsky", 1971, "Beliy Bim Chernoe uho");
        Book book3 = new Book("J. K. Rowling", 1997, "Harry Potter and the Philosopher's Stone");
        Book book4 = new Book("F. Scott Fitzgerald", 1925, "The Great Gatsby");
        Book book5 = new Book("Harper Lee", 1960, "To Kill a Mockingbird");
        Book book6 = new Book("George Orwell", 1949, "Nineteen Eighty-Four");
        Book book8 = new Book("J. K. Rowling", 1997, "Harry Potter and the Philosopher's Stone");
        Book book9 = new Book("F. Scott Fitzgerald", 1925, "The Great Gatsby");
        Book book10 = new Book("Harper Lee", 1960, "To Kill a Mockingbird");
        Book book11 = new Book("George R. R. Martin", 1996, "A Game of Thrones");
        Book book12 = new Book("J. D. Salinger", 1951, "The Catcher in the Rye");
        Book book13 = new Book("C. S. Lewis", 1950, "The Lion, the Witch and the Wardrobe");
        Book book14 = new Book("F. Scott Fitzgerald", 1925, "The Great Gatsby");
        Book book15 = new Book("А. С. Пушкин", 1833, "Евгений Онегин");
        Book book16 = new Book("Антуан де Сент-Экзюпери", 1943, "Маленький принц");
        Book book17 = new Book("Михаил Булгаков", 1967, "Мастер и Маргарита");
        System.out.println(book6.getTitle());
        System.out.println(book8.getTitle());

        Client cl = new Client("Madafaker", "Pussy");
        Client lol = new Client("Bruh", "Kaka");
        Client siu = new Client("Cristiano", "Ronaldo");
        Client omg = new Client("Omgarbl", "Icantbelive");
        cl.addBook(book2);

        siu.addBook(book6);
        siu.addBook(book8);
        siu.addBook(book11);

        omg.addBook(book4);


        System.out.println(cl.getBookCount());
        System.out.println(siu.getBookCount());
        System.out.println(omg.getBookCount());



        Employees Adolf = new Employees("Adolf","Maga", 2001, "M");
        Employees Anna = new Employees("Anna","Ten", 2004, "Ж");
        Employees Metro = new Employees("Metro","Booming", 2000, "M");
        System.out.println(Anna.getEmpl());


        Library lb = new Library(0, 3, "Pamper P.");
        System.out.println("\n"+lb.display());
        lb.addBook(book1);lb.addBook(book2);lb.addBook(book3);lb.addBook(book4);lb.addBook(book5);lb.addBook(book6);
        lb.addBook(book8);lb.addBook(book9);lb.addBook(book10);lb.addBook(book11);lb.addBook(book12);lb.addBook(book13);
        lb.addBook(book14);lb.addBook(book15);lb.addBook(book16);lb.addBook(book17);
        System.out.println(lb.getBooksCount());
        lb.addEmpl(Adolf);
        lb.addEmpl(Anna);
        lb.addEmpl(Metro);

        lb.addClient(cl);
        lb.addClient(omg);
        lb.addClient(lol);
        lb.addClient(siu);


        lb.displayAvailableBook();

        System.out.println("\n");

        lb.issueBook("Маленький принц");
        lb.issueBook("Маленький принц");
        lb.ReturnBook("Маленький принц");
        lb.ReturnBook("Маленький принц");


        Author au = new Author("Harper", "Lee");
        au.addBookByAuthor(book5);
        au.displayBooksByAuthor();

    }
}
