package test.com.oop.football;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import src.com.oop.football.AgeCalculator;

public class AgeCalculatorTest
{
    @Test
    public void shouldReturn19()
    {
        assertEquals(19, AgeCalculator.calculateAge(02, 8, 2002));
    }    

    @Test
    public void shouldReturn13()
    {
        assertEquals(13, AgeCalculator.calculateAge(25, 01, 2009));
    }

    @Test
    public void shouldReturn4()
    {
        assertEquals(4, AgeCalculator.calculateAge(04, 01, 2018));
    }

    @Test
    public void shouldReturn20()
    {
        assertEquals(20, AgeCalculator.calculateAge(14, 03, 2001));
    }
}
