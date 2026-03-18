package model;

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
	
	
}
