// All Wrapper classes(Interger,Float,Char,Byte,Float,Double,Short,Boolean,String,StringBuilder,StringBuffer)implement comparable interface .
// If we are Depending on Default Natural Sorting Order Compulsory Objects should be
// Homogeneous and Comparable.
// Otherwise we will get RE: ClassCastException.
// An object is said to be Comparable if and only if corresponding class implements
// Comparable interface.
// All Wrapper Classes, String Class Already Implements Comparable Interface.
// Wheneverwe are Depending on Default Natural Sorting Order and if we are trying to
// Insert Elements then Internally JVM will
// Call compareTo() to IdentifySorting Order.
//==================================================================================
// @FunctionalInterface
// public interface Comparable<T> {
//     public abstract int compareTo(T);
//     }

//==============================================================
// Comparable (I):
// Comparable Interface Present in java.lang Package and it contains Only One Method
// compareTo().

// obj1.compareTo(obj2)

// |=> returns -ve value, if obj1 has to come before obj2
// |=> returns +ve value, if obj1 has to come after obj2
// |=> returns 0 value, if both obj1 and obj2 are equal

//===============================================================
import java.util.*;
import java.lang.*;

 class comp
{
    public static void main(String[] args)
    {
        TreeSet t1= new TreeSet<>();
        t1.add(12);// first element so directly it will become root no compareTo() method will be invoked.
        t1.add(34);// e1.compareTo(e2)==== 34.compareTo(12)
        t1.add(11);// e1.compareTo(e2)==== 11.compareTo(12) and 11.compareTo(34)
        t1.add(5);// e1.compareTo(e2)==== 5.compareTo(12) and 5.compareTo(34)==== 5.compareTo(11)

        System.out.println(t1);// 5,11,12,34
    }
}