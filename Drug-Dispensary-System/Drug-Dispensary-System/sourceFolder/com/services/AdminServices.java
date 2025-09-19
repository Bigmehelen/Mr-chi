package com.DrugDispenser.services;

import com.DrugDispenser.DTOs.requests.AddDoctorRequest;
import com.DrugDispenser.DTOs.requests.AddPharmacistRequest;
import com.DrugDispenser.DTOs.responses.AddDoctorResponse;
import com.DrugDispenser.DTOs.responses.AddPharmacistResponse;
import com.DrugDispenser.data.models.Doctor;
import com.DrugDispenser.data.models.Pharmacist;
import com.DrugDispenser.data.repositories.DoctorsInterface;
import com.DrugDispenser.data.repositories.Pharmacists;
import com.DrugDispenser.utils.DoctorMapper;
import com.DrugDispenser.utils.PharmacistMapper;

public class AdminServices implements AdminServivesInterface{
    private DoctorsInterface doctors;
    private Pharmacists pharmacists;

    public AdminServices(DoctorsInterface doctors , Pharmacists pharmacists) {
        this.doctors = doctors;
        this.pharmacists = pharmacists;
    }

    @Override
    public AddDoctorResponse registerDoctor(AddDoctorRequest addDoctorRequest) {
        Doctor doctor = DoctorMapper.mapToModel(addDoctorRequest);
        doctors.save(doctor);
        return DoctorMapper.mapToResponse(doctor);
    }

    @Override
    public AddPharmacistResponse registerPharmacist (AddPharmacistRequest addPharmacistRequest) {
        Pharmacist pharmacist = PharmacistMapper.mapToModel(addPharmacistRequest);
        pharmacists.save(pharmacist);
        return PharmacistMapper.mapToResponse(pharmacist);
    }

    public AddDoctorResponse findDoctorById(String id) {
        return DoctorMapper.mapToResponse(doctors.findById(id));
    }

    public AddPharmacistResponse findPharmacyById(String id) {
        return PharmacistMapper.mapToResponse(pharmacists.findById(id));
    }

    public AddDoctorResponse deleteDoctorById(String id) {
        return DoctorMapper.mapToResponse(doctors.deleteById(id));
    }

    public AddPharmacistResponse deletePharmacyById(String id) {
        return PharmacistMapper.mapToResponse(pharmacists.findById(id));
    }


}
