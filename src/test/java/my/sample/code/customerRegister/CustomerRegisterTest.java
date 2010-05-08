package my.sample.code.customerRegister;

import java.util.ArrayList;

import my.sample.code.customerRegister.Customer;
import my.sample.code.customerRegister.CustomerRegister;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CustomerRegisterTest {
    private CustomerRegister instance;
    private ArrayList<Customer> testCustomerList;

    public CustomerRegisterTest() { }

    @Before
    public void setUp() {
        instance = new CustomerRegister();
        testCustomerList = new ArrayList<Customer>();
    }

    @After
    public void tearDown() { }

    @Test
    public void testCustomerList() {
        System.out.println("CustomerRegister should have a list of customers.");
        assertEquals(testCustomerList, instance.customerList());
    }

}