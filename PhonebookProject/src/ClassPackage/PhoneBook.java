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
        isPhonebookEmpty();
      contacts.remove((findByName(name)));
    }

    public void editContact(String name, String newName, String phoneNumber) {
        isPhonebookEmpty();
        findByName(name).setName(newName);
        findByName(newName).setPhoneNumber(phoneNumber);
    }

    public String findContactByName(String name) {
        isPhonebookEmpty();
        return findByName(name).toString();

    }
    public String findContactByPhoneNumber(String phoneNumber) {
        isPhonebookEmpty();
        return findByPhoneNumber(phoneNumber).toString();
    }

    public void viewContact() {
        isPhonebookEmpty();
        List<Contact> allContact = new ArrayList<>();
        for (Contact contact : contacts) {
            allContact.add(contact);
        }
        System.out.println(allContact.toString());
    }

    public void isPhonebookEmpty() {
        if(contacts.isEmpty()){
            throw new EmptyContactException("Contact list is empty");
        }
    }


















    private void validateAddContact(String name, String phoneNumber) {
        if(name.isBlank()) throw new InvalidContactException("Name cannot be blank");
        if(name.length() > 25) throw new InvalidContactException("Name cannot be greater than 25 characters");
        if(phoneNumber.isBlank()) throw new InvalidContactException("Phone number cannot be blank");
        if(phoneNumber.length() > 25) throw new InvalidContactException("Phone number cannot be greater than 25 characters");
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

