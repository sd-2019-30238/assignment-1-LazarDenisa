package com.design.software.Assignment2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="waiting_list")
public class Waiting {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="idwaiting_list", nullable=false)
	private int idWaiting;
	
	@Column(name="idUser", nullable=false)
	private int idUser;
	
	@Column(name="idBook", nullable=false)
	private int idBook;

	public Waiting(int idWaiting, int idUser, int idBook) {
		super();
		this.idWaiting = idWaiting;
		this.idUser = idUser;
		this.idBook = idBook;
	}
	
	public Waiting() {
		
	}

	public int getIdWaiting() {
		return idWaiting;
	}

	public void setIdWaiting(int idWaiting) {
		this.idWaiting = idWaiting;
	}

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public int getIdBook() {
		return idBook;
	}

	public void setIdBook(int idBook) {
		this.idBook = idBook;
	}

}
