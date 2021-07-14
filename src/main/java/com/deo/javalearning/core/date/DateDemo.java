package com.deo.javalearning.core.date;

import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        Date date1 = new Date();
        Date date2 = new Date(System.currentTimeMillis());

        date2.setTime(System.currentTimeMillis()); //mutable object

        System.out.println(date1);
        System.out.println("Time in milli sec: "+date1.getTime());


        System.out.println(date1.after(date2));
        System.out.println(date1.compareTo(date2));

    }

}
