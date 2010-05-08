package my.sample.code.customerRegister;

import my.sample.code.customerRegister.Address;
import my.sample.code.customerRegister.Customer;
import my.sample.code.customerRegister.CustomerRegister;
import my.sample.code.customerRegister.Email;
import my.sample.code.customerRegister.Phone;
import my.sample.code.customerRegister.XMLSerializer;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class XMLSerializerTest {
    private XMLSerializer instance;
    private CustomerRegister aRegister;
    private CustomerRegister newRegister;
    private Customer aCustomer;
    private Address newAddress;
    private Phone newPhone;
    private Phone anotherPhone;
    private Email newEmail;
    private String expPostalCode;
    private String expPhoneType;
    private String expSecondPhoneType;
    private String expEmailType;
    private String expName;

    public XMLSerializerTest() {
    }

    @Before
    public void setUp() {
        expPostalCode = "10111";
        expPhoneType = "TEST_PHONE";
        expSecondPhoneType = "HOME_PHONE";
        expEmailType = "TEST_MAIL";
        expName = "John Doe";
        aRegister = new CustomerRegister();
        newRegister = new CustomerRegister();
        aCustomer = new Customer(expName, "A test user");
        newAddress = new Address("Teststreet 5", "PL 101", expPostalCode, "Test city", "TEST_ADDRESS");
        newPhone = new Phone(expPhoneType, "+491011000101010");
        anotherPhone = new Phone(expSecondPhoneType, "+491011000101020");
        newEmail = new Email(expEmailType, "test@test.mail.com");
        instance = new XMLSerializer();
        instance.setFile("test_customers.xml");
        aCustomer.addressList().add(newAddress);
        aCustomer.phoneList().add(newPhone);
        aCustomer.phoneList().add(anotherPhone);
        aCustomer.emailList().add(newEmail);
        aRegister.customerList().add(aCustomer);
    }

    @After
    public void tearDown() {
        aRegister.customerList().clear();
        newRegister.customerList().clear();
    }

    @Test
    public void testUnserializeXML() {
        System.out.println("XMLSerializer should serialize and unserializes xml correctly.");
        instance.serializeXML(aRegister);
        newRegister = instance.unserializeXML();

        Customer unserializedCustomer = newRegister.customerList().get(0);
        Address unserializedAddress = unserializedCustomer.addressList().get(0);
        Phone unserializedPhone = unserializedCustomer.phoneList().get(0);
        Phone anotherUnserializedPhone = unserializedCustomer.phoneList().get(1);
        Email unserializedEmail = unserializedCustomer.emailList().get(0);

        assertFalse(aRegister.customerList().isEmpty());
        assertEquals(expPostalCode, unserializedAddress.getPostalCode());
        assertEquals(expPhoneType, unserializedPhone.getType());
        assertEquals(expSecondPhoneType, anotherUnserializedPhone.getType());
        assertEquals(expEmailType, unserializedEmail.getType());
        assertEquals(expName, unserializedCustomer.getName());
    }

}