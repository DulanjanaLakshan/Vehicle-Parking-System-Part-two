package Model;

public class Driver {

     private String Name;
     private String NIC;
     private String LNumber;
     private String Address;
     private String Contact;

    public Driver() {
    }

    public Driver(String name, String NIC, String LNumber, String address, String contact) {
        setName(name);
        this.setNIC(NIC);
        this.setLNumber(LNumber);
        setAddress(address);
        setContact(contact);
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getNIC() {
        return NIC;
    }

    public void setNIC(String NIC) {
        this.NIC = NIC;
    }

    public String getLNumber() {
        return LNumber;
    }

    public void setLNumber(String LNumber) {
        this.LNumber = LNumber;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String contact) {
        Contact = contact;
    }
}
