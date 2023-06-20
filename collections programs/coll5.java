import java.util.*;
import java.lang.*;
class col4{
    public static void main(String[] args)
    {
        TreeSet t = new TreeSet<>();//> it uses binary search tree data structure
                                    //=> and it implements Sorted Set interface.
        t.add(12);
        t.add(12);
        t.add(3);
        t.add(78);
        t.add(99);
        System.out.println(t);
         Iterator it =t.descendingIterator();
         while(it.hasNext())
         {
            Object ob = it.hasNext();
            System.out.println(ob);
         }
        // t.removeAll(t);
        // System.out.println(t);
    }
}