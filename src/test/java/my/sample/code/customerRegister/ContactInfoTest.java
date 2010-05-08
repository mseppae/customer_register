package my.sample.code.customerRegister;

import my.sample.code.customerRegister.ContactInfo;

import org.junit.Test;
import static org.junit.Assert.*;

public class ContactInfoTest {

    public ContactInfoTest() { }
    
    @Test
    public void testGetTypes() {
        System.out.println("ContactInfo should not have any static types set.");
        String[] expResult = {};
        assertEquals(expResult, ContactInfo.getTypes());
    }
}