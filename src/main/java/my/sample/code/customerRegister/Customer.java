package my.sample.code.customerRegister;

import java.util.ArrayList;
import org.simpleframework.xml.*;

@Root
@Namespace(reference="http://www.arcusys.fi/customer-example")
public class Customer {
    @Element
    private String name = "";

    @Element
    private String note = "";

    @ElementList(required = false, inline = true)
    private ArrayList<Address> addresses;

    @ElementList(required = false, inline = true)
    private ArrayList<Phone> phones;

    @ElementList(required = false, inline = true)
    private ArrayList<Email> emails;

    public Customer() {
        addresses = new ArrayList<Address>();
        phones = new ArrayList<Phone>();
        emails = new ArrayList<Email>();
    }

    public Customer(String aName, String aNote) {
        setName(aName);
        setNote(aNote);
        addresses = new ArrayList<Address>();
        phones = new ArrayList<Phone>();
        emails = new ArrayList<Email>();
    }

    public void setName(String aName) {
        name = aName;
    }

    public String getName() {
        return name;
    }

    public void setNote(String aNote) {
        note = aNote;
    }
    public String getNote() {
        return note;
    }

    public ArrayList<Address> addressList() {
        return addresses;
    }

    public ArrayList<Phone> phoneList() {
        return phones;
    }

    public ArrayList<Email> emailList() {
        return emails;
    }
}