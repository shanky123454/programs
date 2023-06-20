import java.util.*;
import java.lang.*;
class col2{
    public static void main(String[] args)
    {
        ArrayDeque dq= new ArrayDeque<>();//=> it uses double ended queue data structure and implements
                                          //=> Dequeue interface 
        dq.add(5);
        dq.add(6);
      

        System.out.println(dq.contains(5));
        System.out.println(dq);
        ArrayDeque dq1 = new ArrayDeque<>();
        dq1.add(122);
        dq1.add(34);
        System.out.println(dq1);
        System.out.println(dq.containsAll(dq1));

    }

}