package com.DrugDispenser.DTOs.responses;

import java.time.LocalDate;

public class AddPharmacistResponse {
    private String id;
    private String name;
    private String phoneNumber;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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
