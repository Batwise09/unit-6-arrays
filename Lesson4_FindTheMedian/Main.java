package Lesson4_FindTheMedian;
import java.util.*;

/**
 * Prints the median values of arrays.
 *
 * @author - Samwise Shurtleff
 * @version - 1/23/26
 */
public class Main
{
    public static void main(String[] args)
    {
        int[] numbers1 = {12, 75, 3, 17, 65, 22};
        System.out.print("The median value of the EVEN array is " + median(numbers1));
        
        int[] numbers2 = {12, 75, 3, 17, 65, 22, 105};
        System.out.print("\nThe median value of the ODD array is " + median(numbers2));
        
    }
    
    public static double median(int[] arr)
    {
        int[] newArr = getSortedArray(arr);
        int halfIdx = arr.length / 2;
        if (arr.length % 2 != 0)
        {
            return (double) newArr[halfIdx];
        }
        else
        {
            return ((double) newArr[halfIdx - 1] + (double) newArr[halfIdx]) / 2.0;
        }
    }
    
    public static int[] getSortedArray(int[] arr)
    {
        //Make deep copy of old array
        int[] oldArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
        {
            oldArr[i] = arr[i];
        }
        
        int[] newArr = new int[arr.length];
        for (int i = 0; i < newArr.length; i++)
        {
            int lowest = oldArr[0];
            for (int num : oldArr)
            {
                if (num < lowest)
                {
                    lowest = num;
                }
            }
            for (int j = 0; j < oldArr.length; j++)
            {
                if (oldArr[j] == lowest)
                {
                    oldArr[j] = Integer.MAX_VALUE;
                }
            }
            newArr[i] = lowest;
        }
        return newArr;
    }
    
    
    
    
    
    //Debug method to see arrays
    public static void debugPrintArray(int[] arr, String name)
    {
        System.out.print(name + " ");
        for (int num : arr)
        {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    public static void debugPrintArray(int[] arr)
    {
        System.out.print("Array: ");
        for (int num : arr)
        {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
