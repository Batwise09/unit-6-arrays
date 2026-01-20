package Lesson1_SnapShot;


/**
 * Displays the splash screen for Snap Shot
 *
 * @author - Samwise Shurtleff
 * @version - 1/20/26
 */
public class Main
{
    public static void main(String[] args)
    {
        String[] lines = 
        {
            "Welcome",
            "to",
            "the snap shot",
            "app!",
        };
        
        for (int i = 0; i < lines.length; i++)
        {
            System.out.println(lines[i]);
        }
        
        System.out.println();
        
        lines[0] = "Upgrade";
        lines[lines.length - 1] = "premium app!";
        
        for (int i = 0; i < lines.length; i++)
        {
            System.out.println(lines[i]);
        }
    }
}
