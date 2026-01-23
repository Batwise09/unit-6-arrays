package Lesson4_StudentProgressTracker;


/**
 * Write a description of class Student here.
 *
 * @author - Samwise Shurtleff
 * @version - 1/23/26
 */
public class Student
{
    String firstName;
    String lastName;
    int gradeLevel;
    double gpa;
    int[] exams;
    int numExamsTaken = 0;
    final int NUM_EXAMS = 4;
    
    
    public Student(String firstName, String lastName, int gradeLevel)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gradeLevel = gradeLevel;
        
        exams = new int[NUM_EXAMS];
    }
    
    public int getExamImprovement()
    {
        int improvement = 0;
        for (int i = 1; i < exams.length; i++)
        {
            improvement += exams[i] - exams[i - 1];
        }
        return improvement;
    }
    
    public String getName()
    {
        return firstName + " " + lastName;
    }
    
    public void addExamScore(int score)
    {
        
    }
}
