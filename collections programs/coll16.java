import java.util.*;
import java.lang.*;
class kia{
    int i ;
    public kia(int i)
    {
        this.i =i ;
    }
    public String toString()
    {
        return i+"";
    }
}
class kii{
    public static void main(String[] args)
    {
        Hashtable ht = new Hashtable<>();//==>uses hashtable as data structure and implements Map interface
        ht.put(1,"shanky");
        ht.put(2, "ritu");
        System.out.println(ht);

        Hashtable ht1 = new Hashtable<>();
        ht1.put(new kia(10), "paglu");
        ht1.put(new kia(20), "pagla");

        System.out.println(ht1);

    }
}