package com.design.software.Assignment2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="staff")
public class Staff {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="idstaff", nullable=false)
	private int idStaff;
	
	@Column(name="firstName", nullable=false)
	private String firstName;
	
	@Column(name="lastName", nullable=false)
	private String lastname;
	
	@Column(name="username", nullable=false)
	private String userName;
	
	@Column(name="password", nullable=false)
	private String password;

	public Staff(int idStaff, String firstName, String lastname, String userName, String password) {
		super();
		this.idStaff = idStaff;
		this.firstName = firstName;
		this.lastname = lastname;
		this.userName = userName;
		this.password = password;
	}
	
	public Staff() {
		
	}

	public int getIdStaff() {
		return idStaff;
	}

	public void setIdStaff(int idStaff) {
		this.idStaff = idStaff;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
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

}
