package dao;

import java.util.TreeSet;

import interfaces.Archivio;
import model.Libro;

public class LibroDao implements Archivio<Libro, Integer>{
	TreeSet<Libro> setLibri = new TreeSet<Libro>(); 
	
	@Override
	public void aggiungi(Libro elem) {
		// TODO Auto-generated method stub
		setLibri.add(elem);
	}

	@Override
	public boolean rimuovi(Libro elem) {
		// TODO Auto-generated method stub
		for(Libro l : setLibri) {
			if(l.getIsbn().equals(elem.getIsbn())) {
				setLibri.remove(elem);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean aggiorna(Libro elem) {
		// TODO Auto-generated method stub
		for(Libro l : setLibri) {
			if(l.getIsbn().equals(elem.getIsbn())) {
				l.setAutore(elem.getAutore());
				l.setNumeroPagine(elem.getNumeroPagine());
				l.setTitolo(elem.getTitolo());
				return true;
			}
		}
		return false;
	}

	@Override
	public TreeSet<Libro> trovaTutti() {
		
		return setLibri;
	}

	@Override
	public Libro trovaSingolo(String isbn) {
		for(Libro l : setLibri) {
			if(l.getIsbn().equals(isbn)) {
				return l;
			}
		}
		return null;
	}
	
	

}
