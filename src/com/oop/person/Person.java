package src.com.oop.person;

import java.time.LocalDate;
import java.util.Calendar;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Person 
{
    private int day;
    private int month;
    private int yearOfBirth;
    private String name;

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
