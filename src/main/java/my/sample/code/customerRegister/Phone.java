package my.sample.code.customerRegister;

import org.simpleframework.xml.*;

@Root
public class Phone extends ContactInfo {
    private static String[] types = {"WORK_PHONE", "MOBILE_PHONE"};

    public Phone() { }

    public Phone(String aType, String aValue) {
        setType(aType);
        setValue(aValue);
    }

    public static String[] getTypes() {
        return types;
    }
}
