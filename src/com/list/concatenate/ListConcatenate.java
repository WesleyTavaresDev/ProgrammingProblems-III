package src.com.list.concatenate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ListConcatenate <T>
{
    public static void main(String[] args) 
    {
        System.out.println(concat(Arrays.asList("a", "b", "c"), Arrays.asList(1, 2, 3)));

        System.out.println(concat(Arrays.asList("Brenda", "Wesley", "Luiza"), Arrays.asList(19, 16, 5)));
    }

    public static <T> List<T> concat(List<T> base, List<T> other)
    {
        List<T> concatenatedList = Stream.concat(base.stream(), other.stream())
            .toList();
        return concatenatedList;
    }
} 
