package Model.Entries;

import Model.DateTime.Date;
import Model.DateTime.Time;

public abstract class Entry {

    protected String name;
    protected Date date;
    protected Time time;
    protected boolean isRepeating = false;

    //todo: repetition functionality not implemented properly. it needs running application
    protected int intervalOfRepetition = 0;

    // constructor that every subclass has to instantiate to set the
    //    name, date, time.
    protected Entry(String name, Date date, Time time){
        this.name = name;
        this.date = date;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    //EFFECTS: returns the date in its short format. for user preferences.
    public String getDate(){
        return date.getShortFormat();
    }

    //EFFECTS: returns the time in its 24 hour short format, for user preferences.
    public String getTime() {
        return this.time.get24HourFormat();
    }

    public boolean isRepeating(){
        return isRepeating;
    }

    public int getIntervalOfRepetition(){
        return intervalOfRepetition;
    }

    public void setRepetition(int interval){
        this.isRepeating = true;
        this.intervalOfRepetition = interval;
    }

    public void removeRepetition(){
        this.isRepeating = false;
        this.intervalOfRepetition = 0;
    }

    public void changeName(String name) {
        this.name = name;
    }

    public void changeDate(Date date) {
        this.date = date;
    }


    public void changeTime(Time time) {
        this.time = time;
    }

    //EFFECTS: returns the summary of the event including name, date, time of the event.
    public abstract String getSummary();

}
