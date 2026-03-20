package manager;

import java.util.List;
import java.util.stream.Collectors;

import dao.BookDao;
import model.Book;

public class LibraryManager {

	public static void main(String[] args) {

        // Creiamo l'istanza del DAO
        BookDao bookDao = new BookDao();

        // Creiamo alcuni libri di esempio
        Book b1 = new Book("Il Signore degli Anelli", "J.R.R. Tolkien", "9780261102385", 1954, true);
        Book b2 = new Book("1984", "George Orwell", "9780451524935", 1949, true);
        Book b3 = new Book("Harry Potter e la Pietra Filosofale", "J.K. Rowling", "9780747532699", 1997, true);

        // Aggiungiamo i libri al DAO
        bookDao.add(b1);
        bookDao.add(b2);
        bookDao.add(b3);

        // Scriviamo i libri su file
        bookDao.writeToFile(bookDao.getAll());

        // Puliamo la lista interna per simulare la lettura da file
        System.out.println("\n--- Puliamo la lista interna ---\n");
        bookDao.getAll().clear();

        // Leggiamo i libri dal file
        System.out.println("--- Lettura dal file ---\n");
        bookDao.readFromFile();

        // Stampiamo tutti i libri caricati
        System.out.println("\n--- Tutti i libri caricati ---");
        bookDao.getAll().forEach(System.out::println);

        // Stampiamo solo i libri disponibili
        System.out.println("\n--- Libri disponibili ---");
        List<Book> availableBooks = bookDao.getAll().stream()
                .filter(Book::isAvailable)
                .collect(Collectors.toList());
        availableBooks.forEach(System.out::println);

        // Stampiamo i libri ordinati per isbn
        System.out.println("\n--- Libri ordinati per isbn ---");
        List<Book> sortedByAuthor = bookDao.getAll().stream()
                .sorted((bA, bB) -> bA.getIsbn().compareToIgnoreCase(bB.getIsbn()))
                .collect(Collectors.toList());
        sortedByAuthor.forEach(System.out::println);
    }

}
