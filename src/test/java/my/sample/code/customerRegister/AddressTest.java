package my.sample.code.customerRegister;

import java.util.ArrayList;

import my.sample.code.customerRegister.Address;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class AddressTest {
    private Address instance;
    private String postalCode;
    private String town;
    private String streetLineOne = "Street 1";
    private String streetLineTwo = "PL 190";
    private ArrayList<String> testStreetList;
    private String[] addressTypes = {"VISITING_ADDRESS", "HOME_ADDRESS"};
    
    public AddressTest() {
    }

    @Before
    public void setUp() {
        postalCode = "80110";
        testStreetList = new ArrayList<String>();
        testStreetList.add(streetLineOne);
        testStreetList.add(streetLineTwo);
        town = "Joensuu";
        instance = new Address(streetLineOne, streetLineTwo, postalCode, town, addressTypes[1]);
    }

    @Test
    public void testGetTypes() {
        System.out.println("Address should have static types: VISITING_ADDRESS and HOME_ADDRESS.");
        String[] expResult = addressTypes;
        String[] result = Address.getTypes();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetType() {
        System.out.println("Address should allow the insertion of a new type.");
        String newType = "TEST_TYPE";
        instance.setType(newType);
        assertEquals(newType, instance.getType());
    }
    
    @Test
    public void testSetTown() {
        System.out.println("Address should allow the insertion of a new town.");
        String newTown = "Berlin";
        instance.setTown(newTown);
        assertEquals(newTown, instance.getTown());
    }

    @Test
    public void testSetPostalCode() {
        System.out.println("Address should allow the insertion of a new postal code.");
        String newPostalCode = "10000";
        instance.setPostalCode(newPostalCode);
        assertEquals(newPostalCode, instance.getPostalCode());
    }

    @Test
    public void testSetStreet() {
        System.out.println("Address should allow the insertion of a new street.");
        String newStreet = "Test street 13";
        instance.setStreet(newStreet);
        assertEquals(newStreet, instance.getStreet());
    }

    @Test
    public void testSetStreetPL() {
        System.out.println("Address should allow the insertion of a new street P.O. Box.");
        String newStreetPOBox = "PL 120";
        instance.setStreetPOBox(newStreetPOBox);
        assertEquals(newStreetPOBox, instance.getStreetPOBox());
    }

}