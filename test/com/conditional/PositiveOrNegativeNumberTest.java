package test.com.conditional;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

import src.com.conditional.PositiveOrNegativeNumber;

public class PositiveOrNegativeNumberTest {
    

    @Test
    public void shouldReturnTrue()
    {
        assertTrue(PositiveOrNegativeNumber.isPositive(10));
        assertTrue(PositiveOrNegativeNumber.isPositive(Integer.MAX_VALUE));
    }

    @Test
    public void shouldReturnFalse()
    {
        assertFalse(PositiveOrNegativeNumber.isPositive(-5));
        assertFalse(PositiveOrNegativeNumber.isPositive(Integer.MIN_VALUE));
    }
}
