import java.util.*;
import java.lang.*;
 public class coll2{
    public static void main(String[] args)
    {
        List l = new LinkedList<>();//==> it implements doubly linked list data structure and implements
                                          //==> List,Dequeue interface .  
        l.add(34);
        l.add(67);
        l.add(67);
        l.add("shashank");
       // System.out.println(l);
        // Iterator it = ((LinkedList<Object>) l).descendingIterator();
        // while(it.hasNext())
        // {
        //    // Object o= it.next();
        //     System.out.println(it.next());
      l.forEach(
         rowees->{
            for (Object object : l) {
                System.out.println(object);
            }
          
         }
      );
        
        LinkedList l1= new LinkedList<>();
        l1.add("raj");
        l1.add("chiiii");
        l1.add(0, "gunda");

        l1.add(l);
        System.out.println(l1);

        
    }
}