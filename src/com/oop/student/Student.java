package src.com.oop.student;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Student 
{
    private String name;

    public String associateUniversity(String name)
    {
        University studentUniversity = new University();

        return studentUniversity.defineUniversity();
    }
}
