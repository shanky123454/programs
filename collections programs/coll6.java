import java.util.*;
import java.lang.*;
class col6{
    public static void main(String[] args)
    {
            HashSet hs =new HashSet<>();//==> it uses the hashing data structure with hash
                                        //==> function and hash table and it implements set interface
            hs.add(45);
            hs.add(12);
            hs.add(89);
            hs.add(32);
    
    
            //System.out.println(hs);
           Iterator i = hs.iterator();
           while(i.hasNext())
           {
             Object o=i.next();
             System.out.println(o);
           }
    }
}