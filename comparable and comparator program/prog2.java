// Write a Program to Insert StringBuffer Objects into the TreeSet where Sorting Order
 // is Alphabetical Order:

 import java.util.*;
import java.lang.*;
class Mycomparator111 implements Comparator
{
    public int compare(Object obj1, Object obj2)
    {
         StringBuffer i1= (StringBuffer)obj1;
         StringBuffer i2= (StringBuffer)obj2;

        return i1.compareTo(i2);

    }
}


class poiii
{
    public static void main(String[] args)
    {
        TreeSet ts = new TreeSet<>(new Mycomparator111());
        ts.add(new StringBuffer("sachin"));
        ts.add(new StringBuffer("ritu"));
        ts.add(new StringBuffer("pagal"));
        ts.add(new StringBuffer("shashank"));

        System.out.println(ts);
    }
}