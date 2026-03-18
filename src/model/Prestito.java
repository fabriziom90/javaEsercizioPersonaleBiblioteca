package model;

import java.util.Date;
import java.util.Objects;

public class Prestito {
	
	private Utente utente;
	private ElementoBiblioteca elem;
	private Date dataInizio;
	private Date dataTermine;
	
	public Prestito(Utente utente, ElementoBiblioteca elem, Date dataInizio, Date dataFine) {
		this.utente = utente;
		this.elem = elem;
		this.dataInizio = dataInizio;
		dataTermine = dataFine;
		
	}

	public Utente getUtente() {
		return utente;
	}

	public void setUtente(Utente utente) {
		this.utente = utente;
	}

	public ElementoBiblioteca getElem() {
		return elem;
	}

	public void setElem(ElementoBiblioteca elem) {
		this.elem = elem;
	}

	public Date getDataInizio() {
		return dataInizio;
	}

	public void setDataInizio(Date dataInizio) {
		this.dataInizio = dataInizio;
	}

	public Date getDataTermine() {
		return dataTermine;
	}

	public void setDataTermine(Date dataTermine) {
		this.dataTermine = dataTermine;
	}

	@Override
	public String toString() {
		return "Prestito [utente=" + utente + ", elem=" + elem + ", dataInizio=" + dataInizio + ", dataTermine="
				+ dataTermine + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(dataInizio, dataTermine, elem, utente);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Prestito other = (Prestito) obj;
		return Objects.equals(dataInizio, other.dataInizio) && Objects.equals(dataTermine, other.dataTermine)
				&& Objects.equals(elem, other.elem) && Objects.equals(utente, other.utente);
	}
	
	

}
