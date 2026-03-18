package model;

import java.util.Objects;

public class Rivista extends ElementoBiblioteca{
	private int numero;
	private Periodicita periodicita;
	
	public Rivista(int id, String titolo, int numero, Periodicita periodicita) {
		super(id, titolo);
		this.numero = numero;
		this.periodicita = periodicita;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Periodicita getPeriodicita() {
		return periodicita;
	}

	public void setPeriodicita(Periodicita periodicita) {
		this.periodicita = periodicita;
	}

	@Override
	public String toString() {
		return getDescrizione();
	}
	
	@Override
	public String getDescrizione() {
		return "Rivista [id="+super.getId()+", titolo="+super.getTitolo()+",numero=" + numero + ", periodicita=" + periodicita + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(numero, periodicita);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rivista other = (Rivista) obj;
		return numero == other.numero && periodicita == other.periodicita;
	}
	
	
}
