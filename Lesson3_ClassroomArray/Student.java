package Lesson3_ClassroomArray;


/**
 * A Student has a name and grade level
 *
 * @author - Samwise Shurtleff
 * @version - 1/22/26
 */
public class Student
{
    String firstName;
    String lastName;
    int gradeLevel;
    
    public Student(String firstName, String lastName, int gradeLevel)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gradeLevel = gradeLevel;
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public String getLastName()
    {
        return lastName;
    }
    
    public int getgradeLevel()
    {
        return gradeLevel;
    }
    
    public String toString()
    {
        return "Grade " + gradeLevel + ": " + firstName + " " + lastName;
    }
}
