package com.oop.person;

import java.time.LocalDate;
import java.util.Calendar;
/**
 * TODO -> Create a constructor;
 * TODO -> Create test with Junit5;
 * TODO -> Commit;
 * TODO -> Start to refact;
 */
public class Person 
{
    int age;
    int day;
    int month;
    int yearOfBirth;
    String name;
  
    public Person(int age, int day, int month, int year, String name)
    {
        this.age = age;
        this.day = day;
        this.month = month;
        this.yearOfBirth = year;
        this.name = name;
    }

    static int calculateAge(int day, int month, int year)
    {
        LocalDate date = LocalDate.now();
        Calendar today = Calendar.getInstance();

        if(today.get(Calendar.DAY_OF_MONTH) >= day && date.getMonthValue() == month || date.getMonthValue() > month)
        {
            return date.getYear() - year;
        }
        else
            return date.getYear() - year - 1;
    }
}
