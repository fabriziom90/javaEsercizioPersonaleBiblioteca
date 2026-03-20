package model;

public class Librarian extends Person {
	private String librarianCode;
	
	public Librarian(String name, String surname, String email, String librarianCode) {
		super(name, surname, email);
		this.librarianCode = librarianCode;
	}

	
	
	public String getLibrarianCode() {
		return librarianCode;
	}



	public void setLibrarianCode(String librarianCode) {
		this.librarianCode = librarianCode;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((librarianCode == null) ? 0 : librarianCode.hashCode());
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
		Librarian other = (Librarian) obj;
		if (librarianCode == null) {
			if (other.librarianCode != null)
				return false;
		} else if (!librarianCode.equals(other.librarianCode))
			return false;
		return true;
	}



	@Override
	public String description() {
		// TODO Auto-generated method stub
		return "Bibliotecario: \n"
		+ "Nome: "+super.getName()+"\n"
		+ "Cognome: "+super.getSurname()+"\n"
		+ "Email: "+super.getEmail()+"\n"
		+ "Codice bibliotecario: "+this.librarianCode+"\n\n";
	}
	
	

}
