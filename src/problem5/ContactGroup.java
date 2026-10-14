package problem5;

import java.util.ArrayList;
import java.util.List;

public class ContactGroup {
    protected String name;

    private final List<Contact> contactList;

    // For the parent - child relationship
    private ContactGroup parent;
    private final List<ContactGroup> children = new ArrayList<>();

    public ContactGroup(String name) {
        contactList = new ArrayList<>();
        this.name = name;
    }

    // Getters & Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    // For the parent - child relationship
    public void addChild(ContactGroup child) {
        children.add(child);
        child.parent = this;
    }

    // Getters & Setters
    public ContactGroup getParent() { return parent; }
    public ContactGroup[] getChildren() { return children.toArray(new ContactGroup[0]); }

    public void addContact(Contact c) {
        contactList.add(c);
    }

    public String buildGroupReport() {
        StringBuilder sb = new StringBuilder("ContactGroup Report:\n");

        for (Contact c : contactList) {
            sb.append("\t").append(c.getContactSummary()).append("\n");
        }

        return sb.toString();
    }
}
