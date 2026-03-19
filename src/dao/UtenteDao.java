package dao;

import java.util.TreeSet;

import interfaces.Archivio;
import model.Utente;

public class UtenteDao implements Archivio<Utente, Integer> {
	TreeSet<Utente> setUtenti = new TreeSet<Utente>(); 
	
	@Override
	public void aggiungi(Utente elem) {
		// TODO Auto-generated method stub
		setUtenti.add(elem);
	}

	@Override
	public boolean rimuovi(Utente elem) {
		// TODO Auto-generated method stub
		for(Utente u : setUtenti) {
			if(u.getCodiceUtente().equals(elem.getCodiceUtente())) {
				setUtenti.remove(elem);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean aggiorna(Utente elem) {
		// TODO Auto-generated method stub
		for(Utente u : setUtenti) {
			if(u.getCodiceUtente().equals(elem.getCodiceUtente())) {
				u.setNome(elem.getNome());
				u.setCognome(elem.getCognome());
				u.setEmail(elem.getEmail());
				return true;
			}
		}
		return false;
	}

	@Override
	public TreeSet<Utente> trovaTutti() {
		
		return setUtenti;
	}

	@Override
	public Utente trovaSingolo(String codiceUtente) {
		for(Utente u : setUtenti) {
			if(u.getCodiceUtente().equals(codiceUtente)) {
				return u;
			}
		}
		return null;
	}

}
