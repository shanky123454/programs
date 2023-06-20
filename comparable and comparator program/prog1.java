//Write a Program to Insert String Objects into the TreeSet where the Sorting Order
// is of Reverse of Alphabetical Order:

import java.util.*;
import java.lang.*;
class Mycomparator11 implements Comparator
{
    public int compare(Object obj1, Object obj2)
    {
        String i1= (String)obj1;
        String i2= (String)obj2;

        return -i1.compareTo(i2);

    }
}


class poii
{
    public static void main(String[] args)
    {
        TreeSet ts = new TreeSet<>(new Mycomparator11());
        ts.add("sachin");
        ts.add("ritu");
        ts.add("shashank");
        ts.add("chacha");

        System.out.println(ts);
    }
}