import java.util.*;
import java.lang.*;
class employee{
    public String name;
    public int age;

    public employee(String name, int age)
    {
        this.name=name;
        this.age =age;
    }
    @Override
    public String toString()
    {
        return name+" " + age;
    }

    @Override
    public void finalize()// System.gc override the weakhashmap and it call the finalize methos of garbage collector
    {
        System.out.println("clearing the objects");
    }

}

class tanya12345{
    public static void main(String[] args)
    {
        employee e = new employee("shanky", 22);
        //employee e1 = new employee("ritu", 32);
        WeakHashMap h = new WeakHashMap<>();//==>uses hashtable as data structure and implements Map interface
        h.put(e,1);
       // h.put(2, e1);
       // System.out.println(h);

         Collection c = h.values();
         Iterator i = c.iterator();
         while(i.hasNext())
         {
            System.out.println(i.next());
         }
         e=null;
        // e1=null;

         System.gc();
    }
}