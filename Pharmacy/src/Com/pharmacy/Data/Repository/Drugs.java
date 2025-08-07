package Com.pharmacy.Data.Repository;

import Com.pharmacy.Data.Models.Drug;

import java.util.ArrayList;
import java.util.List;

public class Drugs {
    private int id;
    private Long count = 0L;
    private List<Drug> drugsList = new ArrayList<>();

    public Long count() {
        return(long) drugsList.size();
    }

    public Drug save(Drug panadol) {
        panadol.setId(id++);
        drugsList.add(panadol);
        return panadol;
    }

    public Drug findById(int id) {
        for(Drug value : drugsList){
            if(value.getId() == id){
                return value;
            }
        }
        return null;
    }
}
