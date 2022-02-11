package test.com.conditional;

import org.junit.Test;

import src.com.conditional.PositiveOrNegativeNumber;

public class PositiveOrNegativeNumberTest {
    

    @Test
    public void shouldReturnTrue()
    {
        PositiveOrNegativeNumber.isPositive(10);
        PositiveOrNegativeNumber.isPositive(Integer.MAX_VALUE);
    }

    @Test
    public void shouldReturnFalse()
    {
        PositiveOrNegativeNumber.isPositive(-5);
        PositiveOrNegativeNumber.isPositive(Integer.MIN_VALUE);
    }
}
