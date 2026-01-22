package Lesson3_AverageArray;


/**
 * I have created an array of integers and shall get the average using the ArrayAverage class.
 *
 * @author - Samwise Shurtleff
 * @version - 1/22/26
 */
public class Main
{
    public static void main(String[] args)
    {    
        int[] numbers = {16, 82, 47, 35, 73};
        for (int num : numbers)
        {
            System.out.print(num + " ");
        }
        System.out.println();
        // Create an ArrayAverage object and print the result 
        ArrayAverage avg = new ArrayAverage(numbers);
        System.out.print("The average is: " + avg.findAverage());
    }
}
