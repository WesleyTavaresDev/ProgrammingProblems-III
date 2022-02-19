package src.com.list.concatenate.sort;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ConcatenateSorted <T>
{
    public static void main(String[] args) 
    {
        System.out.println(concatAndSort(Arrays.asList(5,6,8), Arrays.asList(4, 7, 9)));
    }  
    
    public static <T> List<T> concatAndSort(List<T> base, List<T> other)
    {
        List<T> concatenatedList = Stream.concat(base.stream(), other.stream()).sorted().toList();
        
        return concatenatedList;
    }

}
