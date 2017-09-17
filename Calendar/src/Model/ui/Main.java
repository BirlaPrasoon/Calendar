package Model.ui;

import Model.DateTime.Date;

public class Main {

    public static void main(String[] args) {
        Date testDate = new Date(1,20,1998);
        System.out.println(testDate.getLongFormat());
        System.out.println(testDate.getShortFormat());
    }
}