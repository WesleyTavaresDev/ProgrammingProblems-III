package src.com.oop.student;

/**
 * TODO -> create a field called name;
 * TODO -> Create a method to define the university;
 */
public class University 
{
    enum universities {Harvard, Cambridge, USP, Princeton};

    universities university;

    private String name = "";

    public String getName()
    {
        return name;
    }

    public String defineUniversity(String universityName)
    {
        
        switch (universityName) 
        {
            case  "Harvard"  -> university  = universities.Harvard;
             
            case "Cambridge" -> university  = universities.Cambridge;

            case    "USP"    -> university  = universities.USP;

            case "Princeton" -> university  = universities.Princeton;

            default -> throw new Error("Invalid name");
        }

        name = university.toString();

        return university.toString();
    }
}
