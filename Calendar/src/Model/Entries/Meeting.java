package Model.Entries;

import Model.DateTime.Date;
import Model.DateTime.Time;

import java.util.LinkedList;

public class Meeting extends Event {

    private String meetLocation;
    private LinkedList<Attendee> attendees = new LinkedList<>();

    public Meeting(String name, Time time, Date date, String location, String description){
        super(name,date,time,description);
        meetLocation = location;
    }

    public String getMeetLocation() {
        return meetLocation;
    }

    //EFFECTS: returns a text describing the meet containing
            // the name, date and time.
    @Override
    public String getSummary(){
        return "Meet: " + name + " is on " + getDate() + " at "
                + getTime() + " and at  "
                + meetLocation + ".";
    }

    //MODIFIES: this
    //EFFECT: replaces the current meet description with new description
    public void changeDescription(String description){
        this.description = description;
    }


    public void setMeetLocation(String newLocation) {
        this.meetLocation = newLocation;
    }


    public void addAttendee(Attendee attendee){
        attendees.add(attendee);
    }

    //EFFECTS: prints the name of all the attendees
    public void showAttendees(){
        for(Attendee attendee:attendees)
            System.out.println(attendee.getName());
    }

    //MODIFIES: this
    //EFFECTS: removes the given attendee from the list if it exists.
    public void removeAttendee(Attendee attendee){
        attendees.remove(attendee);
    }

    //MODIFIES: this
    //EFFECTS:  remove all the attendees from the list with the given name
            //  if exists.
    public void removeAttendeeWithName(String name){
        for(Attendee attendee:attendees)
            if(attendee.getName().equals(name))
                attendees.remove(attendee);
    }

    //MODIFIES: this
    //EFFECTS:  remove all the attendees from the list with the given name
            //  if exists.
    public void removeAttendeeWithEmail(String email){
        for(Attendee attendee:attendees)
            if(attendee.getEmail().equals(email))
                attendees.remove(attendee);
    }

    //EFFECTS: for all attendees in the list takes their email and sendds a message
            // including the name, date, and time and description of the event.
    public void sendInvites(){
        for (Attendee atd:attendees)
        {
            System.out.println("Dear " + atd.getName() + "\nWe " + this.name
                    + " are warmly welcoming to have you in the meeting "
            + getDescription());
        }
    }

}
