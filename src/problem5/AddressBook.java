package problem5;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    protected String name;

    private final List<Contact> contacts;

    public AddressBook() {
        contacts = new ArrayList<>();
    }

    // Most likely an error
    // public Contact getContact() { }

    // Getters & Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name;  }

    public Contact[] getContacts() {
        return contacts.toArray(new Contact[0]);
    }

    public void insertContact(Contact contact) {
        contacts.add(contact);
    }

    public void addContact(Contact c) {
        contacts.add(c);
    }

    public String getSummary() {
        return String.format("AddressBook (%s) has %d contacts.\n", name, contacts.size());
    }

    public Contact findByEmail(String email) {
        for (Contact c : contacts) {
            if (c.getEmailAddress().equals(email)) {
                return c;
            }
        }

        return null;
    }


}
