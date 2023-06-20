import java.util.*;
import java.lang.*;
class col8{
    public static void main(String[] args)
    {
        Vector v = new Vector<>();// ==> legacy class 
        v.add(12);
        v.add(1);
        v.add(89);
        v.add(66);
        ListIterator li =v.listIterator(v.size());
        while(li.hasPrevious())
        {
            Object o = li.previous();
            System.out.println(o);
        }

        System.out.println();

          Enumeration e=v.elements();///==> Enumeration is only present in vector 
          while(e.hasMoreElements())
          {
            System.out.println(e.nextElement());
          }

          System.out.println();

          Iterator it = v.iterator();
          while(it.hasNext())
          {
            Object o1= it.next();
            System.out.println(o1);
          }
    }
}