package my.sample.code.customerRegister;

import java.util.ArrayList;
import org.simpleframework.xml.*;

@Root
public class Address {
    private static String[] types = {"VISITING_ADDRESS", "HOME_ADDRESS"};

    @Element
    private String type;

    @ElementList(entry = "street", inline = true, required = false)
    private ArrayList<String> street;

    @Element
    private String postalCode;

    @Element
    private String town;

    public Address() {
        street = new ArrayList<String>();
    }
    
    public Address(String aStreet, String aPostalCode, String aTown, String aType) {
        street = new ArrayList<String>();
        setType(aType);
        setTown(aTown);
        setPostalCode(aPostalCode);
        setStreet(aStreet);
    }

    public Address(String aStreet, String aStreetPL, String aPostalCode, String aTown, String aType) {
        street = new ArrayList<String>();
        setType(aType);
        setTown(aTown);
        setPostalCode(aPostalCode);
        setStreet(aStreet);
        setStreet(aStreetPL);
    }

    public static String[] getTypes() {
        return types;
    }

    public void setType(String aType) {
        type = aType;
    }

    public String getType() {
        return type;
    }

    public void setTown(String aTown) {
        town = aTown;
    }

    public String getTown() {
        return town;
    }

    public void setPostalCode(String aPostalCode) {
        postalCode = aPostalCode;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setStreet(String aStreet) {
        if (aStreet != null && aStreet.length() != 0) {
            street.add(0, aStreet);
        }
    }

    public String getStreet() {
        if (!streetList().isEmpty()) {
            return streetList().get(0);
        } else {
            return "";
        }
    }

    public void setStreetPOBox(String aStreet) {
        if (aStreet != null && aStreet.length() != 0 && street.size() > 1) {
            street.add(1, aStreet);
        }
    }

    public String getStreetPOBox() {
        if (!streetList().isEmpty() && streetList().size() > 1) {
            return streetList().get(1);
        } else {
            return "";
        }
    }

    private ArrayList<String> streetList() {
        return street;
    }
}