package src.com.oop.student;

import java.util.Scanner;

/**
 * TODO -> create a field called name;
 * TODO -> Create a method to define the university;
 */
public class University 
{
    enum universities {Harvard, Cambridge, USP};

    universities university;

    private String name = "";

    public String getName()
    {
        return name;
    }

    public String defineUniversity()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please, choose a university: [Harvard, Cambridge, Usp]");
        
        switch (sc.next()) 
        {
            case "Harvard" -> university = universities.Harvard;
             
            case "Cambridge" -> university = universities.Cambridge;

            case "USP" -> university = universities.USP;

            default -> throw new Error("Invalid name");
        }

        name = university.toString();

        return university.toString();
    }
}
