package Lesson4_StudentProgressTracker;


/**
 * Write a description of class Student here.
 *
 * @author - Samwise Shurtleff
 * @version - 1/23/26
 */
public class Student
{
    private String firstName;
    private String lastName;
    private int gradeLevel;
    private double gpa;
    private int[] exams;
    private int numExamsTaken = 0;
    private final int NUM_EXAMS = 4;
    
    public Student(String firstName, String lastName, int gradeLevel)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gradeLevel = gradeLevel;
        
        exams = new int[NUM_EXAMS];
        
        //Make "null" values -1
        for (int i = 1; i < exams.length; i++)
        {
            exams[i] = -1;
        }
    }
    
    public int getExamImprovement()
    {
        int improvement = 0;
        for (int i = 1; i < exams.length; i++)
        {
            if (exams[i] != -1)
            {
                improvement += exams[i] - exams[i - 1];
            }
        }
        return improvement;
    }
    
    public String getName()
    {
        return firstName + " " + lastName;
    }
    
    public void addExamScore(int score)
    {
        exams[numExamsTaken] = score;
        numExamsTaken++;
    }
    
    public void setGPA(double gpa)
    {
        this.gpa = gpa;
    }
    
    public String toString()
    {
        return this.getName() + " is in grade: " + gradeLevel;
    }
}
