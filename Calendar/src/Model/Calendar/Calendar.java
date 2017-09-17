package Model.Calendar;

import Model.Entries.Event;
import Model.Entries.Meeting;
import Model.Entries.Reminder;

import java.util.LinkedList;

public class Calendar {
    private LinkedList<Event> events = new LinkedList<>();
    private LinkedList<Meeting> meetings = new LinkedList<>();
    private LinkedList<Reminder> reminders = new LinkedList<>();

    //REQUIRE:  entry should not be null.
    //MODIFIES: this
    //EFFECTS:  depending upon the type of the entry, adds it to the proper list.
    public void addEntry(Object entry){
        if(entry==null)
            return;
        if(Meeting.class == entry.getClass()) {
            meetings.add((Meeting) entry);
            return;
        }
        if(Event.class==entry.getClass()) {
            events.add((Event) entry);
            return;
        }
        if(Reminder.class == entry.getClass())
            reminders.add((Reminder) entry);
    }

    //EFFECTS: for each entry in the list prints their summary.
    public void showAllEntries(){

        for (Event event:events)
            System.out.println(event.getDescription());

        for (Meeting meeting:meetings)
        { System.out.println(meeting.getSummary()); }
    }

    //todo:create a method to read the names of all the reminders
    //EFFECTS: prints the name of all the reminders in the reminders list
    public void printReminderNames(){
        for(Reminder rem:reminders)
            System.out.println(rem.getName());
    }


}
