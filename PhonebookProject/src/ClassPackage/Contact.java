package ClassPackage;

public class Contact {
    private Name myName;
    private String phoneNumber;

    public Contact(String firstName, String lastName, String phoneNumber) {
        this.myName = new Name(firstName, lastName);
        this.phoneNumber = phoneNumber;
    }
    public void setName(Name name) {
        this.myName = name;
    }

    public String getName() {
        return myName.toString();
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;

    }

}
