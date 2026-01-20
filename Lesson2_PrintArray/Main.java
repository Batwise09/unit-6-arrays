package Lesson2_PrintArray;


/**
 * Prints each entry in order of arrays and displays index value
 *
 * @author - Samwise Shurtleff
 * @version - 1/20/26
 */
public class Main
{
    public static void main(String[] args)
    {
        // TEST DATA. DO NOT CHANGE
        String[] arr1 = new String[]{"w", "x", "y", "z"};
        printArr(arr1);
        
        // TEST DATA. DO NOT CHANGE
        String[] arr2 = new String[]{"a", "b", "c"};
        printArr(arr2);
    }
    
    public static void printArr(String[] arr)
    {
        // Print everything in the array on its own line
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(i + ". " + arr[i]);
        }
    }
}
