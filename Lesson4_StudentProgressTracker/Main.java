package Lesson4_StudentProgressTracker;


/**
 * Write a description of class Main here.
 *
 * @author - Samwise Shurtleff
 * @version - 1/28/26
 */
public class Main
{
    public static void main (String[] args)
    {
        // Create a new Classroom object with 2 students
        Classroom room = new Classroom(2);
        
        // Create a new Student object
        Student pippin = new Student ("Peregrin", "Took", 11);
        
        // Add 3 exam scores
        pippin.addExamScore(38);
        pippin.addExamScore(24);
        pippin.addExamScore(31);
        
        // Create a second Student object
        Student vf = new Student("「V??oid", "Fiend』", 12);
        
        // Add 3 exam scores
        vf.addExamScore(44);
        vf.addExamScore(65);
        vf.addExamScore(77);
        
        // Add students to the classroom and print all students in the Classroom
        room.addStudent(pippin);
        room.addStudent(vf);
        room.printStudents();
        
        // Call getExamImprovement on both students created
        System.out.println(pippin.getName() + "'s improvement: " + pippin.getExamImprovement());
        System.out.println(vf.getName() + "'s improvement: " + vf.getExamImprovement());
        
        // Call getMostImprovedStudent on the classroom object
        System.out.println("The most improved student is " + room.getMostImprovedStudent().getName());
    }
}
