package dao;

import java.util.TreeSet;

import interfaces.Archivio;
import model.Rivista;

public class RivistaDao implements Archivio<Rivista, Integer>{
	TreeSet<Rivista> setRiviste = new TreeSet<Rivista>(); 
	
	@Override
	public void aggiungi(Rivista elem) {
		// TODO Auto-generated method stub
		setRiviste.add(elem);
	}

	@Override
	public boolean rimuovi(Rivista elem) {
		// TODO Auto-generated method stub
		for(Rivista r : setRiviste) {
			if(r.getTitolo().equals(elem.getTitolo())) {
				setRiviste.remove(elem);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean aggiorna(Rivista elem) {
		// TODO Auto-generated method stub
		for(Rivista r : setRiviste) {
			if(r.getTitolo().equals(elem.getTitolo())) {
				r.setNumero(elem.getNumero());
				r.setPeriodicita(elem.getPeriodicita());
				r.setTitolo(elem.getTitolo());
				return true;
			}
		}
		return false;
	}

	@Override
	public TreeSet<Rivista> trovaTutti() {
		
		return setRiviste;
	}

	@Override
	public Rivista trovaSingolo(String titolo) {
		for(Rivista r : setRiviste) {
			if(r.getTitolo().equals(titolo)) {
				return r;
			}
		}
		return null;
	}
}
