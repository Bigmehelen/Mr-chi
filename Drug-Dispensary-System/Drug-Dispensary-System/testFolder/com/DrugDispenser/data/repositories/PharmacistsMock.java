package com.DrugDispenser.data.repositories;

import com.DrugDispenser.data.models.Pharmacist;

public class PharmacistsMock implements Pharmacists {
    private boolean wasDeleteCalled;
    private boolean pharmacistsMockWasCalled;
    private Pharmacist pharmacistToReturn;

    @Override
    public Pharmacist save(Pharmacist pharmacist) {
        pharmacistsMockWasCalled = true;
        return pharmacistToReturn;
    }

    @Override
    public Pharmacist findById(String id) {
        return pharmacistToReturn;
    }

    @Override
    public Pharmacist deleteById(String id) {
        pharmacistsMockWasCalled = true;
        return pharmacistToReturn;
    }

    @Override
    public Pharmacist existById(Pharmacist pharmacist) {
        return null;
    }

    public boolean wasSaveCalled() {
        return pharmacistsMockWasCalled;
    }

    public void setPharmacistToReturn(Pharmacist pharmacist) {
        this.pharmacistToReturn = pharmacist;
    }

    public boolean wasDeleteCalled() {
        return pharmacistsMockWasCalled;
    }
}