package problem5;

public class Contact {
    protected String emailAddress;
    protected String faxNumber;
    protected String name;
    protected String primaryContactMethod;

    public Contact(String emailAddress, String faxNumber, String name, String primaryContactMethod) {
        this.emailAddress = emailAddress;
        this.faxNumber = faxNumber;
        this.name = name;
        this.primaryContactMethod = primaryContactMethod;
    }

    // Getters
    public String getEmailAddress() { return this.emailAddress; }
    public String getFaxNumber() { return this.faxNumber; }
    public String getName() { return this.name; }
    public String getPrimaryContactMethod() { return this.primaryContactMethod; }

    // Setters
    public void setEmailAddress(String emailAddress) { this.emailAddress = emailAddress; }
    public void setFaxNumber(String faxNumber) { this.faxNumber = faxNumber; }
    public void setName(String name) { this.name = name; }
    public void setPrimaryContactMethod(String primaryContactMethod) { this.primaryContactMethod = primaryContactMethod; }

    public String getEmailDomain() {
        return emailAddress.split("@")[1];
    }

    public String getContactSummary() {
        return String.format("Contact[name=%s, email=%s, fax=%s, pcm=%s]", name, emailAddress, faxNumber, primaryContactMethod);
    }
}
