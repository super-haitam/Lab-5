package problem5;

public class Contact {
    protected String emailAddress;
    protected String faxNumber;
    protected String name;
    protected String primaryContactMethod;

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
}
