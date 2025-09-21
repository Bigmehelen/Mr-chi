package Com.pharmacy.Services;

import Com.pharmacy.DTOs.request.AddDrugRequest;
import Com.pharmacy.DTOs.response.AddDrugResponse;
import Com.pharmacy.Data.Models.Drug;
import Com.pharmacy.Data.Repository.Drugs;
import Com.pharmacy.Utils.DrugMapper;

import static Com.pharmacy.Utils.DrugMapper.mapToModel;

public class DrugServices implements DrugServicesImpl{
    private Drugs drugs;

    public DrugServices(Drugs drugs){
        this.drugs = drugs;
    }

    @Override
    public AddDrugResponse addDrug(AddDrugRequest request) {
        Drug drugMapper = mapToModel(request);
        Drug saved = drugs.save(drugMapper);
        return DrugMapper.mapToResponse(saved);
    }


}
