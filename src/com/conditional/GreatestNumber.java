package src.com.conditional;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
//2. Take three numbers from the user and print the greatest number.
public class GreatestNumber 
{
    public static void main(String[] args)
    {
        List<Integer> numbers = new ArrayList<Integer>(3);
        
        System.out.println("Please, enter three numbers: ");
        Scanner sc = new Scanner(System.in);

        addElements(numbers, sc);


        int greatest = 0;

        if(numbers.get(0) > numbers.get(1) && numbers.get(0) > numbers.get(2))
        {
            greatest = numbers.get(0);
        }

        else if(numbers.get(1) > numbers.get(2))
        {
            greatest = numbers.get(1);
        }

        else
        {
            greatest = numbers.get(2);
        }

        System.out.println(greatest + " is the greatest number");
    }

    private static void addElements(List<Integer> numbers, Scanner sc) {
        numbers.add(sc.nextInt());                
        numbers.add(sc.nextInt());        
        numbers.add(sc.nextInt());
    }
}
