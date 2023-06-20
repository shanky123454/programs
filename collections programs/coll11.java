import java.util.*;
import java.lang.*;
class tanya{

    public static void main(String[] args)
    {
        HashMap hm = new HashMap<>();//==> uses hashtable as a data structure and implements Map interface
        hm.put("1", "shanky");
        hm.put("2", "ritu");
        hm.put("3", "paglu");
        hm.put("4", "pagal");    

        System.out.println(hm);
        System.out.println("********************************");
            Set set = hm.entrySet();
        Iterator it = set.iterator();
        while(it.hasNext())
        {
            // Map.Entry entry = ((Map.Entry)it.next());
            // System.out.println("id=" + entry.getKey() + " " + "value=" +" " +entry.getValue());
            System.out.println(it.next());
        }
        System.out.println("******************");

        Set s1= hm.keySet();
        Iterator it1= s1.iterator();
        while(it1.hasNext())
        {
            // Integer i = (Integer)it1.next();
            // System.out.println(i);

            String i = (String)it1.next();
            System.out.println(i);
          // System.out.println(it1.next());
        }

        System.out.println("******************");

        Collection s2= hm.values();
        Iterator it2= s2.iterator();
        while(it2.hasNext())
        {
            // String s= (String)it2.next();
            // System.out.println(s);
            System.out.println(it2.next());
        }

       
    }
}