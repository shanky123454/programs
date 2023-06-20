import java.util.*;
import java.lang.*;
class col10{
    public static void main(String[] args)
    {
            TreeSet t = new TreeSet<>();//==> uses binary search tree as data structure and implements sorted set interface
            t.add(12);
            t.add(11);
            t.add(9);
            t.add(45);
            System.out.println();

        Iterator it = t.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

        System.out.println("**************************");

        //ArrayDeque ad = new ArrayDeque<>();
        LinkedList ad = new LinkedList<>();
        ad.add(88);
        ad.add(12);
        ad.add(8);
        ad.add(56);
        ad.add(12);
        ad.add(12);
       Iterator di = ad.descendingIterator();
        while(di.hasNext())
        {
            System.out.println(di.next());
        }
        int index =  Collections.binarySearch(ad, 8);
        System.out.println(index);
        Collections.shuffle(ad);
        System.out.println(ad);
        int count  =Collections.frequency(ad, 12);
        System.out.println(count);
       // System.out.println(ad);
        Collections.sort(ad);
        System.out.println(ad);
    }

}