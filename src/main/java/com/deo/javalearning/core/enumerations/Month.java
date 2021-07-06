package com.deo.javalearning.core.enumerations;

public enum Month {
    January(30),February(28),March(31);

    private  final int days;

    Month(int n){
        days = n;
    }


   public int getDays() {
        return days;
   }

}
