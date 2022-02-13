package test.com.oop.person;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import src.com.oop.person.Person;
public class PersonTest 
{
    @Test
    public void shouldReturnAge()
    {
        Person beatriz = new Person(03, 07, 1981, "Beatriz");
        assertEquals(40, beatriz.calculateAge());

        Person wesley = new Person(25, 01, 2006, "Wesley");
        assertEquals(16, wesley.calculateAge());

        Person guilherme = new Person(22, 12, 1969, "Guilherme");
        assertEquals(52, guilherme.calculateAge());
    }
}
