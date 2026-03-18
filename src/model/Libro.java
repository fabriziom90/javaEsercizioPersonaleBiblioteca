package model;

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
		return "Libro [id="+super.getId()+", titolo="+super.getTitolo()+", autore=" + autore + ", numeroPagine=" + numeroPagine + ", isbn=" + isbn + "]";
	}
	
	
}
