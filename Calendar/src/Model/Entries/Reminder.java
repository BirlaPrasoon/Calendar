package Model.Entries;

import Model.DateTime.Date;
import Model.DateTime.Time;

import java.util.Scanner;

public class Reminder extends Entry {

    private String notes;

        Reminder(String rNname, Date rDate, Time rTime){
            super(rNname,rDate,rTime);
        }

    public void addNotes(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Notes: ");
         notes = sc.next();
    }

    public String getNotes() {
        return notes;
    }

    @Override
    public String getSummary(){
        return "Reminder for " + name + " is on " + date.getShortFormat()
                + " at " + time.get12HourFormat() ;
    }

}
