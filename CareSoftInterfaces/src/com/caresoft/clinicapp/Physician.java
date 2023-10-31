package com.caresoft.clinicapp;
import java.util.ArrayList;
import java.util.Date;
public class Physician extends User implements HIPAACompliantUser   {
//... imports class definition...
    
    // Inside class:    
    private ArrayList<String> patientNotes;
	
    public Physician(int id) {
    	super(id);
    }
    // TO DO: Implement HIPAACompliantUser!
	
    public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
            "Datetime Submitted: %s \n", date);
        report += String.format("Reported By ID: %s\n", this.id);
        report += String.format("Patient Name: %s\n", patientName);
        report += String.format("Notes: %s \n", notes);
        this.patientNotes.add(report);
    }

	@Override
	public boolean assignPin(int pin) {
		String p= pin+"";
		if(p.length()==4) {
			this.setPin(pin);
			return true;
		}
		return false;
	}

	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) {
		if(confirmedAuthID==this.getPin()) {
			return true;
		}
		return false;
	}
	
	public ArrayList<String> getPatientNotes(){
		return patientNotes;
	}
	
    // TO DO: Setters & Getters

}
