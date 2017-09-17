package tests;

import Model.DateTime.Date;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class DateTest {

    private Date testDate = new Date(12,9,2017);

    //todo: create a method to test the methods long form, short form date
    @Test
    public void testDateFormats(){
        assertTrue(testDate.getShortFormat().equals("12/09/2017"));
        assertTrue(testDate.getLongFormat().equals("12th-September-2017"));
        testDate = new Date(1,2,1998);
        assertTrue(testDate.getLongFormat().equals("1st-February-1998"));
    }

}
