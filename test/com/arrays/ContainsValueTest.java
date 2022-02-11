package test.com.arrays;

import org.junit.Test;

import src.com.arrays.ContainsValue;

public class ContainsValueTest 
{
    int[] values = {1, 2, 3, 4, 5, 6};
    @Test
    public void shouldReturnTrue()
    {

        ContainsValue.contains(2, values);
        ContainsValue.contains(6, values);
        ContainsValue.contains(3, values);
    }   
    
    @Test 
    public void shouldReturnFalse()
    {
        ContainsValue.contains(7, values);
        ContainsValue.contains(8, values);
        ContainsValue.contains(Integer.MAX_VALUE, values);
    }
}
