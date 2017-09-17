package tests;

import Model.DateTime.Date;
import Model.DateTime.Time;
import Model.Entries.Entry;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class EntryTest {

    private class testEntry extends Entry{
        testEntry(String name, Date date, Time time) {
            super(name, date, time);
        }

        @Override
        public String getSummary() {
            return "EntryName: " + name + " on "
                    + date.getShortFormat() + " at "
                    + time.get12HourFormat();
        }
    }

    testEntry TE;

    @Before
    public void setup(){
        TE = new testEntry("test",new Date(19,2,1998),
                new Time(19,20));
    }

    //todo: create a method to test all the getters
    @Test
    public void testGetters(){
        assertTrue(TE.getSummary().equals("EntryName: test on 19/02/1998 at 07:20 PM"));
        assertTrue( ! TE.isRepeating());
        assertTrue(TE.getIntervalOfRepetition()==0);
    }

    //todo: create a method to test all the setters
    @Test
    public void testSetters(){
        TE.changeDate(new Date(12,9,2017));
        TE.changeName("test2");
        TE.changeTime(new Time(10,20));
        TE.setRepetition(10);

        assertTrue(TE.getDate().equals("12/09/2017"));
        assertTrue(TE.getName().equals("test2"));
        assertTrue(TE.getIntervalOfRepetition()==10);
        assertTrue(TE.getTime().equals("10:20"));
        assertTrue(TE.isRepeating());

        TE.removeRepetition();
        assertTrue(TE.getIntervalOfRepetition()==0);
        assertTrue( ! TE.isRepeating());
    }

}
