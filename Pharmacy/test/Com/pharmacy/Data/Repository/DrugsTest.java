package Com.pharmacy.Data.Repository;

import Com.pharmacy.Data.Models.Drug;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DrugsTest {

    @Test
    public void addDrugTest(){
        Drug panadol = new Drug();
        Drugs drugs = new Drugs();
        assertEquals(0,drugs.count());

        Drug savePanadol = drugs.save(panadol);
        assertEquals(1L, drugs.count());
    }

    @Test
    public void add2DrugsUpdate1Test(){
        Drug panadol = new Drug();
        Drug vitaminc = new Drug();
        Drugs drugs = new Drugs();

        assertEquals(0,drugs.count());

        Drug savePanadol = drugs.save(panadol);
        Drug saveVitaminc = drugs.save(vitaminc);
        assertEquals(2L, drugs.count());
    }

    @Test
    public void add2DrugsFind1Test(){
        Drug panadol = new Drug();
        Drug vitaminc = new Drug();

        Drugs drugs = new Drugs();

        assertEquals(0,drugs.count());

        Drug savePanadol = drugs.save(panadol);
        Drug saveVitaminc = drugs.save(vitaminc);
        assertEquals(2L, drugs.count());

        Drug foundDrug = drugs.findById(1);
        assertEquals(panadol, foundDrug);

    }

}