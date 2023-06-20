// Comparator(I)
// ============
// Note: If we are Not satisfied with Default Natural Sorting Order OR if Default
// Natural Sorting Order is Not Already Available then
// we can Define Our Own Sorting by using Comparator Object.
//==================================================================

// public interface java.util.Comparator<T> {
// public abstract int compare(T, T);
// public abstract boolean equals(java.lang.Object);
// }
// public int compare(Object obj1, Object obj2);
// Returns –ve if and Only if obj1 has to Come Before obj2.
// Returns +ve if and Only if obj1 has to Come After obj2.
// Returns 0 if and Only if obj1 and obj2 are Equal.
//==================================================================
// public boolean equals(Object o);
// Whenever we are implementing Comparator Interface Compulsory we should
// Provide Implementation for compare().
// Implementing equals() is Optional because it is Already Available to Our
// Class from Object Class through Inheritance.
//=====================================================================

import java.util.*;
import java.lang.*;
class Mycomparator implements Comparator
{
        public int compare(Object obj1, Object obj2)
        {
            Integer i1= (Integer)obj1;
            Integer i2= (Integer)obj2;
           if(i1>i2)                               
           return -1;
           else if(i1<i2)
           return +1;
           else
           return 0;
        }
}
class Comparatorsss 
{
    public static void main(String[] args)
    {
    TreeSet st = new TreeSet<>(new Mycomparator()); // line-1
    st.add(12);
    st.add(15);
    st.add(20);
    st.add(5);
    st.add(0);
    st.add(10);

    System.out.println(st);//customize sorting order in descending order
    }
}

// ====================================================================
// At Line 1 if we are Not Passing Comparator Object as an Argument then Internally
// JVM will Call compareTo(),
// Which is Meant for Default Natural Sorting Order (Ascending Order).

// In this Case the Output is [0, 5, 10, 15, 20].
// At Line 1 if we are Passing Comparator Object then JVM will Call compare() Instead
// of compareTo().
// Which is Meant for Customized Sorting (can be Ascending /Descending Order).
// In this Case the Ouput is [20, 15, 10, 5, 0]