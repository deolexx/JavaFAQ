package com.deo.javalearning.date;

import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        long msec = date.getTime();
        System.out.println("Msec from 1 jan 1970:"+msec);


    }

}
