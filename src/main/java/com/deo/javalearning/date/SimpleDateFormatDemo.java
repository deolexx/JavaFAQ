package com.deo.javalearning.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
    public static void main(String[] args) {
        Date date = new Date();


        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        //parse the date to string
        String dateString = dateFormat.format(date);
        System.out.println(dateString);


        //parse the date back from string
        try {
            Date parseDate = dateFormat.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
