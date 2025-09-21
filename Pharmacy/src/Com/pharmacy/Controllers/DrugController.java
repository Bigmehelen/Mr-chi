package Com.pharmacy.Controllers;

import Com.pharmacy.DTOs.request.AddDrugRequest;
import Com.pharmacy.DTOs.response.AddDrugResponse;
import Com.pharmacy.Data.Repository.Drugs;
import Com.pharmacy.Services.DrugServices;

public class DrugController {
    private Drugs drugs;
    private DrugServices drugServices = new DrugServices(drugs);

    public AddDrugResponse addDrug(AddDrugRequest request){
        try {
            return drugServices.addDrug(request);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        throw new RuntimeException();
    }

}
