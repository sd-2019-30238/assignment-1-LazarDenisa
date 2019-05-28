package com.design.software.Assignment2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="payment_plan")
public class PaymentPlan {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="typePP", nullable=false)
	private int type; // chosenPlan in User class 1- weekly, 2-monthly, 3-yearly
	
	@Column(name="amount", nullable=false)
	private int amount;

	public PaymentPlan(int type, int amount) {
		super();
		this.type = type;
		this.amount = amount;
	}
	
	public PaymentPlan() {
		
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

}
