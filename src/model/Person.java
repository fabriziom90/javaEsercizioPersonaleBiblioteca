package model;

public abstract class Person {
	
	

	private static int nextId;
	private int id;
	private String name;
	private String surname;
	private String email;
	
	public Person(String name, String surname, String email) {
		// TODO Auto-generated constructor stub
		this.id = nextId++;
		this.name = name;
		this.surname = surname;
		this.email = email;
	}
	
	public static int getNextId() {
		return nextId;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public abstract String description();
}
