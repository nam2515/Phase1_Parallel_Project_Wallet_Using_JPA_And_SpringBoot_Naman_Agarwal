package com.capgemini.beans;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import org.springframework.lang.NonNull;

@Entity
@Table(name="Customer")
public class Customer {
	
	@NotEmpty(message="Can't be null")
	@Pattern(regexp="[a-z,A-z ]+")
	private String name;
	
	@Id
	@NonNull
	@Pattern(regexp="[0-9]{10}")
	private String mobileno;
	
	@Embedded
	@NonNull
	private Wallet wallet;
	
	
	public Customer() {
		super();
	}
	public Customer(String name, String mobileno, Wallet wallet) {
		super();
		this.name = name;
		this.mobileno = mobileno;
		this.wallet = wallet;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public Wallet getWallet() {
		return wallet;
	}
	public void setWallet(Wallet wallet) {
		this.wallet = wallet;
	}
}