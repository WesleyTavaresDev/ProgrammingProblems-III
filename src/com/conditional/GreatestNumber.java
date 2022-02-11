package src.com.conditional;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestNumber 
{   
    List<Integer> numbers = new ArrayList<Integer>(3);
    public static void main(String[] args)
    {    
        GreatestNumber greatestNumber = new GreatestNumber();

        System.out.println("Please, enter three numbers: ");    
        greatestNumber.addElements();

        System.out.println(greatestNumber.getGreatestNumber() + " is the greatest number");
    }
    
    
    private  void addElements() 
    {
        Scanner sc = new Scanner(System.in);

        numbers.add(sc.nextInt());                
        numbers.add(sc.nextInt());        
        numbers.add(sc.nextInt());

        sc.close();
    }
    
    private  int getGreatestNumber() 
    {
        return numbers.stream().max(Integer::compare).orElse(Integer.MAX_VALUE);
    }
}
