package src.com.arrays;

public class AverageValue 
{
    public static void main(String[] args) 
    {
        double[] values = {1, 2, 3, 4, 5, 6};
        
        double averageValue = sum(values) / values.length;
        System.out.println("Average value: " + averageValue);
    }

    public static double sum(double[] values)
    {
        int sum = 0;

        for(double v : values)
            sum += v;
        return sum;
    }
}
