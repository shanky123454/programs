import java.util.*;
import java.lang.*;
class col3{
    public static void main(String[] args)
    {
        PriorityQueue pq = new PriorityQueue<>();//=> it uses min-heap data structure
                                                 // and implements Queue interface
        pq.add(12);
        pq.add(13);
        pq.add(45);
        System.out.println(pq.getClass());
        System.out.println(pq.size());
        System.out.println(pq);
    }
}