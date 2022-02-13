package com.arrays;

public class ContainsValue 
{
    public static void main(String[] args) 
    {
        int[] values = {1,5,6,8};

        System.out.println(contains(5, values));
    }

    public static boolean contains(int value, int[] values)
    {
        boolean contains = false;

        for(int v : values)
        {
            if(value == v)
            {
                contains = true;
                break;
            }
        }

        return contains;
    }
}
