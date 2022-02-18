package src.com.oop.employee;

public class Employee 
{
    private double salary = 0.0d;
    private int hoursOfWork = 0;     

    public Employee(double salary, int hoursOfWorkPerDay)
    {
        this.salary = salary;
        this.hoursOfWork = hoursOfWorkPerDay;
    }
    
    public double getSalary()
    {
        return salary;
    }

    public int getHoursOfWork()
    {
        return hoursOfWork;
    }

    public void addSal()
    {
       increaseSal( isSalaryLow() ? 10 : 0);
    }


    public void addWork()
    {
        increaseSal(isHoursOfWorkHigh() ? 5 : 0);
    }

    private boolean isHoursOfWorkHigh() 
    {
        return hoursOfWork > 6;
    }

    private void increaseSal(int salaryIncrease) 
    {
        salary += salaryIncrease;
    }

    private boolean isSalaryLow() 
    {
        return salary < 500;
    }
}
