package src.com.oop.football;

import java.time.LocalDate;
import java.util.Calendar;

public class AgeCalculator
{
    static LocalDate date = LocalDate.now();
    static Calendar today = Calendar.getInstance();

    public static int calculateAge(int dayBirth, int monthBirth, int yearBirth)
    {
        return birthdayPassed(dayBirth, monthBirth) ? getAge(yearBirth) : getAge(yearBirth) - 1;
    }

    private static int getAge(int yearBirth)
    {
        return date.getYear() - yearBirth;
    }

    private static boolean birthdayPassed(int dayBirth, int monthBirth)
    {
        return today.get(Calendar.DAY_OF_MONTH) >= dayBirth && date.getMonthValue() == monthBirth
                        || date.getMonthValue() > monthBirth;
    }
}