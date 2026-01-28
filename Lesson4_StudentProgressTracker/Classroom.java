package Lesson4_StudentProgressTracker;


/**
 * Write a description of class Classroom here.
 *
 * @author - Samwise Shurtleff
 * @version - 1/28/26
 */
public class Classroom
{
    private Student[] students;
    private int numStudentsAdded;
    public Classroom(int numStudents)
    {
        students = new Student[numStudents];
        numStudentsAdded = 0;
    }
    
    public Student getMostImprovedStudent()
    {
        Student mostImproved = students[0];
        for (Student pupil : students)
        {
            if (pupil != null)
            {
                if (pupil.getExamImprovement() > mostImproved.getExamImprovement())
                {
                    mostImproved = pupil;
                }
            }
        }
        return mostImproved;
    }
    
    public void addStudent(Student pupil)
    {
        students[numStudentsAdded] = pupil;
        numStudentsAdded++;
    }
    
    public void printStudents()
    {
        for (Student pupil : students)
        {
            if (pupil != null)
            {
                System.out.println(pupil);
            }
        }
    }
}
