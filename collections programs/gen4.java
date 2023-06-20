import java.util.*;
import java.lang.*;
class gf2
{

//     methodOne(ArrayList<? extends X> al)
// X -> class, we can make a call to method by passing ArrayList of X type or
// its Child type.
// X -> interface, we can make a call to method by passing ArrayList of X type
// or its Implementation class.
    public void dona2(ArrayList<? extends String>al) //==> 3rd type example of argument type parameter
    {
          Iterator it= al.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}
class Meow2
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
        gf2 f = new gf2();
        f.dona2(a);
       // ArrayList<? extends String>al= new ArrayList<Integer>(); // C.E
        ArrayList<? extends Object>al2= new ArrayList<Integer>(); //  not C.E
        ArrayList<? extends Number>al5= new ArrayList<Number>(); //  not C.E
        //ArrayList<? extends Number>al3= new ArrayList<String>(); // C.E
       // ArrayList<? extends Runnable>al7= new ArrayList<Integer>(); // C.E
       ArrayList<? extends Runnable>al4= new ArrayList<Runnable>(); // not C.E

       ArrayList<? extends Runnable>al6= new ArrayList<Thread>(); //  not C.E

        // System.out.println();
        // Iterator it= a.iterator();
        // while(it.hasNext())
        // {
        //     System.out.println(it.next());
        // }
    }
}
//==================================================================================
// Communication with non generic code
// ===============================
// To provide compatibility with old version sun people compramized the concept of
// generics in very few area's the
// following is one such area.
// Example:
// importjava.util.*;
// class Test{
// public static void main(String[] args){
// ArrayList<String> l=new ArrayList<String>();
// l.add("sachin");
// //l.add(10);//C.E:cannot find symbol,method add(int)
// methodOne(l);
// l.add(10.5);//C.E:cannot find symbol,method

// add(double)

// System.out.println(l);//[sachin, 10, dhoni, true]

// }
// public static void methodOne(ArrayList l){

// l.add(10);
// l.add("dhoni");
// l.add(true);

// }