import java.util.*;
import java.lang.*;
class col7{
    public static void main(String[] args)
    {
        LinkedHashSet hs =new LinkedHashSet<>();//==> it uses the hashing data structure with hash
                        //==> function and hash table and it implements set interface
        hs.add(23);// Autoboxing happens hs.add(new Integer(23))
        hs.add(45);
        hs.add(12);
        hs.add(4);
        Iterator it = hs.iterator();
        {
             while(it.hasNext())
             {
                Object obj = it.next();
                System.out.println(obj);
             }   
        }
    }

}