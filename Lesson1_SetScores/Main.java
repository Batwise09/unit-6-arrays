package Lesson1_SetScores;


/**
 * Write a description of class Main here.
 *
 * @author - Samwise Shurtleff
 * @version - 1/20/26
 */
public class Main
{
    public static void main(String[] args)
    {
        int[] scores = {80, 95, 82, 67, 100};
        
        for (int i = 0; i < scores.length; i++)
        {
            System.out.println(scores[i]);
        }
        
        System.out.println(); //Skip line
        
        scores[2] = 72;
        scores[scores.length - 1] = 95;
        
        for (int i = 0; i < scores.length; i++)
        {
            System.out.println(scores[i]);
        }
    }
}
