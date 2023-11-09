package com.Login;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Register
{
	@Id
	@Column(name="Id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(name="Name",length =100)
	private String name;
	
	@Column(name="Email",length=100)
	private String Email;
	@Column
	private String pass;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public Register( int id,String name, String email, String pass) {
		super();
		this.id=id;
		
		this.name = name;
		Email = email;
		this.pass = pass;
	}
	public Register() {
		super();
		
	}
	
}