import java.util.*;
import java.lang.*;
class gf3
{
//     methodOne(ArrayList<? super X> al)
// X -> class, we can make a call to method by passing ArrayList of X type or
// its super class
// X -> interface, we can make a call to method by passing ArrayList of X type
// or its super class of implementation class of x.
    public void dona3(ArrayList<? super Runnable>al) //==> 4th type example of argument type parameter
    {
          Iterator it= al.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
class Meow3
{
    public static void main(String[] args)
    {
        //ArrayList<String> a = new ArrayList<String>();// C.E
        ArrayList a = new ArrayList<>();
        a.add(5.0f);
        a.add(10.0f);
        a.add(12);
        a.add(55.0);
        a.add('a');
        a.add("shashank");
        gf3 f = new gf3();
        f.dona3(a);

        // ArrayList<? super String>al= new ArrayList<Integer>(); // C.E
      // ArrayList<? super Object>al2= new ArrayList<Integer>(); //   C.E
       ArrayList<? super Number>al5= new ArrayList<Number>(); //  not C.E
       ArrayList<? super Number>al8= new ArrayList<Object>();//not C.E
      // ArrayList<? super Number>al3= new ArrayList<String>(); // C.E
        //ArrayList<? super Runnable>al7= new ArrayList<Integer>(); // C.E
        ArrayList<? super Runnable>al4= new ArrayList<Runnable>(); // not C.E
       // ArrayList<? super Runnable>al6= new ArrayList<Thread>(); //  C.E
    //     // System.out.println();
        // Iterator it= a.iterator();
        // while(it.hasNext())
        // {
        //     System.out.println(it.next());
        // }
    }
}