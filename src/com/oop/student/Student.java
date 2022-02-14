package src.com.oop.student;

public class Student 
{
    private String name;
    private String university;


    public Student(String name, String university) {
        this.name = name;
        this.university = university;
    }

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
