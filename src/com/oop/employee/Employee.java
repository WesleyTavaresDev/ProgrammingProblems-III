package src.com.oop.employee;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Employee 
{
    private double salary = 0.0d;
    private int hoursOfWork = 0;     


    public void addSal()
    {
       increaseSal( isSalaryLow() ? 10 : 0);
    }

    public void addWork()
    {
        increaseSal(isHoursOfWorkHigh() ? 5 : 0);
    }

    private void increaseSal(int salaryIncrease) 
    {
        salary += salaryIncrease;
    }

    private boolean isSalaryLow() 
    {
        return salary < 500;
    }

    private boolean isHoursOfWorkHigh() 
    {
        return hoursOfWork > 6;
    }
}
