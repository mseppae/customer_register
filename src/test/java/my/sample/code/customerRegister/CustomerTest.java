package my.sample.code.customerRegister;

import java.util.ArrayList;

import my.sample.code.customerRegister.Address;
import my.sample.code.customerRegister.Customer;
import my.sample.code.customerRegister.Email;
import my.sample.code.customerRegister.Phone;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CustomerTest {
    private Customer instance;
    private ArrayList<Address> testAddressList;
    private ArrayList<Phone> testPhoneList;
    private ArrayList<Email> testEmailList;

    public CustomerTest() { }

    @Before
    public void setUp() {
        testAddressList = new ArrayList<Address>();
        testPhoneList = new ArrayList<Phone>();
        testEmailList = new ArrayList<Email>();
        instance = new Customer();
    }

    @Test
    public void testSetName() {
        System.out.println("Customer should allow the insertion of a new name.");
        String newName = "Doe John";
        instance.setName(newName);
        assertEquals(newName, instance.getName());
    }

    @Test
    public void testSetNote() {
        System.out.println("Customer should allow the insertion of a new note.");
        String newNote = "Test customer. Edited notes.";
        instance.setNote(newNote);
        assertEquals(newNote, instance.getNote());
    }

    @Test
    public void testAddressList() {
        System.out.println("Customer should have many addresses.");
        assertEquals(testAddressList, instance.addressList());
    }

    @Test
    public void testPhoneList() {
        System.out.println("Customer should have many phones.");
        assertEquals(testPhoneList, instance.phoneList());
    }

    @Test
    public void testEmailList() {
        System.out.println("Customer should have many emails.");
        assertEquals(testEmailList, instance.emailList());
    }

}