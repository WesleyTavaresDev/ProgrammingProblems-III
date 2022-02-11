package test.com.arrays;

import org.junit.Test;

import src.com.arrays.ContainsValue;

public class ContainsValueTest 
{
    int[] values = {1, 2, 3, 4, 5, 6};
    @Test
    public void shouldReturnTrue()
    {

        ContainsValue.Contains(2, values);
        ContainsValue.Contains(6, values);
        ContainsValue.Contains(3, values);
    }   
    
    @Test 
    public void shouldReturnFalse()
    {
        ContainsValue.Contains(7, values);
        ContainsValue.Contains(8, values);
        ContainsValue.Contains(Integer.MAX_VALUE, values);
    }
}
