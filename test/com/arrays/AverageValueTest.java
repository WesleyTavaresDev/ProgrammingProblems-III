package test.com.arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import src.com.arrays.AverageValue;

public class AverageValueTest 
{ 

    @Test
    public void shouldReturnFive()
    {
        double[] values = {1,2,3,4,5,6,7,8,9};

        assertEquals(5, AverageValue.sum(values)/values.length);
    }

    @Test
    public void shouldReturnTwo()
    {
        double[] values = {1,2,3};

        assertEquals(2, AverageValue.sum(values)/values.length);
    }
}
