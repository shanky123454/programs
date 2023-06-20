import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.lang.*;
class failfastfailsafe{
    public static void main(String[] args)
    {
        ArrayList al = new ArrayList<>();
        al.add(12);
        al.add(13);
        al.add(13);
        //System.out.println(al);
        // for(int  i=0 ;i < al.size();i++)
        // {
        //     System.out.println(al.get(i));
        //     al.add(10);
        // }
      ///==>> FAIL FAST
        // Iterator it = al.iterator();
        // while(it.hasNext())
        // {
        //     System.out.println(it.next());
        //     al.add(45);
        // }
////////====>> FAIL SAFE
        CopyOnWriteArrayList cal = new CopyOnWriteArrayList<>();
            cal.add(19);
            cal.add(45);
            cal.add(99);
            cal.add(55);
            Iterator it1 = cal.iterator();
            while(it1.hasNext())
            {
                System.out.println(it1.next());
                cal.add(44);
            }
    }
}