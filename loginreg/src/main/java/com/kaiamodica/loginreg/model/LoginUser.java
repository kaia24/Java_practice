package com.kaiamodica.loginreg.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class LoginUser {
	@NotEmpty(message="Email is needed")
	@Email(message="Please put in a valid email ")
	private String email;
	
	@NotEmpty(message="PAssword needed")
	@Size(min=8, max=128, message="password needs to be between 8 ans 128")
	private String password;
	
	public LoginUser() {
		
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}