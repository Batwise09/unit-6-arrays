package Lesson1_LastElement;


/**
 * Prints the last element of the test data
 *
 * @author - Samwise Shurtleff
 * @version - 1/20/26
 */
public class Main
{
    public static void main(String[] args)
    {
        // TEST DATA. DO NOT CHANGE
        double[] unitCircle = {0, 1.57, 3.14, 6.28, 7.85};
        
        System.out.println(getLastElement(unitCircle));
    }

    public static double getLastElement(double[] arr)
    {
        // Your code goes here!
        return arr[arr.length - 1];
    }
}
