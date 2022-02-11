package src.com.arrays;

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
