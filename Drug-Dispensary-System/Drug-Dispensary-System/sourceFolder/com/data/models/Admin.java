package com.DrugDispenser.data.models;

public class Admin {

    private Doctor doctor;
    private Pharmacist pharmacist;
    private Medication medication;

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setPharmacist(Pharmacist pharmacist) {
        this.pharmacist = pharmacist;
    }

    public Pharmacist getPharmacist() {
        return pharmacist;
    }

}



