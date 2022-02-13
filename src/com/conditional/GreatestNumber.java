package com.conditional;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestNumber 
{   

    public static void main(String[] args)
    {    
        GreatestNumber greatestNumber = new GreatestNumber();
        List<Integer> numbers = new ArrayList<Integer>(3);

        System.out.println("Please, enter three numbers: ");    
        greatestNumber.addElements(numbers);

        System.out.println(greatestNumber.getGreatestNumber(numbers) + " is the greatest number");
    }
    
    
    public void addElements(List<Integer> numbers) 
    {
        Scanner sc = new Scanner(System.in);

        numbers.add(sc.nextInt());                
        numbers.add(sc.nextInt());        
        numbers.add(sc.nextInt());

        sc.close();
    }
    
    public int getGreatestNumber(List<Integer> numbers) 
    {
        return numbers.stream().max(Integer::compare).orElse(Integer.MAX_VALUE);
    }
}
