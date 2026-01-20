package Lesson3_PrintOdds;


/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{

    public static void main(String[] args)
    {
        int[ ] values = {17, 34, 56, 2, 19, 100};
        
        for (int i = 0; i < values.length; i++)
        {
            if (values[i] % 2 == 1)
            {
                System.out.println(values[i] + " is odd");
            }
        }
    }
}
