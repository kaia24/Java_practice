package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class AdminUser extends User implements HIPAACompliantAdmin ,HIPAACompliantUser{
//... imports class definition...
    
    // Inside class:
    private Integer employeeID;
    private String role;
    private ArrayList<String> securityIncidents;
    
    public AdminUser(int id,String r) {
    	super(id);
    	role=r;
    	employeeID=id;
    	
    }
    // TO DO: Implement HIPAACompliantUser!
    // TO DO: Implement HIPAACompliantAdmin!
    
    public void newIncident(String notes) {
        String report = String.format(
            "Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", 
            new Date(), this.id, notes
        );
        securityIncidents.add(report);
    }
    
    public void authIncident() {
        String report = String.format(
            "Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n", 
            new Date(), this.id, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER"
        );
        securityIncidents.add(report);
    }
    
    public Integer getEmployeeID() {
    	return employeeID;
    }
    public String getRole() {
    	return role;
    }
    public void setRole(String rol) {
    	role=rol;
    }
    public void setEmployeeID(int id) {
    	employeeID=id;
    }
    // TO DO: Setters & Getters

	@Override
	public boolean assignPin(int pin) {
		if(pin<=6) {
		this.setPin(pin);
		return true;
		}
		return false;
	}

	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) {
		if(confirmedAuthID==employeeID) {
			return true;
		}
		
		return false;
	}
	@Override
	public ArrayList<String> reportSecurityIncidents(){
		
		return securityIncidents;
	}

}
