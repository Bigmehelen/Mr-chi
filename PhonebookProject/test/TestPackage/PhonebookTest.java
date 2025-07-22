package TestPackage;

import ClassPackage.EmptyPhonebookException;
import ClassPackage.Phonebook;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PhonebookTest {
    @Test
    public void phonebookCanIsEmptyTest(){
        Phonebook myPhonebook = new Phonebook();
        myPhonebook.createContact("wande","helen","08088406240");
        assertEquals("wande helen",myPhonebook.findContactByName("wande helen").getName());
    }



}
