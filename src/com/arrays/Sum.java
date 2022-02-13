package com.arrays;

public class Sum
{
    public static void main(String[] args)
    {
        int[] values = {1, 2, 3, 4};
        
        System.out.printf("Sum of arrays values: %s \n", sum(values));
    }

    public static int sum(int[] values)
    {
        int sum = 0;
        for(int v : values)
            sum += v;
        return sum;
    }
}
