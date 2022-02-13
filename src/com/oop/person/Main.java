package src.com.oop.person;

public class Main
{
    public static void main(String[] args) 
    {
        Person einstein = new Person(14, 3, 1879, "Albert Einstein");
        
        System.out.println(einstein.informName());
        System.out.println(einstein.infoAge());
        
        Person newton = new Person(4, 1, 1643, "Isaac Newton");
        System.out.println(newton.informName());
        System.out.println(newton.infoAge());
    }    
}
