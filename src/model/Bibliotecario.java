package model;

import java.util.Objects;

public class Bibliotecario extends Persona {
	private SezioneCompetenza sezione;
	
	public Bibliotecario(int id, String nome, String cognome, String email, SezioneCompetenza sezione) {
		super(id, nome, cognome, email);
		this.sezione = sezione;
	}
	
	
	
	public SezioneCompetenza getSezione() {
		return sezione;
	}



	public void setSezione(SezioneCompetenza sezione) {
		this.sezione = sezione;
	}



	@Override
	public String getRuolo() {
		// TODO Auto-generated method stub
		return "Bibliotecario";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(sezione);
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
		Bibliotecario other = (Bibliotecario) obj;
		return sezione == other.sezione;
	}
	
	

}
