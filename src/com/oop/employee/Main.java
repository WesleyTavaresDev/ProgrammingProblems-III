package src.com.oop.employee;

public class Main 
{
   public static void main(String[] args) 
   {
       Employee employee = new Employee(400, 8);

       System.out.printf("Salary now -> %s %n", employee.getSalary());
       
       employee.addSal();
       System.out.printf("Salary now -> %s %n", employee.getSalary());
   
        employee.addWork();
        System.out.printf("Salary now -> %s %n", employee.getSalary());
    } 
}
