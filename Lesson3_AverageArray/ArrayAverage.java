package Lesson3_AverageArray;


/**
 * Holds an array of ints and can return the average
 *
 * @author - Samwise Shurtleff
 * @version - 1/22/26
 */
public class ArrayAverage
{
    int[] numbers;
    public ArrayAverage(int[] numbers)
    {
        this.numbers = numbers;
    }
    
    public double findAverage()
    {
        int total = 0;
        
        for (int num : numbers)
        {
            total += num;
        }
        double doubleTotal = total;
        return  doubleTotal /= (double) numbers.length;
    }
}
