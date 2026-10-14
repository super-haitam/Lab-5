package problem5;

import java.util.ArrayList;
import java.util.List;

public class Account {
    protected String emailAddress;
    protected String name;

    private final List<AddressBook> addressBooks;

    public Account() {
        addressBooks = new ArrayList<>();
    }

    // Getters
    public String getEmailAddress() { return emailAddress; }
    public String getName() { return name; }

    // Setters
    public void setEmailAddress(String emailAddress) { this.emailAddress = emailAddress; }
    public void setName(String name) { this.name = name; }

    public AddressBook[] getAddressBooks() {
        return addressBooks.toArray(new AddressBook[0]);
    }

    public void addAddressBook(AddressBook book) {
        addressBooks.add(book);
    }

    public void printAllContactDomains() {
        System.out.println("Contact Domains:");

        for (AddressBook ab : addressBooks) {
            Contact[] contacts = ab.getContacts();
            System.out.printf("\tAddress Book (%s)\n", ab.getName());

            for (Contact c : contacts) {
                System.out.printf("\t\tContact (%s) : %s\n", c.getName(), c.getEmailDomain());
            }
        }
    }

    public String getFullName() {
        return name;
    }
}
