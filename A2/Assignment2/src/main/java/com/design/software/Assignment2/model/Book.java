package com.design.software.Assignment2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="book")
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="idBook", nullable=false)
	private int idBook;
	
	@Column(name="name", nullable=false)
	private String name;
	
	@Column(name="author", nullable=false)
	private String author;
	
	@Column(name="genre", nullable=false)
	private String genre;
	
	@Column(name="availability", nullable=false)
	private String availability;
	

	public Book(int bookID, String name, String author, String genre, String availability) {
		this.idBook = bookID;
		this.name = name;
		this.author = author;
		this.genre = genre;
		this.availability = availability;
	}
	
	public Book() {
		
	}
	

	public int getBookID() {
		return idBook;
	}

	public void setBookID(int bookID) {
		this.idBook = bookID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	}

}
