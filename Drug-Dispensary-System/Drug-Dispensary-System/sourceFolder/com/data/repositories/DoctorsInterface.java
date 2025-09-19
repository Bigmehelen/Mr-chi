package com.DrugDispenser.data.repositories;

import com.DrugDispenser.data.models.Doctor;

public interface DoctorsInterface {
    Doctor save(Doctor doctor);
    Doctor findById(String id);
    Doctor deleteById(String id);
    Doctor existById(Doctor doctor);
}
