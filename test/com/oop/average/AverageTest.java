package test.com.oop.average;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import src.com.oop.average.Average;

public class AverageTest 
{
    @Test
    public void shouldReturnFive()
    {
        Average returnFive = new Average(5, 6, 4);
        assertEquals(5.0, returnFive.average());
    }

    @Test
    public void shouldReturnSeven()
    {
        Average returnSeven = new Average(7,7,7);
        assertEquals(7.0, returnSeven.average());
    }
}
