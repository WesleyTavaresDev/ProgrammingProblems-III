package com.oop.person;

import java.time.LocalDate;
import java.util.Calendar;
/**
 * //TODO -> Create a constructor;
 * //TODO -> Create a main class;
 * TODO -> Create test cases with Junit5;
 * TODO -> Commit;
 * TODO -> Start to refact;
 */
public class Person 
{
    int day;
    int month;
    int yearOfBirth;
    String name;
  
    public Person(int day, int month, int year, String name)
    {
        this.day = day;
        this.month = month;
        this.yearOfBirth = year;
        this.name = name;
    }

    public int calculateAge()
    {
        LocalDate date = LocalDate.now();
        Calendar today = Calendar.getInstance();

        if(today.get(Calendar.DAY_OF_MONTH) >= day && date.getMonthValue() == month || date.getMonthValue() > month)
        {
            return date.getYear() - yearOfBirth;
        }
        else
            return date.getYear() - yearOfBirth - 1;
    }
}
