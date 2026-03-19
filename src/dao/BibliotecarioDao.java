package dao;

import java.util.TreeSet;

import interfaces.Archivio;
import model.Bibliotecario;

public class BibliotecarioDao implements Archivio<Bibliotecario, Integer> {
	TreeSet<Bibliotecario> setBibliotecari = new TreeSet<Bibliotecario>(); 
	
	@Override
	public void aggiungi(Bibliotecario elem) {
		// TODO Auto-generated method stub
		setBibliotecari.add(elem);
	}

	@Override
	public boolean rimuovi(Bibliotecario elem) {
		// TODO Auto-generated method stub
		for(Bibliotecario b : setBibliotecari) {
			if(b.getNome().equals(elem.getNome()) && b.getCognome().equals(elem.getCognome())) {
				setBibliotecari.remove(elem);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean aggiorna(Bibliotecario elem) {
		// TODO Auto-generated method stub
		for(Bibliotecario b : setBibliotecari) {
			if(b.getNome().equals(elem.getNome()) && b.getCognome().equals(elem.getCognome())) {
				b.setNome(elem.getNome());
				b.setCognome(elem.getCognome());
				b.setEmail(elem.getEmail());
				b.setSezione(elem.getSezione());
				return true;
			}
		}
		return false;
	}

	@Override
	public TreeSet<Bibliotecario> trovaTutti() {
		
		return setBibliotecari;
	}

	@Override
	public Bibliotecario trovaSingolo(String cognome) {
		for(Bibliotecario b : setBibliotecari) {
			if(b.getNome().equals(cognome)) {
				return b;
			}
		}
		return null;
	}
}
