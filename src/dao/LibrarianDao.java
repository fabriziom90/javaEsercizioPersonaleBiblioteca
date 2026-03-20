package dao;

import java.util.ArrayList;
import java.util.List;

import interfaces.Storage;
import model.Librarian;

public class LibrarianDao implements Storage<Librarian> {
	List<Librarian> librarianList = new ArrayList<Librarian>();
	
	@Override
	public List<Librarian> getAll() {
		List<Librarian> list = new ArrayList<Librarian>(librarianList);
		return list;
	}

	@Override
	public Librarian findOne(int id) {
		// TODO Auto-generated method stub
		Librarian librarian = librarianList.stream().filter(l -> l.getId() == id).findFirst().orElse(null);
		return librarian;
	}

	@Override
	public boolean add(Librarian u) {
		if(!librarianList.contains(u)) {			
			librarianList.add(u);
		}
		return false;
	}

	@Override
	public boolean update(Librarian librarian) {
		Librarian toUpdateLibrarian = librarianList.stream().filter(l -> l.getId() == librarian.getId()).findFirst().orElse(null);
		if(toUpdateLibrarian != null) {
			librarian.setName(librarian.getName());
			librarian.setSurname(librarian.getSurname());
			librarian.setEmail(librarian.getEmail());
			return true;
		}
		
		return false;
	}

	@Override
	public boolean remove(int id) {
		Librarian removeLibrarian = librarianList.stream().filter(l -> l.getId() == id).findFirst().orElse(null);
		if(removeLibrarian != null) {
			librarianList.remove(removeLibrarian);
			return true;
		}
		
		return false;
	}
	
}
