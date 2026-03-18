package model;

import java.util.Objects;

public class Libro extends ElementoBiblioteca{
	private String autore;
	private int numeroPagine;
	private String isbn;
	
	public Libro(int id, String titolo, String autore, int numeroPagine, String isbn) {
		super(id, titolo);
		this.autore = autore;
		this.numeroPagine = numeroPagine;
		this.isbn = isbn;
		// TODO Auto-generated constructor stub
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public int getNumeroPagine() {
		return numeroPagine;
	}

	public void setNumeroPagine(int numeroPagine) {
		this.numeroPagine = numeroPagine;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		return getDescrizione();
	}

	@Override
	public String getDescrizione() {
		// TODO Auto-generated method stub
		return "Libro [id="+super.getId()+", titolo="+super.getTitolo()+", autore=" + autore + ", numeroPagine=" + numeroPagine + ", isbn=" + isbn + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(autore, isbn, numeroPagine);
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
		Libro other = (Libro) obj;
		return Objects.equals(isbn, other.isbn);
	}
	
	
	
	
}
