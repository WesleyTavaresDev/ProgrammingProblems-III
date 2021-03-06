package src.com.oop.person;

import java.time.LocalDate;
import java.util.Calendar;

public class Person 
{
    private int dayBirth;
    private int monthBirth;
    private int yearBirth;
    private String name;

    public Person(int dayBirth, int monthBirth, int yearBirth, String name) {
        this.dayBirth = dayBirth;
        this.monthBirth = monthBirth;
        this.yearBirth = yearBirth;
        this.name = name;
    }

    public String informName()
    {
        return name;
    }

    public int infoAge() 
    {
       return calculateAge();
    }

    private int calculateAge()
    {
        LocalDate date = LocalDate.now();
        Calendar today = Calendar.getInstance();

        return (birthdayPassed(date, today)) ? getAge(date) : getAge(date) - 1;
    }

    private int getAge(LocalDate date) 
    {
        return date.getYear() - yearBirth;
    }

    private boolean birthdayPassed(LocalDate date, Calendar today) 
    {
        return today.get(Calendar.DAY_OF_MONTH) >= dayBirth && date.getMonthValue() == monthBirth 
                        || date.getMonthValue() > monthBirth;
    }
}
