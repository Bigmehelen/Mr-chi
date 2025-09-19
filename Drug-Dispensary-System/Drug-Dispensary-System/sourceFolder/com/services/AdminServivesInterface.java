package com.DrugDispenser.services;

import com.DrugDispenser.DTOs.requests.AddDoctorRequest;
import com.DrugDispenser.DTOs.requests.AddPharmacistRequest;
import com.DrugDispenser.DTOs.responses.AddDoctorResponse;
import com.DrugDispenser.DTOs.responses.AddPharmacistResponse;

public interface AdminServivesInterface {
    AddDoctorResponse registerDoctor(AddDoctorRequest addDoctorRequest);
    AddPharmacistResponse registerPharmacist(AddPharmacistRequest addPharmacistRequest);
}
