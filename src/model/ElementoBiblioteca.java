package model;

import java.util.Objects;

public abstract class ElementoBiblioteca {
	private int id;
	private String titolo;
	
	public ElementoBiblioteca(int id, String titolo) {
		this.id = id;
		this.titolo = titolo;
	}
	
	public abstract String getDescrizione();
	
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

	@Override
	public int hashCode() {
		return Objects.hash(id, titolo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ElementoBiblioteca other = (ElementoBiblioteca) obj;
		return id == other.id && Objects.equals(titolo, other.titolo);
	}
	
}
