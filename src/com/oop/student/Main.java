package src.com.oop.student;

public class Main 
{
    public static void main(String[] args) 
    {
        Student einstein = new Student("Einstein", "Princeton");
        einstein.whoIAm();

        Student newton = new Student("Isaac Newton", "Cambridge");
        newton.whoIAm();
    }
}
