package Com.pharmacy.Utils;

import Com.pharmacy.DTOs.request.AddDrugRequest;
import Com.pharmacy.DTOs.response.AddDrugResponse;
import Com.pharmacy.Data.Models.Drug;

public class DrugMapper {
    public static Drug mapToModel(AddDrugRequest request){
        Drug requestDrug = new Drug();
        requestDrug.setName(request.getName());
        requestDrug.setType(request.getType());
        requestDrug.setExpiryDate(request.getExpiryDate());
        requestDrug.setManufactureDate(request.getManufactureDate());
        requestDrug.setCategory(request.getCategory());
        return requestDrug;
    }

    public static AddDrugResponse mapToResponse(Drug entity){
        AddDrugResponse drugResponse = new AddDrugResponse();
        drugResponse.setId(entity.getId());
        drugResponse.setName(entity.getName());
        drugResponse.setCategory(entity.getCategory());
        drugResponse.setExpiryDate(entity.getExpiryDate());
        drugResponse.setManufactureDate(entity.getManufactureDate());
        drugResponse.setExpiryDate(entity.getExpiryDate());
        return drugResponse;
    }
}
