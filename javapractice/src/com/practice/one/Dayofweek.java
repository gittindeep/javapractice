package com.practice.one;

import java.time.LocalDate;
//import java.util.Calendar;
import java.util.Scanner;

public class Dayofweek {

public static String getDay (String d, String m, String y) {
        
        
        int day = Integer.parseInt(d);
        int month = Integer.parseInt(m);
        int year = Integer.parseInt(y);
    
        LocalDate date = LocalDate.of(year, month, day);
        
        return date.getDayOfWeek().toString();
    }
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        in.close();
        
        System.out.println(getDay(day, month, year));

	}

}
