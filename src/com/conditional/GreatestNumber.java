package src.com.conditional;

import java.util.Scanner;
//2. Take three numbers from the user and print the greatest number.
public class GreatestNumber 
{
    public static void main(String[] args)
    {
        int[] numbers = new int[3];

        System.out.println("Please, enter three numbers: ");
        Scanner sc = new Scanner(System.in);
    
        for(int i = 0; i < numbers.length; i++)
        {
            numbers[i] = sc.nextInt();
        }

        int greatest = 0;
        if(numbers[0] > numbers[1] && numbers[0] > numbers[2])
        {
            greatest = numbers[0];
        }

        else if(numbers[1] > numbers[2])
        {
            greatest = numbers[1];
        }

        else
        {
            greatest = numbers[2];
        }

        System.out.println(greatest + "is the greatest number");
    }
}
