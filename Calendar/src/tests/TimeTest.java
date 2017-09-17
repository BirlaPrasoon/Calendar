package tests;

import Model.DateTime.Time;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class TimeTest {
    private Time testTime = new Time(12,59);

    //todo: create a method to test the time formats
    @Test
    public void testTimeFormats(){
        assertTrue(testTime.get12HourFormat().equals("00:59 PM"));
        assertTrue(testTime.get24HourFormat().equals("12:59"));
        testTime = new Time(1,23);
        assertTrue(testTime.get12HourFormat().equals("01:23 AM"));
    }
}
