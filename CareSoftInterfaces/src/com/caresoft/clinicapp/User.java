package com.caresoft.clinicapp;

public class User {
    protected Integer id;
    protected int pin;
    
    public User(int i) {
    	id=i;
    }
    // TO DO: Getters and setters
	public int getId() {
		return id;
	}
	public int getPin() {
		return pin;
	}
	public void setId(int i) {
		id=i;
	}
	public void setPin(int pi) {
		pin=pi;
	}

}

