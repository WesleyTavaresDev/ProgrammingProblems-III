package test.com.conditional;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import src.com.conditional.GreatestNumber;

public class GreatestNumberTest 
{
    GreatestNumber greatestNumber;

    @Before
    public void instance()
    {
        greatestNumber = new GreatestNumber();
    }

    @Test
    public void shouldReturnTheGreatestNumber()
    {
        List<Integer> numbers = new ArrayList<Integer>();
        
        numbers.add(200);
        numbers.add(37);
        numbers.add(98);
        numbers.add(500);
        numbers.add(54);
        numbers.add(6);
        numbers.add(7);

        assertEquals(500, greatestNumber.getGreatestNumber(numbers));
    }
    
}
