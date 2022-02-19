package test.com.oop.list.sum;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.Test;

import src.com.list.sum.SumNumbers;

public class SumNumbersTest 
{
    @Test
    public void shouldReturnTenWithForLoop()
    {
        assertEquals(10, SumNumbers.forLoopSum(Arrays.asList(5, 5)));
        assertEquals(10, SumNumbers.forLoopSum(Arrays.asList(1, 2, 2, 5)));
        assertEquals(10, SumNumbers.forLoopSum(Arrays.asList(3, 5, 2)));  
    }

    @Test
    public void shouldReturnOneHundredWithWhileLoop()
    {
        assertEquals(100, SumNumbers.whileLoopSum(Arrays.asList(50, 50)));
        assertEquals(100, SumNumbers.whileLoopSum(Arrays.asList(20, 20, 20, 20, 20)));
        assertEquals(100, SumNumbers.whileLoopSum(Arrays.asList(35, 65)));
    }

    @Test
    public void shouldReturnTwentyWithRecursion()
    {
        assertEquals(20, SumNumbers.recursiveSum(Arrays.asList(4, 6, 5, 5), 4 - 1));
        assertEquals(20, SumNumbers.recursiveSum(Arrays.asList(4, 6, 0, 10), 4 - 1));
        assertEquals(20, SumNumbers.recursiveSum(Arrays.asList(-1, 20, 1, 0), 4 - 1));
    }
}
