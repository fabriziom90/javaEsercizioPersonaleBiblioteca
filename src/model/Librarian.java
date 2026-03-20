package model;

public class Librarian extends Person {
	private String librarianCode;
	
	public Librarian(String name, String surname, String email) {
		super(name, surname, email);
		// TODO Auto-generated constructor stub
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
