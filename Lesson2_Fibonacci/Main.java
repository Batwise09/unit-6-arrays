package Lesson2_Fibonacci;


/**
 * Prints Fibonacci sequence and lets you check what number is after another number (-1 if not within the array)
 *
 * @author - Samwise Shurtleff
 * @version - 1/20/26
 */
public class Main
{
    public static void main(String[] args) 
    {
      
        //number of elements to generate in the sequence
        final int MAX_TO_GENERATE = 15;
    
        // create the array to hold the sequence of Fibonacci numbers
        int[] numbers = new int[MAX_TO_GENERATE];
    
        //create the first 2 Fibonacci sequence elements
        numbers[0] = 0;
        numbers[1] = 1;
    
        //create the Fibonacci sequence and store it in int[] sequence
        for (int i = 2; i < MAX_TO_GENERATE; i++)
        {
            numbers[i] = numbers[i - 2] + numbers[i - 1];
        }
    
        //print the Fibonacci sequence numbers
        System.out.println("The first " + MAX_TO_GENERATE + " elements in the Fibonacci sequence are:"); 
        for (int i = 0; i < numbers.length; i++)
        {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println("The element after 21 is " + findNextElement(numbers, 21));
        System.out.println("The element after 233 is " + findNextElement(numbers, 233));
        System.out.println("The element after 377 is " + findNextElement(numbers, 377));
    }
      
    // This method returns the element that comes after element 'toFind'
    public static int findNextElement (int[] arr, int toFind) 
    {
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == toFind)
            {
                if (i < arr.length - 1)
                {
                    return arr[i + 1];
                }
                break;
            }
        }
        return -1;
    }
}
