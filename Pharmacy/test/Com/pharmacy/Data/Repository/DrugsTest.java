package Com.pharmacy.Data.Repository;

import Com.pharmacy.Data.Models.Drug;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DrugsTest {
    Drugs drugs;
    @BeforeEach
    void setUp() {
        drugs = new Drugs();
    }

    @Test
    public void addDrugTest(){
        Drug panadol = new Drug();
        assertEquals(0,drugs.count());

        Drug savePanadol = drugs.save(panadol);
        assertEquals(1L, drugs.count());
    }

    @Test
    public void add2DrugsUpdate1Test(){
        Drug panadol = new Drug();
        Drug vitaminC = new Drug();

        assertEquals(0,drugs.count());

        Drug savePanadol = drugs.save(panadol);
        Drug saveVitaminC = drugs.save(vitaminC);
        assertEquals(2L, drugs.count());
    }

    @Test
    public void add2DrugsFind1Test(){
        Drug panadol = new Drug();
        Drug vitaminC = new Drug();

        assertEquals(0,drugs.count());

        Drug savePanadol = drugs.save(panadol);
        Drug saveVitaminC = drugs.save(vitaminC);
        assertEquals(2L, drugs.count());

        Drug foundDrug = drugs.findById(1);
        assertEquals(panadol, foundDrug);
    }

    @Test
    public void add2drugsDelete1Test(){
        Drug panadol = new Drug();
        Drug vitaminC = new Drug();

        Drug  savePanadol = drugs.save(panadol);
        Drug  saveVitaminC = drugs.save(vitaminC);
        assertEquals(2L, drugs.count());

        drugs.deleteById(1);
        assertEquals(1L, drugs.count());
    }

    @Test
    public void addDrugsUpdateDrugTest(){
        Drug savedDrug = new Drug();
        Drug drugToUpdate = new Drug();

        savedDrug = drugs.save(savedDrug);

        drugToUpdate.setId(savedDrug.getId());
        drugToUpdate.setName("Panadol");

        drugToUpdate = drugs.save(drugToUpdate);
        assertEquals(1L, drugs.count());

        Drug foundDrug = drugs.findById(drugToUpdate.getId());

        assertEquals(1L, foundDrug.getId());

        assertEquals(1L, drugs.count());
        assertEquals("Panadol", foundDrug.getName());

    }

    @Test
    public void addDrugUpdateSecondDrugTest() {
        Drug firstDrug = new Drug();
        Drug secondDrug = new Drug();

        Drug saveDrug = drugs.save(firstDrug);
        Drug saveSecond = drugs.save(secondDrug);

        assertEquals(2L, drugs.count());

        assertEquals(2L, saveSecond.getId());

        Drug toUpdate = drugs.findById(2);
        assertEquals(2L, toUpdate.getId());
        toUpdate.setName("Panadol");

        Drug updated = drugs.save(toUpdate);
        assertEquals(2L, updated.getId());

        Drug foundDrug = drugs.findById(updated.getId());

        assertEquals("Panadol", foundDrug.getName());

        Drug findFirst = drugs.findById(saveDrug.getId());
        assertEquals(1L, findFirst.getId());
    }
}