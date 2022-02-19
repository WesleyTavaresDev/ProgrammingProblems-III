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
}
