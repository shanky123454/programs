import java.util.*;
import java.lang.*;
class col{
    public static void main(String[] args)
    {
        ArrayList al = new ArrayList();// it implements dynamic array data structure
                                       // and implements List interface.
        al.add(13);
        al.add("string");
        al.add("shashank");
        al.add(13);
        al.add(3, "raj");
        Collections.sort(al);
        System.out.println(al);
        ArrayList al1 = new ArrayList<>();
        al1.add("srrr");
        al1.add(45);
        al1.add(0, 99);
        System.out.println(al1);
        al1.addAll(al);
        System.out.println(al1);
        

    }
}