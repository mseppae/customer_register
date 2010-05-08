package my.sample.code.customerRegister;

import org.simpleframework.xml.*;

@Root
public class Email extends ContactInfo {
    private static String[] types = {"WORK_EMAIL", "PRIVATE_EMAIL"};

    public Email() { }

    public Email(String aType, String aValue) {
        setType(aType);
        setValue(aValue);
    }
    
    public static String[] getTypes() {
        return types;
    }
}