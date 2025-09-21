package Com.pharmacy.Services;

import Com.pharmacy.DTOs.request.AddDrugRequest;
import Com.pharmacy.DTOs.response.AddDrugResponse;
import Com.pharmacy.Data.Repository.Drugs;

public interface DrugServicesImpl {
    AddDrugResponse addDrug(AddDrugRequest request);
}
