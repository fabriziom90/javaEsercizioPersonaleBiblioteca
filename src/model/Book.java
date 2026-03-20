package model;

public class Book {
	private static int nextId;
	private int id;
	private String title;
	private String author;
	private String isbn;
	private int year;
	private boolean available;
	
	public Book(String title, String author, String isbn, int year, boolean available) {
		this.id = nextId++;
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.year = year;
		this.available = available;
	}

	public static int getNextId() {
		return nextId;
	}

	public static void setNextId(int nextId) {
		Book.nextId = nextId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		
		if (isbn == null) {
			if (other.isbn != null)
				return false;
		} else if (!isbn.equals(other.isbn))
			return false;
		
		return true;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", isbn=" + isbn + ", year=" + year
				+ ", available=" + available + "]";
	}

	
	
}
