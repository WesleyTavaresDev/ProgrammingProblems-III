package src.com.list.sum;

import java.util.Arrays;
import java.util.List;

/**
 * TODO ->  for-loop 
 * TODO ->  while-loop and
 * TODO ->  recursion.
 */

public class SumNumbers
{
    public static void main(String[] args) 
    {
       System.out.println("Sum with for-loop -> " + forLoopSum( Arrays.asList(1, 2, 3, 4, 5, 6)));
    }  

    private static int forLoopSum(List<Integer> numbers)
    {
        int sum = 0;
        for(Integer n : numbers)
            sum += n;
        return sum;
    }

}
