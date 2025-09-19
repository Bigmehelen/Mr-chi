package com.DrugDispenser.utils;

import com.DrugDispenser.DTOs.requests.AddPharmacistRequest;
import com.DrugDispenser.DTOs.responses.AddPharmacistResponse;
import com.DrugDispenser.data.models.Pharmacist;

public class PharmacistMapper {
    public static Pharmacist mapToModel(AddPharmacistRequest request){
        Pharmacist pharmacist = new Pharmacist();
        pharmacist.setName(request.getName());
        pharmacist.setPhonenumber(request.getName());
        pharmacist.setPassword(request.getPassword());
        return pharmacist;
    }

    public static AddPharmacistResponse mapToResponse(Pharmacist entity){
        AddPharmacistResponse response = new AddPharmacistResponse();
        response.setId(entity.getId());
        response.setName(entity.getName());
        response.setPassword(entity.getPassword());
        response.setPhoneNumber(entity.getPhonenumber());
        response.setPrescription(entity.getPrescription());
        response.setDispenseDate(entity.getDispenseDate());
        return response;
    }
}
