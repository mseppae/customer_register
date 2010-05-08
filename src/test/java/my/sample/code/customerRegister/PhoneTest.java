package my.sample.code.customerRegister;

import my.sample.code.customerRegister.Phone;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PhoneTest {
    private Phone instance;
    private String number;
    private String[] phoneTypes = {"WORK_PHONE", "MOBILE_PHONE"};

    public PhoneTest() { }

    @Before
    public void setUp() {
        number = "+358111111111";
        instance = new Phone(phoneTypes[1], number);
    }

    @Test
    public void testPhoneTypes() {
        System.out.println("Phone should have static types: WORK_PHONE and MOBILE_PHONE.");
        assertEquals(phoneTypes, Phone.getTypes());
    }

    @Test
    public void testEmailType() {
        System.out.println("Phone should allow the insertion of a new type.");
        String newType = "TEST_PHONE";
        instance.setType(newType);
        assertEquals(newType, instance.getType());
    }

    @Test
    public void testEmailValue() {
        System.out.println("Phone should allow the insertion of a new value.");
        String newNumber = "+358999999999";
        instance.setValue(newNumber);
        assertEquals(newNumber, instance.getValue());
    }
    
}