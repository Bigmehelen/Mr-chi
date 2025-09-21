package Com.pharmacy.Data.Repository;

import Com.pharmacy.Data.Models.Drug;

import java.util.HashMap;
import java.util.Map;

public class Drugs {
    private Long assigner;
    private Map<Integer,Drug> drugsStore = new HashMap<>();

    public Long count() {
        return (long) drugsStore.size();
    }

    public Drug save(Drug drug) {
        if(drugsStore.containsKey(drug.getId())){
            updateDrug(drug);
            return drug;
        }
            this.assigner++;
            drug.setId(Math.toIntExact(assigner));
            drugsStore.put(drug.getId(), drug);
            return drug;
        }

    public Drug findById(int id) {
        return drugsStore.get(id);
    }

    public void deleteById(int id)  {
        drugsStore.remove(id);
    }

    private void updateDrug (Drug updatedDrug){
        drugsStore.put(updatedDrug.getId(),updatedDrug);
    }
}


