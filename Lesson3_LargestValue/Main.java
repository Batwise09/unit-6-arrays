package Lesson3_LargestValue;


/**
 * Write a description of class Main here.
 *
 * @author - Samwise Shurtleff
 * @version - 1/22/26
 */
public class Main
{
    public static void main(String[] arg) 
    { 
        { 
            int[] values = {32, 56, 79, 2, 150, 37}; 
              
            int highestValue = findMax(values); 
            System.out.println("The highest score is " + highestValue); 
        } 
    } 
    
    public static int findMax(int[] numbers) 
    {  
        int maxSoFar = numbers[0];
        
        // for each loop to rewrite as for loop 
        for (int i = 0; i < numbers.length; i++)  
        { 
            if (numbers[i] > maxSoFar) 
            { 
                maxSoFar = numbers[i];
            } 
        } 
        
        return maxSoFar; 
    } 
}
