//Write a Program to Insert String and StringBuffer Objects into the TreeSet where
// Sorting Order is Increasing Length Order.
// If 2 Objects having Same Length then Consider their Alphabetical Order:
// eg: A,ABC,AA,XX,ABCE,A
// output: A,AA,XX,ABC,ABCE

import java.util.*;
import java.lang.*;
class Mycomparator1111 implements Comparator
{
    public int compare(Object obj1, Object obj2)
    {
         String s1= obj1.toString();
         String s2= obj2.toString();
         Integer i1= s1.length();
         Integer i2= s2.length();

         if(i1<i2)
            return -1;
        else if(i1>i2)
           return +1;
         else
        return i1.compareTo(i2);

    }
}


class poiiii
{
    public static void main(String[] args)
    {
        TreeSet ts = new TreeSet<>(new Mycomparator1111());
        ts.add(new StringBuffer("A"));
        ts.add(new StringBuffer("AA"));
        ts.add("ABC");
        ts.add("XX");
        ts.add("ABCE");
        ts.add("A");

        System.out.println(ts);
    }
}