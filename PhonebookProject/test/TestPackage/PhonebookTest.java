package TestPackage;

import ClassPackage.EmptyContactException;
import ClassPackage.InvalidContactException;
import ClassPackage.PhoneBook;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PhonebookTest{

    PhoneBook phoneBooks;

    @BeforeEach
    public void setup(){
        phoneBooks = new PhoneBook();
    }
    @Test
    public void phonebookCanAddContactTest(){
        phoneBooks.addContact("wande helen", "08088406240");
        assertEquals(1, phoneBooks.getContact().size());
    }

    @Test
    public void phonebookCanViewContactTest(){
        phoneBooks.addContact("wande helen", "08088406240");
        phoneBooks.addContact("olamide ola", "08030591425");
        assertEquals(2, phoneBooks.getContact().size());

    }

    @Test
    public void phonebookCanDeleteContactTest(){
        phoneBooks.addContact("wande helen", "08088406240");
        phoneBooks.addContact("olamide ola", "08030591425");
        assertEquals(2, phoneBooks.getContact().size());

        phoneBooks.deleteContact("wande helen");
        assertEquals(1, phoneBooks.getContact().size());
    }

    @Test
    public void phonebookCanEditContactTest(){
        phoneBooks.addContact("wande", "08088406240");
        phoneBooks.addContact("olamide ola", "08030591425");
        phoneBooks.addContact("lizzy", "08030591461");
        assertEquals("wande 08088406240", phoneBooks.findContactByName("wande"));
        assertEquals(3, phoneBooks.getContact().size());

        phoneBooks.editContact("lizzy", "paul", "08088406241");
        assertEquals("paul 08088406241", phoneBooks.findContactByName("paul"));
    }

    @Test
    public void phonebookCanFindContactByPhoneNumberTest(){
        phoneBooks.addContact("wande helen", "08088406240");
        phoneBooks.addContact("olamide ola", "08030591425");
        phoneBooks.addContact("lizzy", "08030591461");
        assertEquals(3, phoneBooks.getContact().size());

        phoneBooks.editContact("lizzy", "lizzy jacob", "08030591461");
        assertEquals("lizzy jacob 08030591461", phoneBooks.findContactByPhoneNumber("08030591461"));
    }

    @Test
    public void phonebookCanThrowExceptionIfNameNotFoundTest(){
        phoneBooks.addContact("wande helen", "08088406240");
        phoneBooks.addContact("olamide ola", "08030591425");
        assertEquals(2, phoneBooks.getContact().size());

        phoneBooks.deleteContact("wande helen");
        assertThrows(InvalidContactException.class, () -> phoneBooks.findContactByName("wande helen"));
    }

    @Test
    public void phonebookCanUpdateContactByPhoneNumberTest(){
        phoneBooks.addContact("wande helen", "08088406240");
        phoneBooks.addContact("olamide ola", "08030591425");
        assertEquals(2, phoneBooks.getContact().size());

        phoneBooks.editContact("wande helen","wande helen","08030591460");
        assertEquals("wande helen 08030591460", phoneBooks.findContactByName("wande helen"));
    }

    @Test
    public void phonebookCanThrowException_NameSaveWithWhiteSpaceTest() {
        assertThrows(InvalidContactException.class, () -> phoneBooks.addContact(" ", "08088406240"));
    }

    @Test
    public void phonebookCanThrowException_NameIsLongerThan25CharacterTest() {
        assertThrows(InvalidContactException.class, () -> phoneBooks.addContact("wandelicious Papaya In The Building", "080884062400808840624012345"));
    }

    @Test
    public void phonebookCanThrowException_IfUserAttemtptToEditAnEmptyContactTest() {
        assertThrows(EmptyContactException.class, () -> phoneBooks.editContact("Abolaji", "Abiola", "08148260470"));
    }
}