package model;

import java.util.Objects;

public class Utente extends Persona{
	private String codiceUtente;
	
	public Utente(int id, String nome, String cognome, String email) {
		super(id, nome, cognome, email);
		this.codiceUtente = codiceUtente;
	}

	public String getCodiceUtente() {
		return codiceUtente;
	}

	public void setCodiceUtente(String codiceUtente) {
		this.codiceUtente = codiceUtente;
	}

	@Override
	public String getRuolo() {
		return "Utente";
	}

	@Override
	public String toString() {
		return "Utente [id="+super.getId()+", nome="+super.getNome()+", cognome="+super.getCognome()+", email="+super.getEmail()+", codiceUtente=" + codiceUtente + "]";
	}
	
	
	
	
}
