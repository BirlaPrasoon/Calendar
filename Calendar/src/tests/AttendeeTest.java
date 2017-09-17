package tests;

import Model.Entries.Attendee;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AttendeeTest {

    private Attendee testAtd;

    @Before
    public void setup(){
        testAtd = new Attendee("Prashant Nigam","prashant@gmail.com","898989898");
    }

    //todo: create a method to test all the getters
    //EFFECTS: checks for the name, email, and PhoneNumber to be the same as constructed.
    @Test
    public void testGetters(){

    }

    //todo: create a method to test all the setters
    @Test
    public void testSetters(){
        testAtd.changeName("Shubham Birla");
        testAtd.changeEmail("shubhambirla@gmail.com");
        testAtd.changePhoneNumber("9090909090");
        assertFalse(testAtd.getName().equals("Prashant Nigam"));
        assertTrue(testAtd.getEmail().equals("shubhambirla@gmail.com"));
        assertTrue(testAtd.getPhoneNumber().equals("9090909090"));
    }

}
