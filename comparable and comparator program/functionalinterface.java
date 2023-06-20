import java.util.*;
import java.lang.*;
import java.util.function.*;



//====>>> 1ST Method(normal method)
// class amit implements Predicate<Integer>
// {
//   public boolean Test(Integer i)
//   {
//     if(i>10)
//     {
//         return true;
//     }

//     else
//     return false;
//   }
// }
// class modi
// {
//     public static void main(String[] args)
//     {
//     amit a =  new amit();
//    System.out.println(a.Test(50));
//     System.out.println(a.Test(4));
//     }
// }   
//===========================================================================

//==============>>>>> 2ND Method
// public interface java.util.function.Predicate<T> {
//     public abstract boolean test(T);
//==============================================================
// default methods available as utility methods for developer
// ===============================================
// public default Predicate<T> and(Predicate p);
// public defualt Predicate<T> negate();
// public default Predicate<T> or(Predicate p);
//=====================================================
// class modi{
//     public static void main(String[] args)
//     {
//         Predicate<Integer> p = x-> x>10;
//         System.out.println(p.test(50));
//         System.out.println(p.test(4));
//     }
// }

//=============================================================================

class modi implements Predicate<Integer>
{
    public static void m1(Predicate<Integer> p,int[] arr)
    {
            for (int i : arr) {
              if(p.test(i))
                System.out.println(i);
            }
    }
    public static void main(String[] args)
    {
        int[] arr = {0,5,10,15,20,25,30};
        System.out.println("elements greater than 10:");

        Predicate<Integer> p1 = i-> i>10;
      m1(p1,arr);

      

      System.out.println("elements smaller than 20 :");
      Predicate<Integer> p2 = x->x<20;
      m1(p2,arr);

      System.out.println("elements smaller than 20 :");
      Predicate<Integer> p5 = x->x<20;
      m1(p5,arr);

      System.out.println("elements which are even number:");
      Predicate<Integer> p3 = y->y%2==0;
      m1(p3,arr);

      System.out.println("elements greater than 10 and even numbers:");
      m1(p1.and(p3),arr);
      
      System.out.println("elements greater than 10 or even number");
      m1(p1.or(p3),arr);
        
      System.out.println("elements which are odd");
      m1(p3.negate(),arr);

      System.out.println("is equal");
       System.out.println(p2.equals(p5));
    }
}