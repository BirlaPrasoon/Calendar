package Model.DateTime;

public class Time {
    private int minute;
    private int hour;

    //REQUIRE:  time should be in [0, 24]
            //  and min should be in [00,60]
    public Time(int hour,int min){

        if(min<0 ||min>59)
            throw new IllegalArgumentException("argument minute:" + min + " not in [0, 59]");
        if(hour<0||hour>24)
            throw new IllegalArgumentException("argument hour:" + hour + " not in [0, 23]");

        this.minute = min;
        this.hour = hour;
    }

    //EFFECTS: returns the time in 12 hour format with correct meridium
    public String get12HourFormat(){
        if(hour<12) {
            if (hour < 10)
                return "0" + hour + ":" + minute + " AM";
            return hour + ":" + minute + " AM";
        }
        else{
                int remHour = hour % 12;
            if(remHour < 10)
                return "0" + remHour + ":" + minute + " PM";
            return remHour + ":" + minute + " PM";
        }
    }

    //EFFECTS: returns the time in a 24 hour format
    public String get24HourFormat(){
        return hour + ":" + minute;
    }
}
