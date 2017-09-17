package Model.DateTime;

public class Date {
    private int day;
    private int month;
    private int year;

    //REQUIRE: day    ->  should be within 1 and 31
            // month  ->  should be within 1 and 12
            // year   ->  should be within 1980 and 2100
    public Date(int day, int month, int year){
        if(year<1980 || year>2100)
            throw new IllegalArgumentException("argument year: " + year + ", not in [1980, 2100]");
        if(month<1||month>12)
            throw new IllegalArgumentException("argument month: " + month + ", not in [1, 12]");
        if(day>31 || day<1)
            throw new IllegalArgumentException("argument day: "+ day +", not in [1, 31]");

            this.day = day;
            this.month = month;
            this.year = year;
        }

        //EFFECTS: returns - DD/MM/YYYY format
        public String getShortFormat(){

            if(day<10 && month<10)
                return "0" + day + "/" + "0" + month + "/" + year;
            if(day<10)
                return "0" + day + "/" + month + "/" + year;
            if(month<10)
                return day + "/" + "0" + month + "/" + year;

            return day + "/" + month + "/" + year;
        }

        //EFFECTS: returns - DD-MonthName-YYYY format
        public String getLongFormat(){
                    return day + getDateOrdinal(day) + "-" + getMonthName(month) + "-" + year;
        }

        //EFFECTS: taking the day number returns the ordinal according to the day number
        private String getDateOrdinal(int day){
            String ordinal;
            switch(day){
                case 1: ordinal = "st";
                    break;
                case 2: ordinal = "nd";
                    break;
                case 3: ordinal = "rd";
                    break;
                default: ordinal = "th";
                    break;
            }
            return ordinal;
        }

        //EFFECTS: taking the month number returns the month name
        private String getMonthName(int month){

            String monthName = null;
            switch(month){
                case 1: monthName = "January";
                    break;
                case 2: monthName = "February";
                    break;
                case 3: monthName = "March";
                    break;
                case 4: monthName = "April";
                    break;
                case 5: monthName = "May";
                    break;
                case 6: monthName = "June";
                    break;
                case 7: monthName = "July";
                    break;
                case 8: monthName = "August";
                    break;
                case 9: monthName = "September";
                    break;
                case 10: monthName = "October";
                    break;
                case 11: monthName = "November";
                    break;
                case 12: monthName = "December";
                    break;
            }
            return monthName;
        }
}

