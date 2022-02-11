package test.com.arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import src.com.arrays.Sum;

public class SumTest
{
    @Test
    public void shouldReturnTheSum()
    {
        int[] values = {1,2,3,4};

        assertEquals(10, Sum.sum(values));
        
        int[] values1 = {1,2,3,4,6};

        assertEquals(16, Sum.sum(values1));

        int[] values2 = {1,2,3,4, -6};
        assertEquals(4, Sum.sum(values2));
    }   
}
