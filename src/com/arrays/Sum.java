package src.com.arrays;


//1.Write a Java program to sum values of an array.
public class Sum
{
    public static void main(String[] args)
    {
        int[] values = {1, 2, 3, 4};

        int sum = 0;
        for(int v : values)
            sum += v;
        

        System.out.printf("Sum of arrays values: %s \n", sum);
    }
}
