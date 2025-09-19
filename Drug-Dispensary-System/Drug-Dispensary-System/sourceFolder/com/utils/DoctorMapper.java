package com.DrugDispenser.utils;

import com.DrugDispenser.DTOs.requests.AddDoctorRequest;
import com.DrugDispenser.DTOs.responses.AddDoctorResponse;
import com.DrugDispenser.data.models.Doctor;

public class DoctorMapper {
    public static Doctor mapToModel(AddDoctorRequest request){
        Doctor doctor = new Doctor();
        doctor.setName(request.getName());
        doctor.setPassword(request.getPassword());
        doctor.setPhonenumber(request.getPhoneNumber());
        doctor.setSpecialty(request.getSpeciality());
        return doctor;
    }

    public static AddDoctorResponse mapToResponse(Doctor entity){
        AddDoctorResponse addDoctorResponse = new AddDoctorResponse();
        addDoctorResponse.setId(entity.getId());
        addDoctorResponse.setName(entity.getName());
        addDoctorResponse.setPassword(entity.getPassword());
        addDoctorResponse.setPhonenumber(entity.getPhonenumber());
        addDoctorResponse.setSpeciality(entity.getSpecialty());
        addDoctorResponse.setDiagnosis(entity.getDiagnosis());
        return addDoctorResponse;
    }
}
