package tests;

import Model.Entries.Attendee;
import Model.Entries.Meeting;

import Model.DateTime.*;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class MeetingTest {
    Meeting testMeet;
    String testMeetSummary;

        //TODO:                    PLEASE   COMPLETE   TESTING


    @Before
    public void setup(){
        testMeet = new Meeting("First Meeting",new Time(12,59),
                new Date(12,9,2017),"LNMIIT",
                "Just about Java");
        testMeet.addAttendee(new Attendee("Prasoon Birla","prasoonbirla@gmail.com",
                                    "9080908090"));
        testMeet.addAttendee(new Attendee("Prashant Nigam","prashantnigam@gmail.com",
                                    "9090909090"));
        String testMeetSummary = "Meet: " + testMeet.getName() + " is on " + testMeet.getDate()
                + " at " + testMeet.getTime() + " and at  "
                + testMeet.getMeetLocation() + ".";
        testMeet.setReminder("testReminder",
                                new Date(12,9,2017),
                                new Time(12,59));
        testMeet.setRepetition(1);
    }


    //todo: create a test method to test all getters of a Meeting.
    @Test
    public void testGetters(){

        assertTrue(testMeet.getDate().equals("12/09/2017"));
        assertTrue(testMeet.getSummary().equals(testMeetSummary));
        assertTrue(testMeet.getMeetLocation().equals("LNMIIT"));

    }

}
