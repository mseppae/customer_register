package my.sample.code.customerRegister;

import org.simpleframework.xml.*;

@Root
public class ContactInfo {
    
    private static String[] types = {};

    @Element
    private String type = "";

    @Element
    private String value = "";

    public static String[] getTypes() {
        return types;
    }

    public String getType() {
        return type;
    }

    public void setType(String aType) {
        type = aType;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String aValue) {
        value = aValue;
    }
}
