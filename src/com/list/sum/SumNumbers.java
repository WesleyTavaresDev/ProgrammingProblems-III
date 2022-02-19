package src.com.list.sum;

import java.util.Arrays;
import java.util.List;

/**
 * //TODO ->  for-loop 
 * //TODO ->  while-loop and
 * TODO ->  recursion.
 */

public class SumNumbers
{
    public static void main(String[] args) 
    {
        System.out.println("Sum with for-loop -> " + forLoopSum( Arrays.asList(1, 2, 3, 4, 5, 6)));
        
        System.out.println("Sum with while-loop -> " + whileLoopSum(Arrays.asList(1, 2, 3, 4, 5)));
        
        List<Integer> numbers = Arrays.asList(2,2,3,3);
        System.out.println("Sum with recursion -> " + recursiveSum(numbers, numbers.size() - 1));
    }  

    public static int forLoopSum(List<Integer> numbers)
    {
        int sum = 0;
        for(Integer n : numbers)
            sum += n;
        return sum;
    }

    public static int whileLoopSum(List<Integer> numbers)
    {
        int i = 0;
        int sum = 0;
        while(i < numbers.size())
        {
            sum += numbers.get(i);
            i++;
        }

        return sum;
    }

    public static int recursiveSum(List<Integer> numbers, int number)
    {
        if(number == 0)
            return numbers.get(number);
        else
            return numbers.get(number) + recursiveSum(numbers, number - 1);
    }

}
