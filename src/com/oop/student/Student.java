package src.com.oop.student;

import java.util.Scanner;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Student 
{
    private String name;
    private String university;

    public void whoIAm()
    {
        String universityAssociated = associateUniversity();
        
        System.out.println("I'm: " + name + " University: " + universityAssociated);
    }

    public String associateUniversity()
    {
        University studentUniversity = new University();
        return studentUniversity.defineUniversity(university);
    }
}
