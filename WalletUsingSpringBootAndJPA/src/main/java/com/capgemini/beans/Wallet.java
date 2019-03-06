package com.capgemini.beans;

import java.math.BigDecimal;

import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;

@Embeddable
public class Wallet {
	
	@PositiveOrZero
	@NotNull
	private BigDecimal balance;
	
	

	public Wallet() {
		super();
	}

	public Wallet(BigDecimal balance) {
		super();
		this.balance = balance;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return " balance:" + balance + "\n";
	}
	

}