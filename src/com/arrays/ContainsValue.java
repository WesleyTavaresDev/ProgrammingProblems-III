package src.com.arrays;

public class ContainsValue 
{
    public static void main(String[] args) 
    {
        int[] values = {1,5,6,8};

        System.out.println(Contains(5, values));
    }

    public static boolean Contains(int value, int[] values)
    {
        boolean contains = false;

        for(int v : values)
        {
            if(value == v)
            {
                contains = true;
                break;
            }
        }

        return contains;
    }
}
