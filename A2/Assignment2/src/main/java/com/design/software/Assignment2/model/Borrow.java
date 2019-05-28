package com.design.software.Assignment2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="borrow")
public class Borrow {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="idBorrow", nullable=false)
	private int idBorrow;
	
	@Column(name="idBook", nullable=false)
	private int idBook;
	
	@Column(name="idUser", nullable=false)
	private int idUser;

	public Borrow(int idBorrow, int idBook, int idUser) {
		super();
		this.idBorrow = idBorrow;
		this.idBook = idBook;
		this.idUser = idUser;
	}
	
	public Borrow() {
		
	}

	public int getIdBorrow() {
		return idBorrow;
	}

	public void setIdBorrow(int idBorrow) {
		this.idBorrow = idBorrow;
	}

	public int getIdBook() {
		return idBook;
	}

	public void setIdBook(int idBook) {
		this.idBook = idBook;
	}

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

}
