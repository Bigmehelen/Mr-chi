package com.DrugDispenser.data.repositories;

import com.DrugDispenser.data.models.Doctor;

public class DoctorsMock implements DoctorsInterface {
    private boolean wasDeleteCalled;
    private boolean doctorsMockWasCalled;
    private Doctor doctorToReturn;

    @Override
    public Doctor save(Doctor doctor) {
        doctorsMockWasCalled = true;
        return doctorToReturn;
    }

    @Override
    public Doctor findById(String id) {
        return doctorToReturn;
    }

    @Override
    public Doctor deleteById(String id) {
        doctorsMockWasCalled = true;
        return doctorToReturn;
    }

    @Override
    public Doctor existById(Doctor doctor) {
        return null;
    }

    public boolean wasSaveCalled() {
        return doctorsMockWasCalled;
    }

    public void setDoctorToReturn(Doctor doctor) {
        this.doctorToReturn = doctor;
    }

    public boolean wasDeleteCalled() {
        return doctorsMockWasCalled;
    }


}