package ClassPackage;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {

    private List<Contact> contacts = new ArrayList<>();

    public void addContact(String name, String phoneNumber) {
        validateAddContact(name, phoneNumber);
        contacts.add(new Contact(name, phoneNumber));
    }

    public List<Contact> getContact() {
        return new ArrayList<>(contacts);
    }

    public void deleteContact(String name) {
      contacts.remove((findByName(name)));
    }

    public void editContact(String name, String newName, String phoneNumber) {
        findByName(name).setName(newName);
        findByName(newName).setPhoneNumber(phoneNumber);
    }

    public String findContactByName(String name) {
        return findByName(name).toString();

    }
    public String findContactByPhoneNumber(String phoneNumber) {
        return findByPhoneNumber(phoneNumber).toString();
    }





















    private void validateAddContact(String name, String phoneNumber) {
        if(name.isBlank()) throw new InvalidContactException("Name cannot be blank");
        if(phoneNumber.isBlank()) throw new InvalidContactException("Phone number cannot be blank");
    }

    private Contact findByName(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                return contact;
            }
        }
        throw new InvalidContactException("Contact with name " + name + " not found");
    }

    private Contact findByPhoneNumber(String phoneNumber) {
        for (Contact contact : contacts) {
            if (contact.getPhoneNumber().equals(phoneNumber)) {
                return contact;
            }
        }
        throw new InvalidPhoneNumberException("Contact with Phone number " + phoneNumber + " not found");
    }


}

