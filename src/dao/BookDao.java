package dao;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import interfaces.Salvable;
import interfaces.Storage;
import model.Book;

public class BookDao implements Storage<Book>, Salvable<Book> {
	List<Book> bookList = new ArrayList<Book>();

	@Override
	public List<Book> getAll() {
		List<Book> list = new ArrayList<Book>(bookList);
		return list;
	}

	@Override
	public Book findOne(int id) {
		// TODO Auto-generated method stub
		Book book = bookList.stream().filter(l -> l.getId() == id).findFirst().orElse(null);
		return book;
	}

	@Override
	public boolean add(Book u) {
		if(!bookList.contains(u)) {			
			bookList.add(u);
			return true;
		}
		return false;
	}

	@Override
	public boolean update(Book book) {
		Book toUpdateBook = bookList.stream().filter(l -> l.getId() == book.getId()).findFirst().orElse(null);
		if(toUpdateBook != null) {
			toUpdateBook.setTitle(book.getTitle());
			toUpdateBook.setAuthor(book.getAuthor());
			toUpdateBook.setYear(book.getYear());
			toUpdateBook.setIsbn(book.getIsbn());
			toUpdateBook.setAvailable(book.isAvailable());
			return true;
		}
		
		return false;
	}

	@Override
	public boolean remove(int id) {
		Book removeBook = bookList.stream().filter(l -> l.getId() == id).findFirst().orElse(null);
		if(removeBook != null) {
			bookList.remove(removeBook);
			return true;
		}
		
		return false;
	}

	@Override
	public void writeToFile(List<Book> books) {
		List<String> data = books.stream().map(b -> b.getId()+","+b.getTitle()+","+b.getAuthor()+","+b.getYear()+","+b.getIsbn()+","+b.isAvailable()).collect(Collectors.toList());
		
		Path filePath = Path.of("file_java_libri.csv");
		try {
			Files.write(filePath, data);
			System.out.println("Scrittura completata");
		}
		catch(IOException e) {
			System.err.println("Errore durante la scrittura del file"+e.getMessage());
		}
		
	}

	@Override
	public void readFromFile() {
		Path filePath = Path.of("file_java_libri.csv");
		
		try(Stream<String> lines = Files.lines(filePath)) {
			
			lines.forEach(System.out::println);
		}
		catch(IOException e) {
			System.err.println("Errore nella lettura del file");
		}
		
	}
	
	
	
	
	
}
