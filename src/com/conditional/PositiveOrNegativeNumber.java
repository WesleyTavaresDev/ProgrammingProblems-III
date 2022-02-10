package src.com.conditional;

import java.util.Scanner;

public class PositiveOrNegativeNumber 
{

    public static void main(String[] args)
    {
        System.out.println("Please, enter a number -> ");
        
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if(number >= 0)
            System.out.printf("%s is a positive number", number);
        else
            System.out.printf("%s is a negative number", number);
    }    
}
