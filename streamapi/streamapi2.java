import java.util.stream.*;
import java.util.*;
import java.lang.*;
// javap java.util.stream.Stream;
// javap java.util.stream.*;
class cat{
    public static void main(String[] args)
    {
        Stream s1 = Stream.of(1,2,3,4,5,6);
        s1.forEach(System.out :: println);

        Integer[] i = {1,2,3,4,5,6};
        Stream s2 = Stream.of(i);
        s2.forEach(System.out :: println);
    }
}