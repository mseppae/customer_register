package my.sample.code.customerRegister;

import my.sample.code.customerRegister.Email;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class EmailTest {
    private Email instance;
    private String testEmail;
    private String[] emailTypes = {"WORK_EMAIL", "PRIVATE_EMAIL"};
    
    public EmailTest() { }

    @Before
    public void setUp() {
        testEmail = "test@test.com";
        instance = new Email(emailTypes[1], testEmail);
    }

    @Test
    public void testEmailTypes() {
        System.out.println("Email should have static types: WORK_EMAIL and PRIVATE_EMAIL.");
        assertEquals(emailTypes, Email.getTypes());
    }

    @Test
    public void testEmailType() {
        System.out.println("Email should allow the insertion of a new type.");
        String newType = "TEST_TYPE";
        instance.setType(newType);
        assertEquals(newType, instance.getType());
    }

    @Test
    public void testEmailValue() {
        System.out.println("Email should allow the insertion of a new value.");
        String newValue = "new@test.com";
        instance.setValue(newValue);
        assertEquals(newValue, instance.getValue());
    }

}