package Lesson2_FindIndexOfString;


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
        //Print first index of Karel
        System.out.println(MatchingString.findString("Karel"));
        
        //Print first index of Skibidi (Will be -1)
        System.out.println(MatchingString.findString("Skibidi"));
    }
}
