package ClassPackage;

import java.util.ArrayList;
import java.util.List;

public class Phonebook {
    private List<Contact> contacts = new ArrayList<Contact>();

    public void createContact(String firstName, String lastName, String phoneNumber) {
        contacts.add(new Contact(firstName, lastName, phoneNumber));
    }

    public Contact findContactByName(String name) {
        for (Contact contact : contacts) {
            if(contact.getName().equals(name)) {
                return contact;
            }
        }
        throw new InvalidNameException("Contact with name " + name + " not found");
    }

    private String validateName(String name) {
        for (Contact contact : contacts) {
            if(!contact.getName().equals(name)) {
                return "Contact with name " + name + " not found";
            }
        }
        throw new InvalidNameException("Contact with name " + name + " not found");
    }
}
