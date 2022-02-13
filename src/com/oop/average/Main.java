package src.com.oop.average;
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Average averageNumber = new Average(getNumber(), getNumber(), getNumber());
        System.out.println("Average: " + averageNumber.average());
    }    
    
    public static double getNumber()
    {
        Scanner sc = new Scanner(System.in);

        try
        {
            System.out.println("Please, digit a number: ");            
            return Double.parseDouble(sc.nextLine());
            
        }catch(NumberFormatException e){
            throw new NumberFormatException("Invalid number");
        }
        
    }
}
