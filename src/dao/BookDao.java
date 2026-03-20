package dao;

import java.util.ArrayList;
import java.util.List;

import interfaces.Storage;
import model.Book;

public class BookDao implements Storage<Book> {
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
		}
		return false;
	}

	@Override
	public boolean update(Book book) {
		Book toUpdateBook = bookList.stream().filter(l -> l.getId() == book.getId()).findFirst().orElse(null);
		if(toUpdateBook != null) {
			book.setTitle(book.getTitle());
			book.setAuthor(book.getAuthor());
			book.setYear(book.getYear());
			book.setIsbn(book.getIsbn());
			book.setAvailable(book.isAvailable());
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
	
	
	
}
