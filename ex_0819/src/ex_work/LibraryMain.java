package ex_work;

public class LibraryMain {

    public static void main(String[] args) {
        
        Library library = new Library();

        Book b1 = new Book();
        b1.setTitle("책1");
        b1.setAuthor("ab");
        b1.setIsbn("0001");

        Book b2 = new Book();
        b2.setTitle("책2");
        b2.setAuthor("ab");
        b2.setIsbn("0002");
        
        Book b3 = new Book();
        b3.setTitle("책3");
        b3.setAuthor("ab");
        b3.setIsbn("0003");
 
        Book b4 = new Book();
        b4.setTitle("책4");
        b4.setAuthor("ab");
        b4.setIsbn("0004");

        Book b5 = new Book();
        b5.setTitle("책5");
        b5.setAuthor("ab");
        b5.setIsbn("0005");

        Book b6 = new Book();
        b6.setTitle("책6");
        b6.setAuthor("ab");
        b6.setIsbn("0006");

        library.addBook(b1);
        library.addBook(b2);
        library.addBook(b3);
        library.addBook(b4);
        library.addBook(b5);
        library.addBook(b6);
      
        library.showAllBooks();

        library.lendBook("0001");
        library.showAllBooks();

        library.lendBook("0002");
        library.returnBook("0001");
        library.showAllBooks();


    }
    
}
