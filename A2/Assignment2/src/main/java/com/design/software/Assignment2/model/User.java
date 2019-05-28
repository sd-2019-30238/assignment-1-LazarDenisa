package com.design.software.Assignment2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity(name="user")
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="idUser", nullable=false)
	private int idUser;
	
	@Column(name="firstName", nullable=false)
	private String firstName;
	
	@Column(name="lastName", nullable=false)
	private String lastName;
	
	@Column(name="username", nullable=false)
	private String userName;
	
	@Column(name="password", nullable=false)
	private String password;
	
	@Column(name="choosenPayment", nullable=false)
	private String chosenPayment;

	public User(int idUser, String firstName, String lastName, String userName, String password, String chosenPayment) {
		super();
		this.idUser = idUser;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
		this.chosenPayment = chosenPayment;
	}
	
	public User() {
		
	}

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getChosenPayment() {
		return chosenPayment;
	}

	public void setChosenPayment(String chosenPayment) {
		this.chosenPayment = chosenPayment;
	}

}
