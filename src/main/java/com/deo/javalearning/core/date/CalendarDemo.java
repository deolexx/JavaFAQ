package com.deo.javalearning.core.date;

import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();


        System.out.println(calendar.get(Calendar.DATE));
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));



    }
}
