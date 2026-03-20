package model;

import java.util.ArrayList;
import java.util.List;

public class User extends Person{
	private int cardId;
	private List<Book> booksList = new ArrayList<Book>();
	public User(String name, String surname, String email, int cardId) {
		super(name, surname, email);
		this.cardId = cardId;
		// TODO Auto-generated constructor stub
	}
	public int getCardId() {
		return cardId;
	}
	public void setCardId(int cardId) {
		this.cardId = cardId;
	}
	public List<Book> getBooksList() {
		return booksList;
	}
	public void setBooksList(List<Book> booksList) {
		this.booksList = booksList;
	}
	@Override
	public String description() {
		// TODO Auto-generated method stub
		return "Utente: \n"
				+ "Nome: "+super.getName()+"\n"
				+ "Cognome: "+super.getSurname()+"\n"
				+ "Email: "+super.getEmail()+"\n"
				+ "Id Carta: "+this.cardId+"\n\n";
	}
	
	
	

}
