package Lesson1_OurFirstArray;


/**
 * Creates data of three cities' populations and the least amount of daily sun they can get.
 *
 * @author - Samwise Shurtleff
 * @version - 1/20/26
 */
public class Main
{

    public static void main(String[] args)
    {
        // Create the 3 arrays here
        String[] cities = {"Las Vegas", "Minsk", "Sao Paulo"};
        int[] populations = {667501, 2038822, 12330000};
        double[] sunshine = {8.11, 1.36, 6.05};
        // Print all 3 arrays according to the output in the description
        for (int i = 0 ; i < cities.length; i++)
        {
            System.out.println(cities[i] + "'s population is " + populations[i] + ".");
        }
        
        for (int i = 0 ; i < cities.length; i++)
        {
            System.out.println("The least amount of sunshine " + cities[i] + " gets is " + sunshine[i] + ".");
        }
    }
}
