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
				+ "Id Carta: "+this.cardId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((booksList == null) ? 0 : booksList.hashCode());
		result = prime * result + cardId;
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
		User other = (User) obj;
		if (booksList == null) {
			if (other.booksList != null)
				return false;
		} else if (!booksList.equals(other.booksList))
			return false;
		if (cardId != other.cardId)
			return false;
		return true;
	}
	
	
	

}
