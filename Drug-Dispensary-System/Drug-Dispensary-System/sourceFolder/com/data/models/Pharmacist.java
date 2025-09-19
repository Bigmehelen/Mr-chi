package com.DrugDispenser.data.models;

import java.time.LocalDate;

public class Pharmacist {
    private String id;
    private String name;
    private String phonenumber;
    private String password;
    private String prescription;
    private LocalDate dispenseDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPrescription() {
        return prescription;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }

    public LocalDate getDispenseDate() {
        return dispenseDate;
    }

    public void setDispenseDate(LocalDate dispenseDate) {
        this.dispenseDate = dispenseDate;
    }
}
