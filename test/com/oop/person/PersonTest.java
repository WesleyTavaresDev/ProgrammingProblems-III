package test.com.oop.person;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

import src.com.oop.person.Person;
public class PersonTest 
{
    Person beatriz;
    Person wesley;
    Person guilherme;

    @Before
    public void instantiate()
    {
        beatriz = new Person(03, 07, 1981, "Beatriz");
        wesley = new Person(25, 01, 2006, "Wesley");
        guilherme = new Person(22, 12, 1969, "Guilherme");
    }

    @Test
    public void shouldReturnAge()
    {
        
        assertEquals(40, beatriz.infoAge());

        
        assertEquals(16, wesley.infoAge());

        
        assertEquals(52, guilherme.infoAge());
    }

    @Test
    public void shouldReturnName()
    {
        
        assertEquals("Beatriz", beatriz.informName());

        assertEquals("Wesley", wesley.informName());

        assertEquals("Guilherme", guilherme.informName());
        
    }
}
