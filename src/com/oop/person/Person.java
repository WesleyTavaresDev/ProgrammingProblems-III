package src.com.oop.person;

import java.time.LocalDate;
import java.util.Calendar;
/**
 * //TODO -> Create a constructor;
 * //TODO -> Create a main class;
 * //TODO -> Create test cases with Junit5;
 * //TODO -> Commit;
 * TODO -> Start to refact:
 *       //TODO -> decompose conditional (Calculate Age) 
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

        return (birthdayPassed(date, today)) ? getAge(date) : getAge(date) - 1;
    }

    private int getAge(LocalDate date) 
    {
        return date.getYear() - yearOfBirth;
    }

    private boolean birthdayPassed(LocalDate date, Calendar today) 
    {
        return today.get(Calendar.DAY_OF_MONTH) >= day && date.getMonthValue() == month || date.getMonthValue() > month;
    }
}
