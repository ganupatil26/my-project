package com.java8;

import java.time.LocalDate;

public class DateAndTime {
    public static void main(String[] args) {

        // Current Date
        LocalDate today = LocalDate.now();
        System.out.println("Today Date:" + today);

        // Custom Date
        LocalDate customDate = LocalDate.of(2006, 4, 5);
        System.out.println("Custom Date: " + customDate);

        // year month date 
        System.out.println("local and current compare " + customDate.compareTo(today));
        System.out.println("year : "+today.getYear());
        System.out.println("Month: " + today.getMonth());
        System.out.println("Day: " + today.getDayOfMonth());
        System.out.println("current month days:-"+today.lengthOfMonth());
        System.out.println("curret month value :-"+today.getMonthValue());
        System.out.println("current year is leap or not :-"+today.isLeapYear());
        System.out.println("current day of week:-"+today.getDayOfWeek());
        System.out.println("cuurent month :-"+today.getMonth());
        System.out.println("++++++++++++++++++");
        
    }
}