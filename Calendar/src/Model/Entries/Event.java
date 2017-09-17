package Model.Entries;

import Model.DateTime.Date;
import Model.DateTime.Time;

public class Event extends Entry {

    protected String description;
    private Reminder reminder;

    //MODIFY: this
    //EFFECTS: usual constructor
     Event(String eventName, Date eventDate, Time eventTime, String description){
        super(eventName,eventDate,eventTime);
        this.description = description;
    }

    //MODIFIES: this
    //EFFECTS: changes the current description with new description
    public void changeDescription(String newDescription) {
        this.description = newDescription;
    }

    public String getDescription() {
        return description;
    }

    public void setReminder(String reminderName, Date reminderDate, Time reminderTime){
         reminder = new Reminder(reminderName,reminderDate,reminderTime);

    }

    public Reminder getReminder() {
        return reminder;
    }

    @Override
    public String getSummary(){
        return "Event: " + name + " is on " + getDate()
                + " at " + getTime() ;
    }
}
