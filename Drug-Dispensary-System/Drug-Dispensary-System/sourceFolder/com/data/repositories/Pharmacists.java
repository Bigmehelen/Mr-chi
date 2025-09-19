package com.DrugDispenser.data.repositories;

import com.DrugDispenser.data.models.Pharmacist;

public interface Pharmacists {
    Pharmacist save(Pharmacist pharmacist);
    Pharmacist findById(String id);
    Pharmacist deleteById(String id);
    Pharmacist existById(Pharmacist pharmacist);


}
