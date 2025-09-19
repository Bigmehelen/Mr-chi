package com.DrugDispenser.services;

import com.DrugDispenser.DTOs.requests.AddPharmacistRequest;
import com.DrugDispenser.DTOs.responses.AddDoctorResponse;
import com.DrugDispenser.DTOs.requests.AddDoctorRequest;
import com.DrugDispenser.DTOs.responses.AddPharmacistResponse;
import com.DrugDispenser.data.models.Doctor;
import com.DrugDispenser.data.models.Pharmacist;
import com.DrugDispenser.data.repositories.DoctorsMock;
import com.DrugDispenser.data.repositories.PharmacistsMock;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AdminServicesTest {
    DoctorsMock doctorsMock;
    AdminServices adminServices;
    PharmacistsMock pharmacistsMock;

    @BeforeEach
    void setUp() {
        doctorsMock = new DoctorsMock();
        pharmacistsMock = new PharmacistsMock();
        adminServices = new AdminServices(doctorsMock, pharmacistsMock);
    }
    @Test
    public void adminCanAddDoctor() {
        AddDoctorRequest addDoctorRequest = new AddDoctorRequest();
        addDoctorRequest.setName("doctor");
        AddDoctorResponse saved = adminServices.registerDoctor(addDoctorRequest);
        assertTrue(doctorsMock.wasSaveCalled());
    }

    @Test
    public void adminCanFindDoctorByIdTest() {
        AddDoctorRequest addDoctorRequest = new AddDoctorRequest();
        addDoctorRequest.setName("doctor");
        AddDoctorResponse saved = adminServices.registerDoctor(addDoctorRequest);
        assertTrue(doctorsMock.wasSaveCalled());

        Doctor doctor = new Doctor();
        doctor.setName(saved.getName());
        doctorsMock.setDoctorToReturn(doctor);
        assertEquals("doctor", adminServices.findDoctorById(saved.getId()).getName());
    }

    @Test
    public void adminCanDeleteDoctorTest() {
        AddDoctorRequest addDoctorRequest = new AddDoctorRequest();
        addDoctorRequest.setName("doctor");
        AddDoctorResponse saved = adminServices.registerDoctor(addDoctorRequest);
        assertTrue(doctorsMock.wasSaveCalled());

        Doctor doctor = new Doctor();
        doctor.setName(saved.getName());
        doctorsMock.setDoctorToReturn(doctor);
        assertEquals("doctor", adminServices.deleteDoctorById(saved.getId()).getName());
        assertTrue(doctorsMock.wasDeleteCalled());
    }

    @Test
    public void adminCanAddPharmacistTest() {
        AddPharmacistRequest addPharmacistRequest = new AddPharmacistRequest();
        addPharmacistRequest.setName("pharmacist");
        AddPharmacistResponse saved = adminServices.registerPharmacist(addPharmacistRequest);
        assertTrue(pharmacistsMock.wasSaveCalled());
    }

    @Test
    public void adminCanFindPharmacistByIdTest() {
        AddPharmacistRequest addPharmacistRequest = new AddPharmacistRequest();
        addPharmacistRequest.setName("pharmacist");
        AddPharmacistResponse saved = adminServices.registerPharmacist(addPharmacistRequest);
        assertTrue(pharmacistsMock.wasSaveCalled());

        Pharmacist pharmacist = new Pharmacist();
        pharmacist.setName(saved.getName());
        pharmacistsMock.setPharmacistToReturn(pharmacist);
        assertEquals("pharmacist", adminServices.findPharmacyById(saved.getId()).getName());
    }

    @Test
    public void adminCanDeletePharmacistTest() {
        AddPharmacistRequest addPharmacistRequest = new AddPharmacistRequest();
        addPharmacistRequest.setName("pharmacist");
        AddPharmacistResponse saved = adminServices.registerPharmacist(addPharmacistRequest);
        assertTrue(pharmacistsMock.wasSaveCalled());

        Pharmacist pharmacist = new Pharmacist();
        pharmacist.setName(saved.getName());
        pharmacistsMock.setPharmacistToReturn(pharmacist);
        assertEquals("pharmacist", adminServices.deletePharmacyById(saved.getId()).getName());
    }
}