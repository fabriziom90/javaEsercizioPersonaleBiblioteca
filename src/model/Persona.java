package model;

import java.util.Objects;

public abstract class Persona {
	private int id;
	private String nome;
	private String cognome;
	private String email;

	public abstract String getRuolo();
	
	public Persona(int id, String nome, String cognome, String email) {
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", email=" + email + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cognome, email, id, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(cognome, other.cognome) && Objects.equals(email, other.email) && id == other.id
				&& Objects.equals(nome, other.nome);
	}

	
}
