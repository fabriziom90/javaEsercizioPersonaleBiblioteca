package model;

public abstract class ElementoBiblioteca {
	private int id;
	private String titolo;
	
	public ElementoBiblioteca(int id, String titolo) {
		this.id = id;
		this.titolo = titolo;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	
}
