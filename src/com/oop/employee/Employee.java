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

    public void addSal()
    {
        if(salary < 500)
            salary += 10;
    }

    public void addWork()
    {
        if(hoursOfWork > 6)
            salary += 5;
    }
}
